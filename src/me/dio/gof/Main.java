package me.dio.gof;

import me.dio.gof.creational.singleton.SingletonEager;
import me.dio.gof.creational.singleton.SingletonLazy;
import me.dio.gof.creational.singleton.SingletonLazyHolder;

public class Main {

	public static void main(String[] args) {

		// Singleton
		SingletonLazy lazy = SingletonLazy.getInstance();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstance();
		System.out.println(lazy);

		SingletonEager eager = SingletonEager.getInstance();
		System.out.println(eager);
		eager = SingletonEager.getInstance();
		System.out.println(eager);

		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstance();
		System.out.println(lazyHolder);
		lazyHolder = SingletonLazyHolder.getInstance();
		System.out.println(lazyHolder);

	}

}
