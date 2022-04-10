package com.autowiring.autodetect;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainClass {

	public static void main(String[] args) {
		Resource resource = new ClassPathResource("spring.xml");
		BeanFactory beanfactory= new XmlBeanFactory(resource);
		Categories categories=(Categories)beanfactory.getBean("categories");
		
		categories.show();
		
	}
}
