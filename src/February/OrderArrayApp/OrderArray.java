package February.OrderArrayApp;

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
        int left = 0;
        int right = nElems - 1;

        // Найти позицию вставки с помощью двоичного поиска
        while (left <= right) {
            int mid = (left + right) / 2;
            if (a[mid] < value) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        int j = left;
        // Сдвиг элементов вправо для освобождения места
        for (int k = nElems; k > j; k--) {
            a[k] = a[k - 1];
        }
        // Вставка нового элемента
        a[j] = value;
        nElems++; // Увеличение размера

    }
    //----- Удаление элемента из массива ----------------------
    public boolean delete(long value) {
        // в find реализован метод двоичного поиска
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
    // Метод слияния двух массивов
    public static OrderArray merge(OrderArray b, OrderArray c) {
        int len1 = b.nElems;
        int len2 = c.nElems;
        OrderArray res = new OrderArray(len1 + len2);
        int i = 0, j = 0, k = 0;
        while (i < len1 && j < len2) {
            if (b.a[i] <= c.a[j]) {
                res.a[k++] = b.a[i++];
            } else {
                res.a[k++] = c.a[j++];
            }
        }
        while (i < len1) {
            res.a[k++] = b.a[i++];
        }
        while (j < len2) {
            res.a[k++] = c.a[j++];
        }
        res.nElems = len1 + len2;
        return res;
    }

    //--- Вывод содержимого массива ----------
    public void display() {
        for(int j=0; j<nElems; j++) // Перебор всех элементов
            System.out.print(a[j] + " "); // Вывод текущего элемента
        System.out.println();
    }
}


