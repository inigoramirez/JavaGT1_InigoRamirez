package indra.talentCamp.relaciones.composite;

public class Multiplication extends BinaryOperation {
	
	public Multiplication(Operation leftOperator, Operation rightOperator) {
		super(leftOperator, rightOperator);
	}
	
	public Multiplication(double leftOperator, double rightOperator) {
		super(leftOperator, rightOperator);
	}
	
	public Multiplication(Operation leftOperator, double rightOperator) {
		super(leftOperator, rightOperator);
	}
	
	public Multiplication(double leftOperator, Operation rightOperator) {
		super(leftOperator, rightOperator);
	}
	
	@Override
	public double calculate() {
		// TODO Auto-generated method stub
		return this.leftOperator.calculate() * this.rightOperator.calculate();
	}

}