public class FirstProgramm{
	public static void main(String[] args){
		/*
		hello("world");
		hello("Vova");
		hello("Cap");
		Square s = new Square(5);
		System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());
		Rectangle r = new Rectangle(4, 6);
		System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());
		*/
		Point1 p = new Point1(4,5);

		Point2 po = new Point2(7, 3);

		System.out.println(Math.sqrt((po.c - p.a) * (po.c - p.a) + (po.d - p.b) * (po.d - p.b)));
	}




	/*
	public static void hello(String somebody){
		System.out.println("Hello, " + somebody + "!");
	}

	public static void firstcoords(double a, double b){
		System.out.println(a + b);
	}
	public static void secondcoord(double c, double d){
		System.out.println(c + d);
	}

	 */


}

