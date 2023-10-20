package me.dio.gof.creational.singleton;

/**
 * Singleton Eager
 * 
 * @author jonasmzsouza
 *
 */
public class SingletonEager {
	private static SingletonEager instance = new SingletonEager();

	private SingletonEager() {
		super();
	}

	public static SingletonEager getInstance() {
		return instance;
	}
}
