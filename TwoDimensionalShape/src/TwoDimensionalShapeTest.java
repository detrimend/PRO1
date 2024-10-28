import java.util.ArrayList;

public class TwoDimensionalShapeTest
{
  public static void main(String[] args)
  {
    ArrayList<TwoDimensionalShape> shapes = new ArrayList<>();

    TwoDimensionalShape shape1 = new Circle(3,3,1);
    TwoDimensionalShape shape2 = new Rectangle(6,6,2,2);
    TwoDimensionalShape shape3 = new Triangle(9,9,3,4,5);

    shapes.add(shape1);
    shapes.add(shape2);
    shapes.add(shape3);

    for (int i = 0; i < shapes.size(); i++)
    {
      System.out.println("Area: " + shapes.get(i).getArea());
    }



  }
}
