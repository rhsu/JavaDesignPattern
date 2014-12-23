package abstractfactory;

import abstractfactory.colors.Blue;
import abstractfactory.colors.Color;
import abstractfactory.colors.Green;
import abstractfactory.colors.Red;
import abstractfactory.shapes.Shape;

public class ColorFactory extends AbstractFactory
{	
	@Override
	Color getColor(ColorType color) 
	{
			switch(color)
		{
			case RED:
				return new Red();
			case GREEN:
				return new Green();
			case BLUE:
				return new Blue();
		}
		return null;
	}

	@Override
	Shape getShape(ShapeType shape) 
	{
		throw new UnsupportedOperationException("Not supported Method.");
	}
}
