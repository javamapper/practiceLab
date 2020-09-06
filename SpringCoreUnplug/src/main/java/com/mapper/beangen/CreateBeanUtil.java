package com.mapper.beangen;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.cglib.beans.BeanGenerator;
import org.springframework.cglib.core.NamingPolicy;
import org.springframework.cglib.core.Predicate;

public class CreateBeanUtil {
	private List<String> lines;
	private List<String> colmList;
	private Map<String, Class<?>> headerMap;
	private Path path;
	private Class<?> beanCls;
	private String className;

	private CreateBeanUtil() {

	}

	public static CreateBeanUtil newInstance() {
		return new CreateBeanUtil();
	}

	/**
	 * @return
	 */
	public CreateBeanUtil createBeanClass() {
		final BeanGenerator bg = new BeanGenerator();
		bg.setNamingPolicy(new NamingPolicy() {
			@Override
			public String getClassName(String prefix, String source, Object key, Predicate names) {
				return className;
			}
		});
		BeanGenerator.addProperties(bg, this.headerMap);
		beanCls = (Class<?>) bg.createClass();
		return this;
	}

	/**
	 * @param str
	 * @return
	 */
	public CreateBeanUtil init(String str) {
		try {
			path = Paths.get(str);
			lines = Files.lines(path).collect(Collectors.toList());
			// ReflectionUtils.
		} catch (IOException e) {
			e.printStackTrace();
		}
		colmList = new ArrayList<String>();
		String header = null;
		for (int i = 0; i < lines.size(); i++) {
			if (i == 0) {
				className = lines.get(i);
			} else if (i == 1) {
				header = lines.get(i);
			} else {
				colmList.add(lines.get(i));
			}
		}
		List<String> headerList = Arrays.asList(header.split(","));
		headerMap = new LinkedHashMap<>();
		headerList.stream().forEach(colm -> {
			String[] split = colm.split(":");
			try {
				headerMap.put(split[0], Class.forName("java.lang." + split[1]));
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		return this;
	}

	public <T extends Object> T getObjectBean(Class<T> clzz) {
		try {
			return clzz.cast(clzz.newInstance());
		} catch (InstantiationException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * @param collector
	 */
	public void fillDataFromFile(List<Object> collector) {
		colmList.forEach(line -> collector.add(buildObject(null,line)));
	}

	public Object fillObject(Object obj,String line) {
		return buildObject(obj,line);
	}
	public Object buildObject(final Object obj1,String line) {
		String[] values = line.split(",");
		try {
			final Object obj=obj1!=null?obj1:beanCls.newInstance();
			headerMap.entrySet().stream().forEach(entry -> {
				try {
					beanCls.getMethod(setterName(entry.getKey()), entry.getValue()).invoke(obj,getTransformVal(entry.getValue(), values));
				} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException
						| InvocationTargetException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			});
			return obj;
		} catch (InstantiationException | IllegalAccessException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		return null;
	}

	/**
	 * @param <T>
	 * @param objList
	 */
	public <T extends Object> void printData(List<Object> objList) {

		objList.stream().forEach(obj -> {
			headerMap.entrySet().stream().forEach(field -> {
				try {
					Method method = beanCls.getMethod(getterName(field.getKey()));
					Object val = method.invoke(obj);
					System.out.println(field.getValue().cast(val));
				} catch (IllegalAccessException | InvocationTargetException | SecurityException
						| IllegalArgumentException | NoSuchMethodException ee1) {
					// TODO Auto-generated catch block
					ee1.printStackTrace();
				}
			});
		});
	}

	/**
	 * @param <T>
	 * @param clzz
	 * @param values
	 * @return
	 */
	public <T extends Object> T getTransformVal(Class<T> clzz, String[] values) {
		Object[] valuesClasses = headerMap.values().toArray();
		int i = 0;
		for (i = 0; i < valuesClasses.length; i++) {
			if (valuesClasses[i].equals(clzz)) {
				break;
			}
		}
		if (clzz == Integer.class) {
			return clzz.cast(Integer.valueOf(values[i]));
		} else if (clzz == Double.class) {
			return clzz.cast(Double.valueOf(values[i]));
		} else if (clzz == Float.class) {
			return clzz.cast(Float.valueOf(values[i]));
		} else if (clzz == Boolean.class) {
			return clzz.cast(Boolean.valueOf(values[i]));
		} else {
			return clzz.cast(values[i]);
		}
	}

	public CreateBeanUtil setBeanClass(Class<?> beanCls) {
		this.beanCls = beanCls;
		return this;
	}

	@SuppressWarnings("unchecked")
	public <T extends Object> T buildObjectBean() {
		this.buildHeaderMap();
		return (T) beanCls.cast(this.getObjectBean(beanCls));
	}

	public CreateBeanUtil buildHeaderMap() {
		this.buildHeaderMap(beanCls);
		return this;
	}

	public CreateBeanUtil buildHeaderMap(Class<?> clzz) {
		Field[] declaredFields = clzz.getDeclaredFields();
		this.setClassName(clzz.getName());
		headerMap = new LinkedHashMap<String, Class<?>>();
		for (int i = 0; i < declaredFields.length; i++) {
			Field field = declaredFields[i];
			headerMap.put(field.getName(), field.getType());
		}
		return this;
	}

	/**
	 * @param fieldName
	 * @return
	 */
	public static String getterName(String fieldName) {
		return "get" + fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1);
	}

	/**
	 * @param fieldName
	 * @return
	 */
	public static String setterName(String fieldName) {
		return "set" + fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1);
	}

	public List<String> getColmList() {
		return colmList;
	}

	public void setColmList(List<String> colmList) {
		this.colmList = colmList;
	}

	public Map<String, Class<?>> getHeaderMap() {
		return headerMap;
	}

	public void setHeaderMap(Map<String, Class<?>> headerMap) {
		this.headerMap = headerMap;
	}

	public Class<?> getBeanCls() {
		return beanCls;
	}

	public void setBeanCls(Class<?> beanCls) {
		this.beanCls = beanCls;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}
}
