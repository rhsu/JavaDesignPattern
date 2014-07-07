package com;

public class Album implements Cloneable
{
	private String name;
	
	public void setName(String name) { this.name = name; }
	
	public String getName() { return this.name; }

	@Override
	public Cloneable clone() throws CloneNotSupportedException
	{
		return (Album) super.clone();
	}
	
	@Override
	public String toString()
	{
		return "Album";
	}
}
