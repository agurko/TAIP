package January.OrderArryApp;

class OrderArray {
    private long[] a; // Ссылка на массив a
    private int nElems; // Количество элементов данных
    //---Конструктор ------------------------
    public OrderArray(int max) {
        a = new long[max]; // Создание массива nElems = 0;
    }
    //-----Длина массива---------------------------------
    public int size() { return nElems; }
    //-----Поиск--------------------------------------------
    public int find(long searchKey) {
        int lowerBound = 0;
        int upperBound = nElems-1;
        int curIn;

        while(true) {
            curIn = (lowerBound + upperBound ) / 2;
            if(a[curIn]==searchKey)
                return curIn; // Элемент найден
            else
            if(lowerBound > upperBound)
                return nElems; // Элемент не найден
            else {
// Деление диапазона
                if(a[curIn] < searchKey)
                    lowerBound = curIn + 1; // В верхней половине
                else
                    upperBound = curIn - 1; // В нижней половине
            }
        }
    }
    //---- Вставка элемента в массив ---------------------
    public void insert(long value) {
        int j;
        for(j=0; j<nElems; j++) // Определение позиции вставки
            if(a[j] > value) // (линейный поиск)
                break;
        for(int k=nElems; k>j; k--) // Перемещение последующих элементов
            a[k] = a[k-1];
        a[j] = value; // Вставка
        nElems++; // Увеличение размера
    }
    //----- Удаление элемента из массива ----------------------
    public boolean delete(long value) {
        int j = find(value);
        if(j==nElems) // Найти не удалось
            return false;
        else // Элемент найден
        {
            for(int k=j; k<nElems; k++) // Перемещение последующих элементов
                a[k] = a[k+1];
            nElems--; // Уменьшение размера
            return true;
        }
    }
    //--- Вывод содержимого массива ----------
    public void display() {
        for(int j=0; j<nElems; j++) // Перебор всех элементов
            System.out.print(a[j] + " "); // Вывод текущего элемента
        System.out.println();
    }
}

