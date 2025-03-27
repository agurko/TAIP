package March.BubbleSortApp;

class BubbleSortApp {
    public static void main(String[] args) {
        int maxSize = 10000;    // Размер массива
        ArrayBub arr;    // Ссылка на массив
        arr = new ArrayBub(maxSize); // Создание массива

// Вставка 10 элементов arr.insert(99);
//        arr.insert(77);
//        arr.insert(44);
//        arr.insert(55);
//        arr.insert(22);
//        arr.insert(88);
//        arr.insert(11);
//        arr.insert(11);
//        arr.insert(66);
//        arr.insert(33);

        for(int j=0; j<maxSize; j++) // Заполнение массива
        { // случайными числами
            long n = (long)( java.lang.Math.random()*(maxSize-1) );
            arr.insert(n);
        }


//        arr.display();      // Вывод элементов
//       arr.bubbleSort();    // Пузырьковая сортировка элементов
//        arr.display();        // Повторный вывод
 // Сравнение алгоритмов
        ArrayBubCompare arr2 = new ArrayBubCompare(maxSize); // Создание массива
        long startTime = System.nanoTime(); // Начало замера времени
        arr2.bubbleSort1();
        long endTime = System.nanoTime(); // Конец замера времени
        System.out.println(endTime-startTime);
        startTime = System.nanoTime(); // Начало замера времени
        arr2.bubbleSort2();
        endTime = System.nanoTime(); // Конец замера времени
        System.out.println(endTime-startTime);
    }
} // Конец класса BubbleSortApp
