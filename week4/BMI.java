package week4;

public class BMI {
    public static String evaluateBmi(double weight, double height) {
        double bmi = weight / (height*height);
        if (bmi < 18.5) return "Thiếu cân";
        else if (bmi >= 18.5 & bmi < 23) return "Bình thường";
        else if (bmi >= 23 & bmi <= 25) return "Thừa cân";
        else return "Béo phì";
    }
}
