package me.dio.gof.behavioral.strategy;

public class NormalBehavior implements Behavior {

	@Override
	public void move() {
		System.out.println("moving normally...");
	}

}
