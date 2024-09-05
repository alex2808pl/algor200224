package de.telran.lesson_10_20240905;

import java.util.ArrayList;
import java.util.List;

public class MainActivity {
    public static void main(String[] args) {
        List<Activity> list = new ArrayList<>();
//        list.add(new Activity("a", 16,17));
//        list.add(new Activity("b", 15,16));
//        list.add(new Activity("c", 10,15));
//        list.add(new Activity("d", 12,13));
//        list.add(new Activity("e", 14,17));
//        list.add(new Activity("f", 10,11));
//        list.add(new Activity("g", 14,15));
//        list.add(new Activity("i", 11,13));

        list.add(new Activity("a", 16,17,2));
        list.add(new Activity("b", 15,16, 2));
        list.add(new Activity("c", 10,15, 1));
        list.add(new Activity("d", 12,13, 1));
        list.add(new Activity("e", 14,17,2));
        list.add(new Activity("f", 10,11,1));
        list.add(new Activity("g", 14,15,2));
        list.add(new Activity("i", 11,13,2));

        ActivitySelection activities = new ActivitySelection();
        activities.selectActivity(list);

    }
}
