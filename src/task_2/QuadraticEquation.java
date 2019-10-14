package task_2;

import java.util.Scanner;

public class QuadraticEquation {
    private int a, b, c;

    public void setCoefficient(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("a: ");
        a = Integer.parseInt(scanner.nextLine());
        System.out.println();

        System.out.println("b: ");
        b = Integer.parseInt(scanner.nextLine());
        System.out.println();

        System.out.println("c: ");
        c = Integer.parseInt(scanner.nextLine());
        System.out.println();

        scanner.close();
    }

    public void showRoots(){
        double discriminant;

        discriminant = b*b - 4 * a * c;

        if (discriminant < 0) {
            this.showRoot();
        } else if (discriminant == 0){
            this.showRoot(0);
        } else {
            this.showRoot(discriminant);
        }

    }
    private void showRoot(){
        System.out.println("no solution");
    }
    private void showRoot(int zero){
        double root = (double)-b / 2 / a;
        System.out.println(root);
    }
    private void showRoot(double discriminant){
        double root_1 = (Math.sqrt(discriminant)-b) / 2 /a;
        double root_2 = (-Math.sqrt(discriminant)-b) / 2 /a;
        System.out.println(root_1);
        System.out.println(root_2);
    }

}
