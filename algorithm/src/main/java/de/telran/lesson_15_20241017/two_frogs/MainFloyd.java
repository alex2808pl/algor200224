package de.telran.lesson_15_20241017.two_frogs;

public class MainFloyd {
    public static void main(String[] args) {
        MyLinkedListFloyd lists = new MyLinkedListFloyd();
        lists.pushToHead(5);
        lists.pushToHead(10);
        lists.pushToHead(3);
        lists.pushToHead(8);
        lists.pushToHead(7);
        lists.pushToHead(9);

        lists.print();

        // Зацикливаем список (соединяем хвост с нодой со значением 3)
//        Node end = lists.getHead();
//        Node cycle = null;
//        while(end.getNext() != null) {
//            if(end.getData()==3) cycle = end;
//            end = end.getNext();
//        }
//        end.setNext(cycle);


        System.out.println("LoopSet = "+lists.detectLoopSet());
        System.out.println("Алгоритм Флойда = "+lists.detectLoopFloyd());


        MyLinkedListFloyd lists2 = new MyLinkedListFloyd();
        lists2.pushToHead(4);
        lists2.pushToHead(3);
        lists2.pushToHead(2);
        lists2.pushToHead(1);

        lists2.print();

        lists2.removeNodeFromEnd(2);

        lists2.print();


    }
}
