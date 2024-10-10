package de.telran.lesson_14_20241010;

import java.util.HashSet;
import java.util.Set;

public class MainHash {
    public static void main(String[] args) {
        String str1 = "Мама мыла раму!";
        System.out.println(str1.hashCode());
        String str2 = "Мама мылa раму!"; //латинская а
        System.out.println(str2.hashCode());
        System.out.println(str1.hashCode()==str2.hashCode());

        Cat cat1 = new Cat("Вася", 15);
        System.out.println("Cat1 hash = "+cat1.hashCode());
        Cat cat2 = new Cat("Вася", 15);
        System.out.println("Cat2 hash = "+cat2.hashCode());

        System.out.println("cat1.equals(cat2) = "+cat1.equals(cat2)); // ==

        //Коллизия hashCode
        str1 = "DB";
        str2 = "Ca";
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
        System.out.println("hashCode ->"+(str1.hashCode()==str2.hashCode()));
        System.out.println("equals ->"+str1.equals(str2));

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(5);
        set.add(8);
        System.out.println(set);
        set.add(21);
        set.add(6);
        System.out.println(set);

        Set<Cat> cats = new HashSet<>();
        cats.add(cat1);
        cats.add(cat2);
        System.out.println(cats);

        // hashCode("DB") ==  hashCode("Ca")
        Cat cat3 = new Cat("DB", 15);
        Cat cat4 = new Cat("Ca", 15);
        cats.add(cat3);
        cats.add(cat4);
        System.out.println(cats);



    }
}
