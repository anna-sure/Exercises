
public class CircleArea {
	public static void main(String[] args) {
		
		Circle circle = new Circle(3);
		System.out.println(circle.area());
		System.out.println(circle.len());
	}
}

class Circle{
	double radius; //半徑
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	
	public double area() { //面积
		return Math.PI *radius * radius;
	}
	
	public double len() { //周长
		return 2 *Math.PI * radius; 
	}
}