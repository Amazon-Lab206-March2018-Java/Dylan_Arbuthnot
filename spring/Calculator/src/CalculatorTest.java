
public class CalculatorTest {
	public static void main(String[] args) {
		Calculator t9 = new Calculator();
		t9.setOperandOne(11.0);
		t9.setOperandTwo(157.681);
		t9.setOperation('*');
		System.out.println(t9.getResults());
		t9.setOperandOne(144.0);
		t9.setOperandTwo(12.0);
		t9.setOperation('/');
		System.out.println(t9.getResults());
		Calculator t6 = new Calculator(10.5, 5.2);
		System.out.println(t6.getResults());
	}
}
