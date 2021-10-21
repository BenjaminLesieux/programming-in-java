package agh.ii.prinjava.proj1.impl;

public class DLinkList<E> {

    /**
     * This variable is the head of the list from which we'll be able to go through
     * all the elements
     * */
    private Node<E> head;

    private Node<E> tail;

    public DLinkList() {}

    /**
     * Adds an element at the start of the linked list. Therefore, the value of the head
     * is shifted to the new value of {@code element}.
     *
     * @param element The new head
     * */
    public void addFirst(E element) {
        if (head == null || tail == null) {
            head = new Node<>(element);
            tail = head;
        }

        else {
            Node<E> prevHead = head;
            head = new Node<>(element);
            prevHead.prev = head;
            head.next = prevHead;
        }
    }

    /**
     * Removes the head of the list and returns its value.
     *
     * @throws IllegalStateException if the list is already empty
     * @return the value of the first Node
     * */
    public E removeFirst() {
        if (head == null || tail == null)
            throw new IllegalStateException("You cannot remove the first element when the list is empty");

        Node<E> temp = head;
        head = head.next;

        if (head != null)
            head.prev = null;
        else
            tail = null;

        return temp.elem;
    }

    /**
     * Adds an element at the end of the linked list. If there is no element in the list,
     * a new head will be created with the value of {@code element} -> this would be equivalent to what
     * {@link #addFirst(E element)} would do in the same situation.
     *
     * @param element The element to be added at the end of the list
     * */
    public void addLast(E element) {
        if (head == null || tail == null) {
            head = new Node<>(element);
            tail = head;
        }

        else {
            tail.next = new Node<>(element);
            Node<E> prev = tail;
            tail = tail.next;
            tail.prev = prev;
        }
    }

    /**
     * Removes the last element of the list and returns its value.
     * In case the list has no elements, an error will be thrown.
     *
     * @throws IllegalStateException if the list is already empty
     * @return the value of the last Node
     * */
    public E removeLast() {
        if (head == null || tail == null)
            throw new IllegalStateException("Cannot remove the last element when the list is empty");

        E value = tail.elem;
        tail = tail.prev;

        if (tail != null)
            tail.next = null;
        else
            head = null;

        return value;
    }

    /**
     * This function seeks the value of the element at the {@code index} index of the LinkedList
     * and returns its value
     *
     * @param index The targeted index
     * @throws IllegalStateException if the value of {@code index} exceeds the size of the LinkedList
     * @return the value of the Node at the index
     * */
    public E seek(int index) {
        if (index > getSize())
            throw new IllegalStateException("This index is to big, the size of the list is " + getSize());

        Node<E> target = head;

        for (int i = 0; i < index; i++) {
            target = target.next;
        }

        return target.elem;
    }

    /**
     * @return the current size of the linkedlist
     * */
    public int getSize() {
        if (this.head == null) return 0;

        int size = 0;

        for (Node<E> node = head; node != null; node = node.next) {
            size++;
        }

        return size;
    }

    /**
     * Represents a node of the linked list. This node can contain any type of data
     * and can point to the {@code previous Node} or the {@code next Node}
     * in the linked list.
     *
     * For the implementation of the LinkedList to work, there should be one (the first) {@code Node} - "the head" -
     * which doesn't have any link to a {@code previous Node}
     * */
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

