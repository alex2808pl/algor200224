package de.telran.lesson_7_20240815;

public class MainDynamicArray {
    public static void main(String[] args) {
        DynamicIntArray array = new DynamicIntArray();
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);
        System.out.println("count = "+array.getCount()+" ---- size = "+ array.getSize());
        array.printArray();

        array.add(6);
        System.out.println("count = "+array.getCount()+" ---- size = "+ array.getSize());
        array.printArray();

        // используем пользовательский коэффициент приращения массива
        DynamicIntArray array1 = new DynamicIntArray(5, 1.4F);
        array1.add(1);
        array1.add(2);
        array1.add(3);
        array1.add(4);
        array1.add(5);
        System.out.println("count = "+array1.getCount()+" ---- size = "+ array1.getSize());
        array1.printArray();

        array1.add(6);
        System.out.println("count = "+array1.getCount()+" ---- size = "+ array1.getSize());
        array1.printArray();
    }
}
