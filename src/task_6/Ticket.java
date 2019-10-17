package task_6;

import java.util.ArrayList;
import java.util.List;

public class Ticket {
    private int id;
    private String question;

    public Ticket(int id, String question){
        this.id = id;
        this.question = question;
    }

    public static List<Ticket> initTickets(){
        List<Ticket> tickets = new ArrayList<Ticket>();
        tickets.add(new Ticket(1,"Философия Аристотеля"));
        tickets.add(new Ticket(2,"Материалистическая теория Демокрита"));
        tickets.add(new Ticket(3,"Гносеология и этика Канта"));
        tickets.add(new Ticket(4,"Система и метод философии Гегеля"));
        tickets.add(new Ticket(5,"Основные законы диалектики"));
        tickets.add(new Ticket(6,"Личность. Свобода личности"));
        tickets.add(new Ticket(7,"Сущность культуры. Многообразие культур"));
        tickets.add(new Ticket(8,"Общественное сознание и его структура"));
        tickets.add(new Ticket(9,"Проблема истины в теории познания"));
        tickets.add(new Ticket(10,"Открытие мира идей: Сократ и Платон"));
        return tickets;
    }

    @Override
    public String toString() {
        String string = "№" + id + " " + question;
        return string;
    }
}
