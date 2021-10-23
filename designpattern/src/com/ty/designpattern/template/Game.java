package com.ty.designpattern.template;

public abstract class Game {

	public abstract void load();
	public abstract void start();
	public abstract void end();
	public void play()
	{
		load();
		start();
		end();
	}
}
