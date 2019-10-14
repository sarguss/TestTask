package task_5;

import java.util.Scanner;

public class Main {
    public static void main (String [] args){
        String string = getString();
        if (checkForPalindrom(string)){
            System.out.println("is palindrom");
        } else {
            System.out.println("is not a palindrom");
        }
    }

    public static String getString(){
        String string;
        Scanner scanner = new Scanner(System.in);
        string = scanner.nextLine();
        return string;
    }

    public static boolean checkForPalindrom(String string){
        boolean isPalindrom = true;
        char [] stringArray = string.toCharArray();
        int lengthArray = stringArray.length;
        for (int i=1; i<(lengthArray/2); i++) {

            char a = stringArray[i];
            char b = stringArray[lengthArray - 1 - i];
            if (a != b){
                isPalindrom = false;
                break;
            }
        }
        return isPalindrom;
    }
}
