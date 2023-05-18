package indra.talentCamp.interfaces;

public class Rectangle extends Figure {
	
	private double base;
	private double height;
	
	public Rectangle(double base, double height) {
		// TODO Auto-generated constructor stub
		this.base = base;
		this.height = height;
	}

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return this.base * this.height;
	}

	@Override
	public double calculatePerimeter() {
		// TODO Auto-generated method stub
		return this.base * 2 + this.height * 2;
	}

}
