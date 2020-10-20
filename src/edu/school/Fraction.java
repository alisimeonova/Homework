package edu.school;

public class Fraction {
	int numerator;
	int denominator;
	
	public Fraction() {
		numerator = 0;
		denominator = 1;
	}
	
	public Fraction(int num, int den) {
		if(den != 0) {
			numerator = num;
			denominator = den;
		}
	}
	
	public Fraction(int num) {
		numerator = num;
		denominator = 1;
	}
	
	public int getNumerator() {
		return numerator;
	}
	
	public int getDenominator() {
		return denominator;
	}
	
	public String toString() {
		String result = "";
		result += numerator;
		result += "\n__";
		result += "\n" + denominator;
		return result;
	}
	
	public Fraction add(Fraction f) {
		return new Fraction(numerator*f.denominator + f.numerator*denominator, denominator*f.denominator);
	}
	
	
}
