package task_6;

import java.util.List;
import java.util.Random;


public class Student {
    private String name;
    private String lastName;
    private int mark;
    private Ticket ticket;

    Student(String fullName){
        String [] substr = fullName.split(" ");
        name = substr[0];
        lastName = substr[1];
    }
    public int passExam(List<Ticket> tickets){
        Random random = new Random();
        mark = 1 + random.nextInt(5);
        ticket = tickets.get(random.nextInt(tickets.size()));
        return mark;
    }

    @Override
    public String toString() {
        String fullName = name + " " + lastName;
        return fullName;
    }

    public int getMark(){
        return mark;
    }

    public Ticket getTicket() {
        return ticket;
    }
}