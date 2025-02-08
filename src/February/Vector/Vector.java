package February.Vector;

class Vector {
    private long[] a; // Ссылка на массив a
    private int nElems; // Количество элементов в массиве
    private int maxElems;

    //------Конструктор ------------------------------
    public Vector(int max) {
        a = new long[max]; // Создание массива
        nElems = 0; // Пока нет ни одного элемента
        maxElems = max;
    }

    //----- Вставка элемента в массив -----------------
    public void insert(long value) {
        if (maxElems == nElems) {
            long[] b = a;
            a = new long[nElems + 1];
            for (int j=0;j<nElems;j++)
                a[j] = b[j];
            a[nElems] = value;
            nElems++;
            maxElems++;
        } else {
            a[nElems] = value; // Собственно вставка
            nElems++; // Увеличение размера
        }
    }

    //------- Вывод содержимого массива -------------------------
    public void display() {
        for (int j = 0; j < nElems; j++) // Для каждого элемента
            System.out.print(a[j] + " "); // Вывод
        System.out.println();
    } // Конец класса VectorArray
}

