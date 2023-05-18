package indra.talentCamp.relaciones.composite;

public class Value extends Operation {

	private double value;
	
	public Value(double value) {
		// TODO Auto-generated constructor stub
		super();
		this.value = value;
	}

	@Override
	public double calculate() {
		// TODO Auto-generated method stub
		return this.value;
	}

}
