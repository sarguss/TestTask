package task_6;

import java.util.*;

public class Group {
    private List<Student> list = new ArrayList<>();
    private ArrayList<Integer> result = new ArrayList<>();
    private double averageMark;
    private static Map<Student, Integer> resultGlobal = new HashMap<Student, Integer>();

    public void addStudent(Student student){
        list.add(student);
    }

    public void passExam(List<Ticket> tickets){
        for (Student student : this.list){
            int mark = student.passExam(tickets);
            result.add(mark);
            resultGlobal.put(student, mark);
        }
    }

    public void showAllResult(){
        for (Student student : list){
            String string = String.format("%20s, mark: %2d, ticket: %s", student.toString(), student.getMark(), student.getTicket().toString());
            System.out.println(string);
        }
    }
    public double getAverageMark(){
        int sum = 0;
        for (int mark : result){
            sum += mark;
        }
        averageMark = ((double)sum) / result.size();
        return averageMark;
    }

    public static void showExcellent() {
        int max = getMaxMark();
        System.out.println("Best student with mark " + max + ":");
        for (Map.Entry<Student, Integer> entry : resultGlobal.entrySet()) {
            int mark = entry.getValue();
            if (mark == max){
                System.out.println(entry.getKey().toString());
            }
        }
    }

    public static void showWorst(){
        int min = getMinMark();
        System.out.println("Worst student with mark " + min + ":");
        for (Map.Entry<Student, Integer> entry : resultGlobal.entrySet()) {
            int mark = entry.getValue();
            if (mark == min){
                System.out.println(entry.getKey().toString());
            }
        }
    }

    private static int getMinMark(){
        int min = 5;
        for (int mark : resultGlobal.values()){
            if (min > mark){
                min = mark;
            }
        }
        return min;
    }
    private static int getMaxMark(){
        int max = 1;
        for (int mark : resultGlobal.values()){
            if (max < mark){
                max = mark;
            }
        }
        return max;
    }

}
