package q12;

public class MainShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle = new Circle(4.0);
        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Circle Perimeter: " + circle.calculatePerimeter());

        Triangle triangle = new Triangle(4.0, 5.0, 6.0);
        System.out.println("Triangle Area: " + triangle.calculateArea());
        System.out.println("Triangle Perimeter: " + triangle.calculatePerimeter());
    }
}

