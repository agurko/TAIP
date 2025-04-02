package April.QueueLessApp;

class QueueApp {
    public static void main(String[] args) {
// Очередь из 5 ячеек
        Queue theQueue = new Queue(5);
// Вставка 4 элементов
        theQueue.insert(10);
        theQueue.insert(20);
        theQueue.insert(30);
        theQueue.insert(40);
// Извлечение 3 элементов (10, 20, 30)
        theQueue.remove();
        theQueue.remove();
        theQueue.remove();

// Вставка еще 4 элементов (с циклическим переносом)
        theQueue.insert(50);
        theQueue.insert(60);
        theQueue.insert(70);
        theQueue.insert(80);
        while (!theQueue.isEmpty()) {
            long n = theQueue.remove();
            System.out.print(n + " ");

        }
        System.out.println();
    }
}// Конец класса QueueApp

