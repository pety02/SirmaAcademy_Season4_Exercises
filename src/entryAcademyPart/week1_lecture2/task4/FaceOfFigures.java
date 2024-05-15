package entryAcademyPart.week1_lecture2.task4;

import java.util.Scanner;

public class FaceOfFigures {
    private static double face(String type, double[] params) {
        return switch(type) {
            case "rectangle" -> (params.length == 2) ? params[0] * params[1] : 0.0;
            case "square" -> (params.length == 1) ? Math.pow(params[0], 2) : 0.0;
            case "circle" -> (params.length == 1) ? Math.PI * Math.pow(params[0], 2) : 0.0;
            default -> 0.0;
        };
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String figureType = scanner.nextLine();
        double[] params;
        double area;
        if(figureType.equals("rectangle")) {
            double sideA = Double.parseDouble(scanner.nextLine());
            double sideB = Double.parseDouble(scanner.nextLine());
            params = new double[]{sideA, sideB};
        } else if (figureType.equals("circle") || figureType.equals("square")) {
            double number = Double.parseDouble(scanner.nextLine());
            params = new double[]{number};
        } else {
            System.out.println("Invalid figure type!");
            return;
        }
        area = face(figureType, params);
        System.out.printf("%.2f", area);
    }
}
