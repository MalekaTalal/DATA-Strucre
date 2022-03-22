package QueueWithArray;

public class ArrayQueue<E> implements Queue<E> {

    E data[];
    static int capacity=100;
    int front=0;
    int sz=0;

    public ArrayQueue(int c) {
        data= (E[]) new Object[c];
    }

    public ArrayQueue() {
        this(capacity);
        // data= (E[]) new Object[capacity]; كأنني كتبت ما داخل الكونستركتور الأول بس بدون ال سي و بدلتها بمتغير الكاباسيتي
    }

    @Override
    public boolean isEmpty() {
        return sz==0;
    }

    @Override
    public int size() {
        return sz;
    }

    @Override
    public E first() {
        if (isEmpty()) return null;
        return data[front];
    }

    @Override
    public void enqueue(E element) throws  IllegalStateException{
      if (sz== data.length) throw new IllegalStateException("QueueWithArray.Queue is full");
      int x= ( front+sz )%data.length; //احتسب الموقع الجديد
      data[x]=element;
      sz ++;
    }

    @Override
    public E dequeue() {
        if (isEmpty()) return null;
        E del=data[front];
        data[front]=null;
        front=(front+1)%data.length;
        sz--;
        return del;
    }
}
