import java.lang.Math;

public class Pythagorean {
	public double calculateHypotenuse(int legA, int legB){
		double squareAdd = (legA * legA) + (legB * legB);
		double squareRoot = Math.sqrt(squareAdd);
		return squareRoot;
	}
}