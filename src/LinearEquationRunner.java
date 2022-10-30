import java.util.Scanner;
public class LinearEquationRunner {
    public static void main(String []Args){
        Scanner scan = new Scanner(System.in);

        String coordinate;
        String coordinate2;
        double x;

        System.out.println("Enter coordinate 1: ");
        coordinate = scan.nextLine();
        int x1 = Integer.parseInt(coordinate.substring(1, coordinate.indexOf(",")));
        int y1 = Integer.parseInt(coordinate.substring(coordinate.indexOf(" ")+1, (coordinate.indexOf(")"))));

        System.out.println("Enter coordinate 2: ");
        coordinate2 = scan.nextLine();
        int x2 = Integer.parseInt(coordinate2.substring(1, coordinate2.indexOf(",")));
        int y2 = Integer.parseInt(coordinate2.substring(coordinate2.indexOf(" ")+1, (coordinate2.indexOf(")"))));



        LinearEquation equation = new LinearEquation(x1, y1, x2, y2);
        System.out.println("Equation: " + equation.equation());
        System.out.println("Slope: " + equation.slope());
        System.out.println("y-intercept: " + equation.yIntercept());
        System.out.println("Distance: " + equation.distance());
        System.out.println();
        System.out.println("----- Line info -----");
        System.out.println(equation.lineInfo());
        System.out.println();

        System.out.println("Enter value for x");
        x = scan.nextDouble();
        double testX = x;
        System.out.println("Coordinate for x: " + equation.coordinateForX(testX));

    }
}