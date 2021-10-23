package com.ty.designpattern.template;

public class GameImpl extends Game{
	@Override
	public void load()
	{
		System.out.println("Game is loading");
		
	}
	@Override
	public void start()
	{
		System.out.println("Game is loading");
	}
	@Override
	public void end() {
		System.out.println("Game is terminated");
	}
}
