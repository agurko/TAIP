package March.SelectSortApp;

class ArraySelect {
    private final long[] a;    // Ссылка на массив a
    private int nElems;    // Количество элементов данных

    // Конструктор
    public ArraySelect(int max) {
        a = new long[max];    // Создание массива
        nElems = 0;    // Пока нет ни одного элемента
    }

    // Вставка элемента в массив
    public void insert(long value) {
        a[nElems] = value;    // Собственно вставка
        nElems++;    // Увеличение размера
    }

    /// Вывод содержимого массива -
    public void display() {
        for (int j = 0; j < nElems; j++)    // Для каждого элемента
            System.out.print(a[j] + " "); // Вывод
        System.out.println();
    }

    //---- selectionSort -----
    public void selectionSort() {
        int out, in, min;
        for (out = 0; out < nElems - 1; out++)    // Внешний цикл
        {
            min = out;    // Минимум
            for (in = out + 1; in < nElems; in++) // Внутренний цикл
                if (a[in] < a[min])    // Если значение min больше,
                    min = in;    // значит, найден новый минимум
            swap(out, min);    // swap
        }
    }

    //------ swap -----------------------------
    private void swap(int one, int two) {
        long temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }
} //--------------------------------------------------------------

