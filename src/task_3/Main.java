package task_3;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main (String [] args){
        int n = getNumber();
        int [] array = generateArray(n);
        ArrayList<Integer> odd = getOdd(array);
        ArrayList<Integer> even = getEven(array);
        ArrayList<Integer> dividedByThree = getDividedByThree(array);
        ArrayList<Integer> dividedByFive = getDividedByFive(array);
        printArray("Odd:", odd);
        printArray("Even:", even);
        printArray("Divided by three:", dividedByThree);
        printArray("Divided by five:", dividedByFive);
     }

    public static int getNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("N:");
        return Integer.parseInt(scanner.nextLine());
    }

    public static int [] generateArray(int n){
        int [] array = new int [n];
        Random random = new Random();
        for (int i=0; i<n; i++){
            array[i] = random.nextInt();
        }
        return array;
    }

    public static ArrayList getOdd(int [] array){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=0; i<array.length; i++){
            if (array[i]%2 != 0) {
                list.add(array[i]);
            }
        }
        return list;
    }
    public static ArrayList getEven(int [] array){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=0; i<array.length; i++){
            if (array[i]%2 == 0) {
                list.add(array[i]);
            }
        }
        return list;
    }
    public static ArrayList getDividedByThree(int [] array){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=0; i<array.length; i++){
            if (array[i]%3 == 0) {
                list.add(array[i]);
            }
        }
        return list;
    }
    public static ArrayList getDividedByFive(int [] array){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=0; i<array.length; i++){
            if (array[i]%5 == 0) {
                list.add(array[i]);
            }
        }
        return list;
    }

    public static void printArray(String string, ArrayList<Integer> list){
        System.out.println(string);
        if (list.size()==0) {
            System.out.println("  nothing");
            return;
        }
        for (int i : list){
            System.out.print(i);
            System.out.print("  ");
        }
        System.out.println();
    }
}
