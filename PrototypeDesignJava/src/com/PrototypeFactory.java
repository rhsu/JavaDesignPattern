package com;

import java.util.HashMap;
import java.util.Map;

public class PrototypeFactory
{
	public enum ModelType
	{
		MOVIE,
		ALBUM,
		SHOW
	}
	
	private final static Map<ModelType, Cloneable> prototypes = new HashMap<>();
	
	static
	{
		prototypes.put(ModelType.MOVIE, new Movie());
		prototypes.put(ModelType.ALBUM, new Album());
		prototypes.put(ModelType.SHOW, new Show());
	}
	
	public static Cloneable getInstance(final ModelType modelType) 
		throws CloneNotSupportedException
	{
		return ((Cloneable) prototypes.get(modelType));
	}
	
	public static void main(String[] args)
	{
		try
		{
			Cloneable thing = PrototypeFactory.getInstance(PrototypeFactory.ModelType.MOVIE);
			
			System.out.println(thing);
		} 
		catch (CloneNotSupportedException ex)
		{
			System.out.println(ex);
		}
	}
}
