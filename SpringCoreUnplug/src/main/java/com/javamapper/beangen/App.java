package com.javamapper.beangen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.cglib.beans.BeanGenerator;

/*
 * Hello world!
 *
 */
public class App {

	public static void main(String[] args) throws ClassNotFoundException {
		BeanGenerator bg = new BeanGenerator();
		CreateBeanUtil fileExtractor = CreateBeanUtil.newInstance().init("src/main/resources/objectDataWithMeta.txt").createBeanClass();
		List<Object> collectList=new ArrayList<Object>();
		fileExtractor.fillDataFromFile(collectList);
		fileExtractor.printData(collectList);
		System.out.println(collectList.get(0));

		//Let me create a object with defined class
		CreateBeanUtil customerBeanUtil = CreateBeanUtil.newInstance().setBeanClass(Customer.class);
		Customer customer = customerBeanUtil.buildObjectBean();
		customerBeanUtil.buildObject(customer,"101,\"Anil Kumar\",5000.00");
		System.out.println(customer);
		
		//Another requirement : creating list of objects
		List<String> objectDataStr = Arrays.asList("401,\"Anil\",5000.00",
				"402,\"Sunil\",3000.00",
				"403,\"Jon\",4000.00",
				"404,\"Ram\",2300.00",
				"405,\"Raju\",5400.00",
				"406,\"Jit\",6300.00",
				"407,\"Kon\",1200.00",
				"408,\"Don\",2100.00",
				"409,\"Vicky\",8000.00");
		List<Customer> customerList=new ArrayList<>();
		for (String dataStr : objectDataStr) {
			customerBeanUtil.buildObjectBean();
			customerBeanUtil.buildObject(customer,dataStr);
			customerList.add(customer);
			System.out.println(customer);
		}
	}
}
