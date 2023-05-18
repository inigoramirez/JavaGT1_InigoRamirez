package indra.talentCamp.interfaces;

public class Triangle extends Figure {

	private double height;
	private double base;
	private double leftSide;
	private double rightSide;

	public Triangle(double height, double base, double leftSide, double rightSide) {
		// TODO Auto-generated constructor stub
		this.height = height;
		this.base = base;
		this.leftSide = leftSide;
		this.rightSide = rightSide;
	}
	
	public double getHeight() {
		return height;
	}

	public double getBase() {
		return base;
	}

	public double getLeftSide() {
		return leftSide;
	}

	public double getRightSide() {
		return rightSide;
	}

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return (this.base * this.height)/2;
	}

	@Override
	public double calculatePerimeter() {
		// TODO Auto-generated method stub
		return this.base + this.leftSide + this.rightSide;
	}
}
