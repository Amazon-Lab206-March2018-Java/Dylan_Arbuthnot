package com.codingdojo.calculator2;
import java.util.*;

public class Calculator implements java.io.Serializable {
	private ArrayList<Double> numbers;
	private ArrayList<Character> operations;									// Operation stored as character for optimization
	public Calculator() {
		ArrayList<Double> numbers = new ArrayList<Double>();
		ArrayList<Character> operations = new ArrayList<Character>();
		this.numbers = numbers;
		this.operations = operations;
	}
	public void performOperation(Double num) {
		setNumbers(num);
	}
	public void performOperation(Character op) {
		setOperations(op);
	}
	public String getResults() {
		String equation = "";
		for (int i = 0; i < this.numbers.size(); i++) {
			equation += this.numbers.get(i);
			for (int x = i; x < i + 1; i++) {
				equation += this.operations.get(x);
			}
		}
		return equation;
	}
	public ArrayList<Double> getNumbers() {
		return numbers;
	}
	public ArrayList<Character> getOperations() {
		return operations;
	}
	public void setNumbers(Double num) {
		numbers.add(num);
	}
	public void setOperations(Character op) {
		operations.add(op);
	}
}
