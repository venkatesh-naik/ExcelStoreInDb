package com.xworkz.thor.tester;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SFutil {
	private static final SessionFactory factory;

	static {
		Configuration cfg = new Configuration();
		cfg.configure("resource/dbs.xml");
		factory = cfg.buildSessionFactory();
		System.out.println("Static factory created...");
	}

	public static SessionFactory getFactory() {
		System.out.println("calling single factory");
		return factory;
	}
}
