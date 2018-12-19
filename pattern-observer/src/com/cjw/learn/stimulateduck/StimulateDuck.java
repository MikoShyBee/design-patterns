package com.cjw.learn.stimulateduck;


import com.cjw.learn.stimulateduck.duck.Duck;
import com.cjw.learn.stimulateduck.duck.GreenHeadDuck;
import com.cjw.learn.stimulateduck.duck.RedHeadDuck;
import com.cjw.learn.stimulateduck.flybehavior.NoFlyBehavior;
import com.cjw.learn.stimulateduck.quackbehavior.NoQuackBehavior;

public class StimulateDuck {

	public static void main(String[] args) {

		Duck mGreenHeadDuck = new GreenHeadDuck();
		Duck mRedHeadDuck = new RedHeadDuck();

		mGreenHeadDuck.display();
		mGreenHeadDuck.Fly();
		mGreenHeadDuck.Quack();
		mGreenHeadDuck.swim();

		mRedHeadDuck.display();
		mRedHeadDuck.Fly();
		mRedHeadDuck.Quack();
		mRedHeadDuck.swim();
		mRedHeadDuck.display();
		mRedHeadDuck.SetFlyBehavoir(new NoFlyBehavior());
		mRedHeadDuck.Fly();
		mRedHeadDuck.SetQuackBehavoir(new NoQuackBehavior());
		mRedHeadDuck.Quack();
	}

}
