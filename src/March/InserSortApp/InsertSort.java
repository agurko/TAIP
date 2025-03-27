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

    }
}  // Конец класса ArrayIns

