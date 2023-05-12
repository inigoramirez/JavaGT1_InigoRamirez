package indra.talentCamp.lambda.models;

public class Person {
	
	private String name;
	private int cm;
	
	public Person(String name, int cm) {
		super();
		this.name = name;
		this.setCm(cm);
	}

	public String getName() {
		return name;
	}

	public int getCm() {
		return cm;
	}
	
	public void setCm(int cm) {
		// Error no obliga a capturar la excepción
		if(cm > 300) throw new Error("No se puede medir más de 300 cm");
		if(cm < 0) throw new Error("No se puede medir menos de 0 cm");
		this.cm = cm;
	}
	
	@Override
	public String toString() {
		return this.getName();
	}
}
