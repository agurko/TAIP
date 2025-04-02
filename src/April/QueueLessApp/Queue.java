package April.QueueLessApp;

class Queue {
    private int maxSize;
    private long[] queArray;
    private  int  front;
    private  int  rear;

    // Конструктор
    public Queue(int s) {
        maxSize = s+1;	// Массив на одну ячейку больше
        queArray = new long[maxSize];  // требуемого размера
        front  =  0;
        rear  =  -1;
    }
    // Вставка элемента в конец очереди
    public void insert(long j) {
        if(rear == maxSize-1)
            rear = -1;
        queArray[++rear] = j;
    }
    //--------------------------------------------------------------
    public long remove()	// Извлечение элемента в начале очереди
    {
        long temp = queArray[front++];
        if(front == maxSize)
            front  =  0; return  temp;
    }
    //--------------------------------------------------------------
    public long peek() // Чтение элемента в начале очереди
    {return queArray[front];}
    //--------------------------------------------------------------
    public boolean isEmpty() // true, если очередь пуста
    {return ( rear+1==front || (front+maxSize-1==rear) );}
    //--------------------------------------------------------------
    public boolean isFull() // true, если очередь заполнена
    {return ( rear+2==front || (front+maxSize-2==rear) );}
    //--------------------------------------------------------------
    public  int  size() // (assumes queue not empty)
    {
        if(rear  >=  front)	// Непрерывная последовательность
            return  rear-front+1;
        else // Несвязная последовательность
            return  (maxSize-front)  +  (rear+1);
    }
} // Конец класса Queue

