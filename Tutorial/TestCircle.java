public class TestCircle{
	public static void main(String[] args){
		Circle c1 = new Circle();
		Circle c2 = new Circle(2.0);
		Circle c3 = new Circle(1.0, 2.0, 1.0);
		
		System.out.println(c1.IsOnCircle(1.0, 1.0));
		System.out.println(c2.IsOnCircle(0.0, -2.0));
		System.out.println(c3.IsOnCircle(0.0, 2.0));
	}
}