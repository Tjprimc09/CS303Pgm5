public class MyStack<E extends Comparable<? super E>> {

    private final MyDblLinkedList<E> list = new MyDblLinkedList<E>();

    // it's helpful to think of a stack as a deck of cards.
    // view the list going from top to bottom instead of left to right.
    //ADD ALL STACK FUNCTIONS
    public void push(E e) { // when you push an element onto a stack...
        list.addFirst(e); // you add it to the top of the deck (the front of the list)
    }

    public E pop() { // when you pop an element off a stack...
        return list.removeFirst(); // you remove it from the top of the deck (the front of the list)
    }
    public E peek() { // and so on...
        return list.getFirst();
    }
    public int size() {
        return list.size();
    }
    public boolean isEmpty() {
        return list.isEmpty();
    }
    public void clear() {
        list.clear();
    }
    public String stackString() {
        return list.toString();
    }

}

