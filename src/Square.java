public class Square implements Shape{
    @Override
    public double getArea(double num1, double num2) {
        double result = num1 * num2;
        return result;
    }

    @Override
    public double getPerimeter(double num1, double num2, double num3, double num4) {
        double result = num1 + num2 + num3 + num4;
        return result;
    }
}
