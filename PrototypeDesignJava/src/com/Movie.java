package com;

public class Movie implements Cloneable
{ 
	private String name;
	
	public void setName(String name) { this.name = name; }
	
	public String getName() { return this.name; }
	
	@Override
	public Cloneable clone() throws CloneNotSupportedException
	{
		return (Movie) super.clone();
	}
	
	@Override
	public String toString()
	{
		return "Movie";
	}
}
