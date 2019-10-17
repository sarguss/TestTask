package task_7;

import task_7.Exceptions.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class Application {
    public static void main (String [] args){
        System.out.println("Enter expression with '+', '-', '*' or '/': ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String string = "";
            try {
                string = reader.readLine();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            if (string.equals("quit")) {
                break;
            }
            try {
                perform(string);
            } catch (IncorectExpressionException e) {
                System.out.println("Use format:  Number operation Number");
            } catch (DivisionBy0Exception e) {
                System.out.println("Division by 0");
            } catch (Exception e){
                System.out.println(e.getStackTrace().toString());
            }

        }
    }
    //основной метод работы калькулятора
    public static void perform(String string) throws Exception {
        //удаление пробелов и знаков подчеркивания
        string = string.replaceAll("[ _]", "");

        //проверка на содержание только цифр, одного из 4 символов, точки
        boolean isCorrect = string.matches("\\d*.?\\d+[+\\-/*]\\d*.?\\d+");
        if (!isCorrect){
            throw new IncorectExpressionException(string);
        }

        // разделение на 2 строки и знак апперации
        String [] numbers = separate(string);

        //выполние апперации и вывод в консоль в зависимости от знака апперации
        switch (numbers[2]){
            case "+" :
                System.out.println(addition(numbers));
                break;
            case "-" :
                System.out.println(subtraction(numbers));
                break;
            case "*" :
                System.out.println(multiplication(numbers));
                break;
            case "/" :
                System.out.println(division(numbers));
                break;
        }
    }

    // разделение на 2 строки и знак апперации
    public static String [] separate(String string){
        String [] numbers = string.split("[+\\-/*]");
        String sign = string.replaceAll("[\\d.]", "");
        numbers = new String [] {numbers[0], numbers[1], sign};
        return numbers;
    }

    public static String addition(String [] str){
        BigDecimal bigDecimal_1 = new BigDecimal(str[0]);
        BigDecimal bigDecimal_2 = new BigDecimal(str[1]);
        String result = bigDecimal_1.add(bigDecimal_2).toEngineeringString();
        return result;
    }
    public static String subtraction(String [] str){
        BigDecimal bigDecimal_1 = new BigDecimal(str[0]);
        BigDecimal bigDecimal_2 = new BigDecimal(str[1]);
        String result = bigDecimal_1.subtract(bigDecimal_2).toEngineeringString();
        return result;
    }
    public static String multiplication(String [] str){
        BigDecimal bigDecimal_1 = new BigDecimal(str[0]);
        BigDecimal bigDecimal_2 = new BigDecimal(str[1]);
        String result = bigDecimal_1.multiply(bigDecimal_2).toEngineeringString();
        return result;
    }
    public static String division(String [] str) throws DivisionBy0Exception{
        if (str[1].equals("0")) {
            throw new DivisionBy0Exception();
        }
        BigDecimal bigDecimal_1 = new BigDecimal(str[0]);
        BigDecimal bigDecimal_2 = new BigDecimal(str[1]);
        String result = bigDecimal_1.divide(bigDecimal_2,10, BigDecimal.ROUND_HALF_UP).toEngineeringString();
        return result;
    }
}
