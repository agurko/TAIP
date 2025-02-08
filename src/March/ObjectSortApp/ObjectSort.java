package March.ObjectSortApp;

class ArrayInOb {
    private Person[] a; // Ссылка на масив a

    private int nElems; // Количество элементов данных

    // Конструктор
    public ArrayInOb(int max) {
        a = new Person[max];    // Создание массива
        nElems = 0;    // Пока нет ни одного элемента
    }

    //-----insert------------------------------
// Включение записи в массив
    public void insert(String last, String first, int age) {
        a[nElems] = new Person(last, first, age);
        nElems++;    // Увеличение размера
    }

    //-- display -------
    public void display()    // Вывод содержимого массива
    {
        for (int j = 0; j < nElems; j++)    // Для каждого элемента
            a[j].displayPerson();    // Вывод
        System.out.println();
    }

    //---- insertionSort ----------
    public void insertionSort() {
        int in, out;
// out разделительный маркер
        for (out = 1; out < nElems; out++) {
            Person temp = a[out];    // Скопировать помеченный элемент
            in = out;    // Начать перемещения с out
// Пока не найден меньший элемент
            while (in > 0 && a[in - 1].getLast().compareTo(temp.getLast()) > 0) {
                a[in] = a[in - 1];    // Сдвинуть элемент вправо
                --in;    // Перейти на одну позицию влево
            }
            a[in] = temp;    // Вставить помеченный элемент
        }
    }
} // Конец класса ArrayInOb

