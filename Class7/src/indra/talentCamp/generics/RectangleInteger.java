package indra.talentCamp.generics;

public abstract class RectangleInteger extends GenericFigure<Integer>  {
	
	private int base;
	private int height;
	
	public RectangleInteger(int base, int height) {
		// TODO Auto-generated constructor stub
		super();
		this.base = base;
		this.height = height;
	}

	public int getBase() {
		return base;
	}

	public int getHeight() {
		return height;
	}
	
	@Override
	public Integer calculateArea() {
		// TODO Auto-generated method stub
		return this.base * this.height;
	}

	@Override
	public Integer calculatePerimeter() {
		// TODO Auto-generated method stub
		return this.base * 2 + this.height * 2;
	}
}
