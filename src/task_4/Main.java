package task_4;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main (String [] args){
        int n = getNumber();
        ArrayList<Integer> fibonachi = getFibonachi(n);
        printFibonachi(fibonachi);
     }

    public static int getNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("N:");
        int n = Integer.parseInt(scanner.nextLine());
        scanner.close();
        return n;
    }

    public static ArrayList<Integer> getFibonachi (int n){
        ArrayList<Integer> fibonachi = new ArrayList<>();
        if (n<1) {
            return fibonachi;
        }
        fibonachi.add(0);
        if (n==1) {
            return fibonachi;
        }
        fibonachi.add(1);
        if (n==1) {
            return fibonachi;
        }
        for (int i=2; i<n; i++){
            fibonachi.add(fibonachi.get(i-1)+fibonachi.get(i-2));
        }
        return fibonachi;
    }

    public static void printFibonachi(ArrayList<Integer> fibonachi){
        for (int x : fibonachi){
            System.out.print(x+ " ");
        }
    }
}
