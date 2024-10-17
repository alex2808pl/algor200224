package de.telran.lesson_15_20241017.two_frogs;

import de.telran.lesson_9_20240829.MyLinkedList;
import de.telran.lesson_9_20240829.Node;

import java.util.HashSet;
import java.util.Set;

public class MyLinkedListFloyd extends MyLinkedList {

    // определение зацикливание с помощью Set
    public boolean detectLoopSet() {
        Set<Node> set = new HashSet<>();
        while ( head != null) {
            // If we have already has this node in hashmap it means there is a cycle
            if (set.contains(head)) {
                return true;
            }
            // If we are seeing the node for the first time, insert it in hash
            set.add(head);
            head = head.getNext();
        }
        return false;
    }

    public Node getHead() {
        return head;
    }

    // определение зацикливание с помощью алгоритма Флойда (быстрой и медленной лягушки)
    public boolean detectLoopFloyd() {
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.getNext() != null) {
            fast = fast.getNext().getNext();  // Быстрый указатель движется на два узла
            slow = slow.getNext();  // Медленный указатель движется на один узел

            // Если быстрый и медленный указатели встречаются, значит, есть петля
            if(fast == slow) {
                return true;
            }
        }
        // Если мы дошли до конца списка без обнаружения петли
        return false;
    }

    // удаление элемента (отсчет порядкового номера ведеться с конца)
    public void removeNodeFromEnd(int idx) {
        Node slow = head;
        Node fast = head;

        for (int i = 0; i < idx; i++) {
            fast = fast.getNext();
        }

        while(fast.getNext() != null) {
            fast = fast.getNext();
            slow = slow.getNext();
        }

        slow.setNext(slow.getNext().getNext());
    }

}
