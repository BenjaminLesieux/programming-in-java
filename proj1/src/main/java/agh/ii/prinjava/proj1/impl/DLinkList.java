package agh.ii.prinjava.proj1.impl;

public class DLinkList<E> {

    /**
     * This variable is the head of the list from which we'll be able to go through
     * all the elements
     * */
    private Node<E> head;

    public DLinkList() {

    }

    public void addFirst(E element) {
        if (head == null) {
            head = new Node<>(element);
        }

        else {
            Node<E> prevHead = head;
            head = new Node<>(element);
            prevHead.prev = head;
            head.next = prevHead;
        }
    }

    public void removeFirst() {
        if (head == null)
            throw new IllegalStateException("You cannot remove the first element when the list is empty");

        head = head.next;
        head.prev = null;
    }

    public void addLast(E element) {
        if (head == null) {
            head = new Node<>(element);
        }

        else {
            Node<E> temp = head;

            while (temp.next != null) temp = temp.next;

            temp.next = new Node<>(element);
        }
    }

    public void removeLast() {
        if (head == null)
            throw new IllegalStateException("Cannot remove the last element when the list is empty");

        Node<E> temp = head;
        Node<E> prev = head;

        while (temp.next != null) {
            prev = temp;
            temp = temp.next;
        }

        prev.next = null;
    }
    // ...
    private static class Node<T> {
        T elem;
        Node<T> next;
        Node<T> prev;

        public Node(T elem) {
            this.elem = elem;
            this.next = null;
            this.prev = null;
        }
    }

    @Override
    public String toString() {

        StringBuilder result = new StringBuilder();

        for (Node<E> node = head; node != null; node = node.next) {
            if (node == head) {
                result.append(node.elem.toString()).append("<-");
            }

            else if(node.next == null) {
                result.append("->").append(node.elem.toString()).append("->").append("X");
            }

            else {
                result.append("->").append(node.elem.toString()).append("<-");
            }
        }

        return result.toString();
    }
}
