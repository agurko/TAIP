package March.InserSortApp;

class ArrayIns {
    private long[] a;    // Ссылка на массив a
    private int nElems;    // Количество элементов данных

    // Конструктор
    public ArrayIns(int max) {
        a = new long[max];    // Создание массива
        nElems = 0;    // Пока нет ни одного элемента
    }

    // Вставка элемента в массив
    public void insert(long value) {
        a[nElems] = value;    // Собственно вставка
        nElems++;    // Увеличение размера
    }

    // Вывод содержимого массива
    public void display() {
        for (int j = 0; j < nElems; j++)    // Для каждого элемента
            System.out.print(a[j] + " "); // Вывод
        System.out.println();
    }

    //--------- insertionSort -------------------------
    public void insertionSort() {
        int in, out;
        // out разделительный маркер
        for (out = 1; out < nElems; out++) {
            long temp = a[out];    // Скопировать помеченный элемент
            in = out;    // Начать перемещения с out
            while (in > 0 && a[in - 1] >= temp) // Пока не найден меньший элемент
            {
                a[in] = a[in - 1];    // Сдвинуть элемент вправо
                --in;    // Перейти на одну позицию влево
            }
            a[in] = temp;    // Вставить помеченный элемент
        }
    }
}  // Конец класса ArrayIns

