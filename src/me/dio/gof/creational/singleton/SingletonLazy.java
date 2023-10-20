package me.dio.gof.creational.singleton;

/**
 * Singleton Lazy
 * 
 * @author jonasmzsouza
 *
 */
public class SingletonLazy {
	private static SingletonLazy instance;

	private SingletonLazy() {
		super();
	}

	public static SingletonLazy getInstance() {
		if (instance == null) {
			instance = new SingletonLazy();
		}
		return instance;
	}
}
