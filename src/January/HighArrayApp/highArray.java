package January.HighArrayApp;

class HighArray {
    private final long[] a;    // Ссылка на массив a
    private int nElems;    // Количество элементов в массиве

    //------Конструктор ------------------------------
    public HighArray(int max) {
        a = new long[max];    // Создание массива
        nElems = 0;    // Пока нет ни одного элемента
    }

    //------- Поиск заданного значения ----------------------------------------------------
    public boolean find(long searchKey) {
        int j;
        for (j = 0; j < nElems; j++)    // Для каждого элемента
            if (a[j] == searchKey)    // Значение найдено?
                break;    // Да выход из цикла
        if (j == nElems)    // Достигнут последний элемент?
            return false;    // Да
        else {
            return true;    // Нет
        }
    }

    //----- Вставка элемента в массив -----------------
    public void insert(long value) {
        a[nElems] = value;    // Собственно вставка
        nElems++;    // Увеличение размера
    }

    //-------- Поиск заданного значения ------------
    public boolean delete(long value) {
        int j;
        for (j = 0; j < nElems; j++)
            if (value == a[j])
                break;
        if (j == nElems)    // Найти не удалось
            return false;
        else    // Значение найдено
        {
            for (int k = j; k < nElems; k++) // Сдвиг последующих элементов
                a[k] = a[k + 1];
            nElems--;    // Уменьшение размера
            return true;
        }
    }

    //------- Вывод содержимого массива -------------------------
    public void display() {
        for (int j = 0; j < nElems; j++)    // Для каждого элемента
            System.out.print(a[j] + " "); // Вывод
        System.out.println();
    }
} // Конец класса HighArray

