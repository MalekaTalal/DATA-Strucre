package CirculatlyQueue;

public class CircularlyQ<E> implements CircularlyQueue<E>{
     CircularlyLinkedList<E> list=new CircularlyLinkedList<E>();

    @Override
    public void rotate() {
      list.rotate();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public E first() {
        return list.first();
    }

    @Override
    public void enqueue(E element) {
        list.addLast(element);
    }

    @Override
    public E dequeue() {
        return list.removeFirst();
    }
}
