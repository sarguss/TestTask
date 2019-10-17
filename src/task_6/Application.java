package task_6;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Application {
    public static void main (String [] args){
        // новая группа студентов
        Group group_1 = new Group();
        Group group_2 = new Group();

        // добавление в группу по 5 студентов
        group_1.addStudent(new Student("Осип Кузьмин"));
        group_1.addStudent(new Student("Фёдор Борисов"));
        group_1.addStudent(new Student("Софья Беспалова"));
        group_1.addStudent(new Student("Стелла Ширяева"));
        group_1.addStudent(new Student("Геннадий Жуков"));

        group_2.addStudent(new Student("Игнат Евдокимов"));
        group_2.addStudent(new Student("Эмма Качулина"));
        group_2.addStudent(new Student("Вадим Колесов"));
        group_2.addStudent(new Student("Назар Фомин"));
        group_2.addStudent(new Student("Ипатия Сазонова"));

        // сет из 10 биллетов
        List<Ticket> examTickets = Ticket.initTickets();

        // группы сдают экзамен
        group_1.passExam(examTickets);
        group_2.passExam(examTickets);

        //  средний результат в группе
        System.out.println("Average mark in group 1: " + group_1.getAverageMark());
        System.out.println("Average mark in group 2: " + group_2.getAverageMark());

        // результат всех студентов
        group_1.showAllResult();
        group_2.showAllResult();

        // лучший и худший результат
        Group.showExcellent();
        Group.showWorst();
    }
}
