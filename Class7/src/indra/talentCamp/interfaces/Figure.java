package indra.talentCamp.interfaces;

public abstract class Figure implements Area, Perimeter, Comparable<Figure> {

	public abstract double calculateArea();
	
	public abstract double calculatePerimeter();
	
	@Override
	public int compareTo(Figure f) {
		return (int)this.calculateArea() - (int)f.calculateArea();
	}
}
