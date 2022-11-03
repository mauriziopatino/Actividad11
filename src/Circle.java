public class Circle implements Shape{

    @Override
    public double getArea(double num1, double num2) {
            double result = num2 * Math.pow(num1, 2);
        return result;
    }

    @Override
    public double getPerimeter(double num1, double num2, double num3, double num4) {
        num3 = 0; num4 = 0;
        double result = num2 * num1;
        return result;
    }
}
