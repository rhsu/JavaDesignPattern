package abstractfactory;

import abstractfactory.AbstractFactory.ColorType;
import abstractfactory.AbstractFactory.ShapeType;
import abstractfactory.colors.Color;
import abstractfactory.shapes.Shape;

public class FactoryProducer 
{
	public enum FactoryType
	{
		SHAPE_FACTORY,
		COLOR_FACTORY
	}
	
	public static AbstractFactory getFactory(FactoryType type)
	{
		switch(type)
		{
			case SHAPE_FACTORY:
				return new ShapeFactory();
			case COLOR_FACTORY:
				return new ColorFactory();
		}
		return null;
	}
	
	//Abstract Factory Pattern Demo
	public static void main(String[] args)
	{
		AbstractFactory shapeFactory = FactoryProducer.getFactory(FactoryType.SHAPE_FACTORY);
		
		Shape shape1 = shapeFactory.getShape(ShapeType.CIRCLE);
		shape1.draw();
		
		AbstractFactory colorFactory = FactoryProducer.getFactory(FactoryType.COLOR_FACTORY);
		
		Color color1 = colorFactory.getColor(ColorType.RED);
		color1.fill();
	}
}
