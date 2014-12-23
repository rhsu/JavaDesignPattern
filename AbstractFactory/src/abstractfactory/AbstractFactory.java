package abstractfactory;

import abstractfactory.colors.Color;
import abstractfactory.shapes.Shape;

public abstract class AbstractFactory 
{
	public enum ColorType
	{
		RED,
		GREEN,
		BLUE
	}
	
	public enum ShapeType
	{
		CIRCLE,
		RECTANGLE,
		SQUARE
	}
	
	abstract Color getColor(ColorType color);
	abstract Shape getShape(ShapeType shape);
}
