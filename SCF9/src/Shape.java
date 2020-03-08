import java.sql.Timestamp;

/* This interface provides mandatory functions to shape objects.
 * @author Prakhar Golania
 */
public interface Shape {
	enum typeOfShape
	{
		SQUARE, RECTANGLE, TRIANGLE, CIRCLE;

		public String toString(){
			switch(this){
			case SQUARE :return "square";
			case RECTANGLE :return "rectangle";
			case TRIANGLE :return "triangle";
			case CIRCLE:return "circle";
			}
			return null;
		}

	}

	public double getArea();
	public double getPerimeter();
	public double getOrigin();
	public boolean isPointEnclosed(StartingPoint obj);
	public String getShapeType();
	public Timestamp getTimeStamp();
}
