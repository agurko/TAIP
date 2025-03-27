package March.BubbleSortApp;

public class ArrayBubCompare {
    private final long[] a;    // Ссылка на массив a
    private static int nElems;    // Количество элементов данных

    public ArrayBubCompare(int max)    // Конструктор
    {
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

    //-----bubbleSort---------------------------------------------------------

    public  void bubbleSort1(){
        for (int out = nElems - 1; out>0; out--){
            for (int in = 0; in < out; in++){
                if (a[in] > a[in+1]){
                    swap(in, in+1);
                }
            }
        }

    }

    public  void bubbleSort2(){
        int in = 0, out = nElems;

        while (in<out - 1) {
            if (a[in]>a[in+1]) {
                long currElem = a[in];
                a[in] = a[in+1];
                a[in+1] = currElem;
            }

            in++;
            if (in == out-1) {
                in = 0;
                out--;
            }
        }



    }

    //-----swap---------------------------------------------------------
    private void swap(int one, int two) {
        long temp = a[one];
        a[one] = a[two];
        a[two]= temp;
    }

}
