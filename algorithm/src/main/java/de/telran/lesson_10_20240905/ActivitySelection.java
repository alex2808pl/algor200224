package de.telran.lesson_10_20240905;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ActivitySelection {

    public void selectActivity(List<Activity> list) {
        list.sort(Comparator.comparingInt(Activity::getFinish).thenComparing((a,b) -> b.getCost() - a.getCost()));
        print(list); // распечатаем список заЯвок
        System.out.println("-----------------");

        List<Activity> res = new ArrayList<>(); // наш выбор

        Activity first = list.get(0);
        int last = first.getFinish();
        res.add(first);

        for (int i = 1; i < list.size(); i++) {
            if(list.get(i).getStart() >= last) {
                res.add(list.get(i));
                last = list.get(i).getFinish();
            }
        }

        print(res);
    }

    private void print(List<Activity> list) {
        int sum = 0;
        for (Activity e : list) {
            System.out.println(e.getName() + "  "+e.getStart()+"->"+e.getFinish());
            sum+=e.getCost();
        }
        System.out.println("Сумма стоимости всех активностей = "+sum);
    }
}
