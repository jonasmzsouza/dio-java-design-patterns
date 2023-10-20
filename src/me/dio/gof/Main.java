package me.dio.gof;

import me.dio.gof.behavioral.strategy.AgressiveBehavior;
import me.dio.gof.behavioral.strategy.Behavior;
import me.dio.gof.behavioral.strategy.DefensiveBehavior;
import me.dio.gof.behavioral.strategy.NormalBehavior;
import me.dio.gof.behavioral.strategy.Robot;
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

		// Strategy
		Behavior defensive = new DefensiveBehavior();
		Behavior normal = new NormalBehavior();
		Behavior agressive = new AgressiveBehavior();

		Robot robot = new Robot();
		robot.setBehavior(normal);
		robot.move();
		robot.move();
		robot.setBehavior(defensive);
		robot.move();
		robot.setBehavior(agressive);
		robot.move();
		robot.move();
		robot.move();

	}

}
