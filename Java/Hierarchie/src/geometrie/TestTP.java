package geometrie;

public class TestTP {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Point p1 = new Point(5.1, 2.0, "A");
		Point p2 = new Point();
		Point p3 = new Point(1.1,6.0, "B");
		Point p4 = new Point(3.8,7.5, "C");
		
		//System.out.println(p1 + "  " + p2 );
		//System.out.println("Distance " + p1.distance(p2) );
		
		//Quadrilatere quad=new Quadrilatere();
		//System.out.println(quad);
		
		System.out.println(" ====== Exercice 1 ======");
		System.out.println("\nQuestion c)");
		Segment s1 = new Segment(p1, p2);
		System.out.println(s1);
		System.out.println("Longueur du segment : "+s1.longueur());
		
		System.out.println("\nQuestion d)");
		Quadrilatere quad2 = new Quadrilatere(p1,p2,p3,p4);
		System.out.println(quad2);
		System.out.println("Perimetre du quadrilatere : "+quad2.getPerimetre());
		
		
		System.out.println("\n ====== Exercice 2 ======");
		System.out.println("\nQuestion c)");
		Rectangle rect = new Rectangle();
		System.out.println("Perimetre du rectangle : "+rect.getPerimetre());
		
	}

}
