package com.Java_Advanced_MySql.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Ftech {
public static void main(String[] args) {
	StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
	Metadata metadata=new MetadataSources(ssr).getMetadataBuilder().build();
	SessionFactory factory=metadata.getSessionFactoryBuilder().build();
	Session openSession = factory.openSession();
	
	Employe employe=(Employe)openSession.load(Employe.class, 121);
	System.out.println(employe.getId()+""+employe.getName()+""+employe.getSalary());
	
	Session openSession1 = factory.openSession();
	Employe employe1=(Employe)openSession1.load(Employe.class, 121);
	System.out.println(employe1.getId()+""+employe1.getName()+""+employe1.getSalary());
}
}
