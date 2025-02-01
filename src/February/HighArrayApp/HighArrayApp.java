package February.HighArrayApp;

class HighArrayApp {
    public static void main(String[] args) {
        // Лекция 2 Задания 1, 2, 3, 6
        int maxSize = 100;	// Размер массива
        HighArray arr;	// Ссылка на массив
        arr = new HighArray(maxSize); // Создание массива

        arr.insert(77);	// Вставка 10 элементов
        arr.insert(99); arr.insert(44); arr.insert(55); arr.insert(22);
        arr.insert(88); arr.insert(11); arr.insert(0);  arr.insert(66);
        arr.insert(33);
        arr.display();            // Вывод элементов

        int searchKey = 35;	// Поиск элемента
        if( arr.find(searchKey) )
            System.out.println("Found " + searchKey);
        else
            System.out.println("Can't find " + searchKey);
        arr.delete(0); arr.delete(55); arr.delete(99);	// Удаление трех элементов
        arr.display();

// Тестирование - поиск максимального элемента ======
       System.out.println("Максимальное значениe: " + arr.getMax());
        arr = new HighArray(0); // Создание пустого массива
        System.out.println("Максимальное значениe: " + arr.getMax());

        HighArray arr2 = new HighArray(maxSize); // Создание массива
        arr2.insert(77);	// Вставка 10 элементов
        arr2.insert(99); arr2.insert(44); arr2.insert(55); arr2.insert(22);
        arr2.insert(88); arr2.insert(11); arr2.insert(0);  arr2.insert(66);
        arr2.insert(33);

//Тестирование - Удаление максимального значения -------------------------
            arr2.removeMax();
            System.out.println("максимальное значениe удалено:  " + arr2.getMax());
            arr2.display();

//Тестирование - Сортировка  -------------------------
        HighArray res = new HighArray(10);
        for(int k=0; k<10; k++) {
            long tmp = arr2.getMax();
            arr2.removeMax();
            if (tmp == -1)
                break;
            else
                res.insert(tmp);
        }
        res.display();
// ----- Тестирование  noDups -----------------------------
        System.out.println("Тестирование noDups ");
        arr2 = new HighArray(maxSize); // Создание массива
        arr2.insert(99);	// Вставка 10 элементов
        arr2.insert(99); arr2.insert(44); arr2.insert(44); arr2.insert(22);
        arr2.insert(88); arr2.insert(44); arr2.insert(22);  arr2.insert(22);
        arr2.insert(88);
        arr2.display();
        arr2.noDups();
        arr2.display();



    }
}

