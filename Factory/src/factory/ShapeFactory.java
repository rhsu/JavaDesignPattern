package factory;

public class ShapeFactory 
{
	public enum ShapeType
	{
		CIRCLE,
		RECTANGLE,
		SQUARE
	}
	
	public Shape getShape(ShapeType type)
	{
		switch(type)
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
	
	public static void main(String[] args)
	{
		ShapeFactory factory = new ShapeFactory();
		
		Shape t = factory.getShape(ShapeFactory.ShapeType.CIRCLE);
		
		t.draw();
	}
}
