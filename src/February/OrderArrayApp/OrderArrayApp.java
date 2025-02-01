package February.OrderArrayApp;
// Лекция 2 Задания 4 и 5
class OrderArrayApp {
    public static void main(String[] args) {
        int maxSize = 100;      // Размер массива
        OrderArray arr; // Ссылка на массив
// Создание массива
        arr = new OrderArray(maxSize);
// Вставка 10 элементов
        arr.insert(77);  arr.insert(33);
        arr.insert(99); arr.insert(44);
        arr.insert(55); arr.insert(22);
        arr.insert(88); arr.insert(11);
        arr.insert(0); arr.insert(66);
// Поиск элемента
        int searchKey = 55; // Поиск элемента
        if( arr.find(searchKey) != arr.size() )
            System.out.println("Found " + searchKey); else
            System.out.println("Can't find " + searchKey);
        arr.display();// Вывод содержимого
// Удаление трех элементов
        arr.delete(0);
        arr.delete(55);
        arr.delete(99);
        arr.display();
// склейка двух массивов mege
        System.out.println("Тестирование склейки массивов");
        OrderArray arr5 = new OrderArray(maxSize); // Сюда будем собирать
        System.out.println("Первый массив массив");
        OrderArray arr3 = new OrderArray(maxSize);
        arr3.insert(77); // Вставка 10 элементов
        arr3.insert(99); arr3.insert(44);
        arr3.insert(55); arr3.insert(22);
        arr3.insert(88); arr3.insert(11);
        arr3.insert(0); arr3.insert(66); arr3.insert(33);
        arr3.display();
        System.out.println("Второй массив массив");
        OrderArray arr4 = new OrderArray(maxSize);
        arr4.insert(52);
        arr4.insert(42);
        arr4.insert(72);
        arr4.insert(42);
        arr4.display();
        arr5 = OrderArray.merge(arr3, arr4);
        System.out.println("Выводим склеенный массив");
        arr5.display();
    }
}

