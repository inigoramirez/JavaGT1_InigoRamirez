package indra.talentCamp.relaciones.composite;

public class Sum extends BinaryOperation {
	
	public Sum(Operation leftOperator, Operation rightOperator) {
		super(leftOperator, rightOperator);
	}
	
	public Sum(double leftOperator, double rightOperator) {
		super(leftOperator, rightOperator);
	}
	
	public Sum(Operation leftOperator, double rightOperator) {
		super(leftOperator, rightOperator);
	}
	
	public Sum(double leftOperator, Operation rightOperator) {
		super(leftOperator, rightOperator);
	}
	
	@Override
	public double calculate() {
		// TODO Auto-generated method stub
		return this.leftOperator.calculate() + this.rightOperator.calculate();
	}

}
