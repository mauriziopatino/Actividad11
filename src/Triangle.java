public class Triangle implements Shape{
    @Override
    public double getArea(double num1, double num2) {
        double result = num1 * num2 / 2;
        return result;
    }

    @Override
    public double getPerimeter(double num1, double num2, double num3, double num4) {
        num4 = 0;
        double result = num1 + num2 + num3;
        return result;
    }
}
