package week4;

public class BMI {
	public static void evaluateBmi(double weight, double height) {
		double bmi = weight / (height*height);
		if (bmi < 18.5) System.out.print("Thiếu cân");
		if (bmi >= 18.5 & bmi < 23) System.out.print("Bình thường");
		if (bmi >= 23 & bmi <= 25) System.out.print("Thừa cân");
		if (bmi > 25) System.out.print("Béo phì");
	}
	public static void main(String[] args) {
		evaluateBmi(40, 1.52);
	}
}
