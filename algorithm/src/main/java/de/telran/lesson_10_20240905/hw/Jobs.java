package de.telran.lesson_10_20240905.hw;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Jobs {
    public static void main(String[] args) {

        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("a",3,10));
        tasks.add(new Task("b",2,8));
        tasks.add(new Task("c",1,5));
        tasks.add(new Task("d",3,11));
        tasks.add(new Task("e",4,15));
        tasks.add(new Task("g",5,17));

        int maxTime = 11; //сколько времени я могу уделить

        System.out.println("Критерий макс количество задач = "+taskSelectionCount(tasks, maxTime));

        System.out.println("Критерий макс сумма = "+taskSelectionCost(tasks, 60));
    }

    public static List<Task> taskSelectionCount(List<Task> tasks, int maxTime) {
        tasks.sort(Comparator.comparingInt(Task::getTime));
        int totalTime = 0; //общее затраченное время
        List<Task> res = new ArrayList<>(); //выбранные задачи
         for (Task task : tasks) {
            totalTime += task.getTime();
            if (totalTime <= maxTime) {
                res.add(task);
            } else {
                break;
            }
        }
        return res;
    }

    // критерий жадности - максимальная сумма
    public static List<Task> taskSelectionCost(List<Task> tasks, int maxCost) {
        tasks.sort(Comparator.comparingInt(Task::getCost).reversed());
        int totalCost = 0; //общее заработанная сумма
        List<Task> res = new ArrayList<>(); //выбранные задачи
        for (Task task : tasks) {
            totalCost += task.getCost();
            if (totalCost <= maxCost) {
                res.add(task);
            } else {
                break;
            }
        }
        return res;
    }

}
