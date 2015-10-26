public class Circle{

	public static void main(String[] args){
		//A static member function cannot refer directly to the instance variables or methods of the enclosing class. It can do this only through an object reference.
		Circle c1 = new Circle();
		Circle c2 = new Circle(2.0);
		Point cen3 = new Point(1.0, 2.0);
		Circle c3 = new Circle(cen3, 1.0);
		
		Point test1 = new Point(1.0, 1.0);
		System.out.println(c1.IsOnCircle(test1));
		
		Point test2 = new Point(0.0, -2.0);
		System.out.println(c2.IsOnCircle(test2));

		Point test3 = new Point(0.0, 2.0);
		System.out.println(c3.IsOnCircle(test3));
	}
	private Point center;
	private double radius;
	private double tol = 1e-5;
	public Circle(){
		this(new Point(0,0),1);
	}
	public Circle(double radius){
		this(new Point(0,0),radius);
	}
	public Circle(Point p, double radius){
		this.center = p;
		this.radius = radius;
		numCircles++;
		System.out.println("The number of circles in existence is now " + numCircles);
	}
	public int IsOnCircle(Point p){
		if (Math.abs(Math.pow(center.y - p.y,2) + Math.pow(center.x - p.x, 2) - Math.pow(radius, 2)) < tol) {
			return 1;
		}else{
			return 0;
		}
	}

	public static class Point{
		public double x;
		public double y;
		public Point(){
			this(0,0);
		}
		public Point(double x, double y){
			this.x = x;
			this.y = y;
		}

	}

	private static int numCircles = 0;

	public static int getNumCircles(){
		return numCircles;
	}

}
