import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Square mySquare = new Square();
        Circle myCircle = new Circle();
        Triangle myTriangle = new Triangle();

        int shape = 0;

        Scanner sc = new Scanner(System.in);
        int response = sc.nextInt();

        System.out.println("--- [Selecciona la figura] ---");
        System.out.println("1) Cuadrado");
        System.out.println("2) Circulo");
        System.out.println("3) Triangulo");

        switch (response){
            case 1:
                shape = 1;
                break;

            case 2:
                shape = 2;
                break;

            case 3:
                shape = 3;
                break;
        }

        int response2 = sc.nextInt();
        System.out.println("--- [Selecciona la propiedad a calcular] ---");
        System.out.println("1) Area");
        System.out.println("2) Perimetro");

        int num1 = 0, num2 = 0, num3 = 0, num4 = 0;

        switch(response2) {
            case 1:
                if(shape == 1){
                    System.out.println("Ingresa el lado 1");
                    num1 = sc.nextInt();
                    System.out.println("Ingresa el lado 2");
                    num2 = sc.nextInt();
                    System.out.println(myCircle.getArea(num1, num2));
                } else if (shape == 2) {
                    System.out.println("Ingresa el PI");
                    num1 = sc.nextInt();
                    System.out.println("Ingresa el radio");
                    num2 = sc.nextInt();
                    System.out.println("Area: " + mySquare.getArea(num1, num2));
                } else if (shape == 3) {
                    System.out.println("Ingresa el PI");
                    num1 = sc.nextInt();
                    System.out.println("Ingresa el radio");
                    num2 = sc.nextInt();
                    System.out.println("Area: " + myTriangle.getArea(num1, num2));
                }
                break;
            case 2:
                if(shape == 1){
                    System.out.println("Ingresa el lado 1");
                    num1 = sc.nextInt();
                    System.out.println("Ingresa el lado 2");
                    num2 = sc.nextInt();
                    System.out.println("Ingresa el lado 3");
                    num3 = sc.nextInt();
                    System.out.println("Ingresa el lado 4");
                    num4 = sc.nextInt();
                    System.out.println("Perimetro: " + myCircle.getPerimeter(num1, num2, num3, num4));
                } else if (shape == 2) {
                    System.out.println("Ingresa el PI");
                    num1 = sc.nextInt();
                    System.out.println("Ingresa el diametro");
                    num2 = sc.nextInt();
                    System.out.println("Perimetro: " + mySquare.getPerimeter(num1, num2, 0, 0));
                } else if (shape == 3) {
                    System.out.println("Ingresa el lado 1");
                    num1 = sc.nextInt();
                    System.out.println("Ingresa el lado 2");
                    num2 = sc.nextInt();
                    System.out.println("Ingresa el lado 3");
                    num3 = sc.nextInt();
                    System.out.println("Perimetro: " + myTriangle.getPerimeter(num1, num2, num3, 0));
                }
                break;
        }



    }
}