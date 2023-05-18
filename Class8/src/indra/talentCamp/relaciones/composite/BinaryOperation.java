package indra.talentCamp.relaciones.composite;

public abstract class BinaryOperation extends Operation {
	
	protected Operation leftOperator;
	protected Operation rightOperator;
	
	public BinaryOperation(Operation leftOperator, Operation rightOperator) {
		super();
		this.leftOperator = leftOperator;
		this.rightOperator = rightOperator;
	}
	
	public BinaryOperation(double leftOperator, double rightOperator) {
		super();
		this.leftOperator = new Value(leftOperator);
		this.leftOperator = new Value(rightOperator);
	}
	
	public BinaryOperation(Operation leftOperator, double rightOperator) {
		super();
		this.leftOperator = leftOperator;
		this.leftOperator = new Value(rightOperator);
	}
	
	public BinaryOperation(double leftOperator, Operation rightOperator) {
		super();
		this.leftOperator = new Value(leftOperator);
		this.rightOperator = rightOperator;
	}

}
