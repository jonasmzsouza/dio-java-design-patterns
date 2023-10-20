package me.dio.gof.creational.singleton;

/**
 * Singleton Lazy Holder
 * 
 * @author jonasmzsouza
 *
 */
public class SingletonLazyHolder {

	private static class InstanceHolder {
		public static SingletonLazyHolder instance = new SingletonLazyHolder();
	}

	private SingletonLazyHolder() {
		super();
	}

	public static SingletonLazyHolder getInstance() {
		return InstanceHolder.instance;
	}
}
