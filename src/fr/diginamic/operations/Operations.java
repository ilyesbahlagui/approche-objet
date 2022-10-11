package fr.diginamic.operations;

public class Operations {
	private double a;
	private double b;
	private char signe;

	public Operations(double a, double b, char signe) {
		// TODO Auto-generated method stub
		this.a = a;
		this.b = b;
		this.signe = signe;
	}

	public double getCalcule(double a, double b, char signe) {
		if (signe == '+') {
			return a + b;
		} else if (signe == '-') {
			return a - b;
		} else if (signe == '*') {
			return a * b;
		} else {
			return a / b;
		}

	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public char getSigne() {
		return signe;
	}

	public void setSigne(char signe) {
		this.signe = signe;
	}

}
