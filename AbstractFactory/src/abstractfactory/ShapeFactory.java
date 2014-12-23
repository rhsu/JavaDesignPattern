package abstractfactory;

import abstractfactory.AbstractFactory.ShapeType;
import abstractfactory.colors.Color;
import abstractfactory.shapes.Circle;
import abstractfactory.shapes.Rectangle;
import abstractfactory.shapes.Shape;
import abstractfactory.shapes.Square;

public class ShapeFactory extends AbstractFactory
{
	@Override
	Color getColor(ColorType color) 
	{
		throw new UnsupportedOperationException("Not supported Method.");
	}

	@Override
	Shape getShape(ShapeType shape) 
	{
		switch(shape)
		{
			case CIRCLE:
				return new Circle();
			case RECTANGLE:
				return new Rectangle();
			case SQUARE:
				return new Square();
		}
		return null;
	}
}
