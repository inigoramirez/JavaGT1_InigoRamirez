package indra.talentCamp.interfaces;

public class Circle extends Figure {

	private double radius;

	public Circle(double radius) {
		// TODO Auto-generated constructor stub
		super();
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return Math.PI * Math.pow(this.getRadius(), 2);
	}

	@Override
	public double calculatePerimeter() {
		// TODO Auto-generated method stub
		return Math.PI * 2 * this.radius;
	}
}
