package com.javamapper.xmlconfig;

import java.util.Arrays;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

import com.javamapper.beangen.Customer;
import com.javamapper.beangen.Order;

public class XmlConfigApp {
	public static void main(String[] args) {
		DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
		reader.loadBeanDefinitions(new ClassPathResource("bean-list.xml"));
		Arrays.asList(beanFactory.getBeanDefinitionNames()).stream().forEach(System.out::println);
		Customer customer = beanFactory.getBean(Customer.class);
		Order order = beanFactory.getBean(Order.class);
		System.out.println(customer);
		System.out.println(order);
	}
}
