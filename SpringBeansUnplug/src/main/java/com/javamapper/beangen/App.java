package com.javamapper.beangen;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;

public class App {

	public static void main(String[] args) throws ClassNotFoundException {
		DefaultListableBeanFactory deBeanFactory=new DefaultListableBeanFactory();
		//XmlBeanFactory xmlBeanFactory; it is deprecated 
		
		/*
		 *	 BeanDefinition
		 * 		/|\
		 * 		 |
		 * 		 |
		 * 		 |
		 * AbstractBeanDefinition
		 *		/|\
		 * 		 |
		 * 		 |
		 * 		 |
		 * GenericBeanDefinition
		 */
		/*GenericBeanDefinition genericBeanDefinition=new GenericBeanDefinition();
		genericBeanDefinition.setBeanClass(Customer.class);
		deBeanFactory.registerBeanDefinition("com.javamapper.entity.Customer",genericBeanDefinition);
		System.out.println(deBeanFactory.getBean("com.javamapper.entity.Customer"));
		System.out.println(deBeanFactory.getBean(Customer.class));
		*/
		/**
		 * beanFactory register beanDefinition with name-com.javamapper.entity.Customer and class object-Customer.class
		 */
		deBeanFactory.registerBeanDefinition("com.javamapper.entity.Customer",
				BeanDefinitionBuilder.genericBeanDefinition(Customer.class)
									 .addPropertyValue("cid", 101)
									 .addPropertyValue("name", "Anil")
									 .addPropertyValue("investAmt", 300.00)
									 .getBeanDefinition());
		/**
		 * beanFactory register beanDefinition with name-com.javamapper.entity.Order and class object-Order.class 
		 * maintain autowiredProperty 
		 */
		deBeanFactory.registerBeanDefinition("com.javamapper.entity.Order",
				BeanDefinitionBuilder.genericBeanDefinition(Order.class)
									 .addPropertyValue("orderId", 401l)
									 .addPropertyValue("sellingAmt", 20020.00)
									 .addPropertyValue("discountAmt", 20.00)
									 .addPropertyValue("totalAmt", 2000.00)
									 .addDependsOn("com.javamapper.entity.Customer")
									 .addAutowiredProperty("customer")
									 .getBeanDefinition());
		System.out.println(deBeanFactory.getBean(Customer.class));
		System.out.println(deBeanFactory.getBean(Order.class));
		
	}
}
