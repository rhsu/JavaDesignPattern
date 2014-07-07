package com;

public class Show implements Cloneable
{
	private String name;
	
	public void setName(String name) { this.name = name; }
	
	public String getName() { return this.name; }
	
	@Override
	public Cloneable clone() throws CloneNotSupportedException
	{
		return (Show) super.clone();
	}
	
	@Override
	public String toString()
	{
		return "Show";
	}
}
