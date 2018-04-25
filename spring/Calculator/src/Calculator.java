
public class Calculator {
	private Double operandOne;										// Class works only with doubles for precision
	private Character operation;									// Operation stored as character for optimization
	private Double operandTwo;
	public Calculator() {											// No arg constructor sets no values in the Calculator object
		
	}
	public Calculator(Double num1, Double num2) {					// Constructor with only two doubles, no operation
		this.operandOne = num1;
		this.operation = '+';										// Operation defaults to addition
		this.operandTwo = num2;
	}
	public Calculator(Double num1, Character op, Double num2) {		// Constructor with all arguments
		this.operandOne = num1;
		this.operation = op;
		this.operandTwo = num2;
	}
	public Double getResults() {
		Double num1 = this.getOperandOne();
		Double num2 = this.getOperandTwo();
		Character op = this.getOperation();
		Double result = 0.00;
		if (op == '+') {
			result = num1 + num2;
		} else if (op == '-') {
			result = num1 - num2;
		} else if (op == '*') {
			result = num1 * num2;
		} else if (op == '/') {
			result = num1 / num2;
		}
		return result;
	}
	public Double getOperandOne() {
		return operandOne;
	}
	public Character getOperation() {
		return operation;
	}
	public Double getOperandTwo() {
		return operandTwo;
	}
	public void setOperandOne(Double operandOne) {
		this.operandOne = operandOne;
	}
	public void setOperation(Character operation) {
		this.operation = operation;
	}
	public void setOperandTwo(Double operandTwo) {
		this.operandTwo = operandTwo;
	}
}
