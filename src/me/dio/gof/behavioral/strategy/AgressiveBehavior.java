package me.dio.gof.behavioral.strategy;

public class AgressiveBehavior implements Behavior {

	@Override
	public void move() {
		System.out.println("moving aggressively...");
	}

}
