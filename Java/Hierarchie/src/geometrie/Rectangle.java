package geometrie;

public class Rectangle extends Quadrilatere 
{
   public Rectangle()
   {
	   // Constructeur par defaut
	   System.out.println("\nConstructeur de Rectangle");
   }
   
   public Rectangle(Point p1, Point p2)
   {
	   Point p3 = new Point(p1.getX(), p2.getY());
	   Point p4 = new Point(p2.getX(), p1.getY());
	   
	   // Quadrilatere(p1, p2, p3, p4);
   }
}
