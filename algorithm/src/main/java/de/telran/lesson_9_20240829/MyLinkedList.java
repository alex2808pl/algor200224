package de.telran.lesson_9_20240829;

public class MyLinkedList {
    private Node head;

    // Вставки
    public void pushToHead(int data) {
        Node newNode = new Node(data, null);

        newNode.setNext(head);
        head = newNode;
    }

    public void pushToTail(int data) {
        Node newNode = new Node(data, null);

        // список пустой
        if(head == null) {
            head = newNode;
            return;
        }

        Node nodeTail = getTail();

        // вставляем
        nodeTail.setNext(newNode);

    }

    public void pushToIndex(int index, int data) {
        Node newNode = new Node(data, null);
        Node current = head;
        int jump;

        if (index < 1) {
            pushToHead(data);
        } else {
            jump = 0;
            while (jump < index - 1) {
                current = current.getNext();
                jump++;
            }

            newNode.setNext(current.getNext());
            current.setNext(newNode);
        }

    }


    // Удаление
    public void removeFirst() {
        if(head == null) return;

        Node temp = head;
        head = head.getNext();
        temp.setNext(null);
    }

    public void removeLast() {
        if(head == null) return;

        Node current = head;
        Node previous = null;

        while (current.getNext() != null) {
            previous = current;
            current = current.getNext();
        }

        if(previous != null)
            previous.setNext(null);
        else { // был всего один элемент в списке
            head = null;
        }

    }

    public void remove(int index) {
        Node current = head;
        int jump;
        if (index < 1) {
            removeFirst();
        } else {
            jump = 0;
            while (jump < index - 1) {
                current = current.getNext();
                jump++;
            }
            current.setNext(current.getNext().getNext());
        }
    }

    // Получить элемент
    public int get(int index) {
        int jump = -1;
        if (head == null) {
            return -1;
        }
        if (index < 0 || index > size()) {
            return -1;
        }

        Node node = head;
        while (node != null) {
            jump++;
            if (jump == index) {
                return node.getData();
            }
            node = node.getNext();
        }
        return -1;
    }

    // размер списка
    public int size() {
        int count = 0;
        Node node = head;
        while (node != null) {
            count++;
            node = node.getNext();
        }
//        for (node = head; node != null; node = node.getNext()) {
//            count++;
//        }
        return count;
    }

    public void print() {
        Node node = head;
        System.out.print("[");
        while (node != null) {
            System.out.print(node.getData()+" ");
            node = node.getNext();
        }
        System.out.println("]");
    }


    private Node getTail() {
        // найдем хвост (последний элемент)
        Node node = head;
        Node nodeTail = null;
        while (node != null) {
            nodeTail = node;
            node = node.getNext();
        }
        return nodeTail;
    }
}

//*pushToHead(int data),
//*pushToTail(int data),
//*pushToIndex(int index, int data)
//*removeFirst(),
//*removeLast(),
//remove(int index)
//get(int index)
//*size()
//*print()

