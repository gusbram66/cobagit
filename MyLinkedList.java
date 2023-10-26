package algodatb2023.tugasLL;

import algodatb2023.hewan.*;

public class MyLinkedList {
    private MyNode head = null;
    private MyNode tail = null;
    private MyNode current = null;

    public void add(MyNode node) {
        if (head == null) {
            head = node;
            tail = node;
            current = tail;
        } else {
            tail.setNext(node);
            tail = node;
            node.setNext(null);
            current = tail;
        }
    }

    public void first() {
        current = head;
    }

    public void advance() {
        if (current != null) {
            current = current.getNext();
        }
    }

    public boolean isLast() {
        return current != null && current == tail;
    }

    public boolean search(Hewan hewan) {
        MyNode p = head;
        while (p != null) {
            if (p.getElemen() == hewan) {
                return true;
            }
            p = p.getNext();
        }
        return false;
    }

    public MyNode retrieve() {
        return current;
    }

    public void insertNext(MyNode obj) {
        if (current != null) {
            obj.setNext(current.getNext());
            current.setNext(obj);
            if (current == tail) {
                tail = obj;
            }
        }
    }

    public void deleteNext() {
        if (current != null && current.getNext() != null) {
            MyNode toDelete = current.getNext();
            current.setNext(toDelete.getNext());
            if (toDelete == tail) {
                tail = current;
            }
        }
    }

    public MyNode getHead() {
        return this.head;
    }

    public void cetak() {
        MyNode p = this.head;
        System.out.println("#########");
        while (p.getNext() != null) {
            Hewan x = p.getElemen();
            System.out.println(x.getNama());
            p = p.getNext();
        }

        Hewan x = p.getElemen();
        System.out.println(x.getNama());
        System.out.println("#########");
    }
}
