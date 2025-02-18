package January.OrderArryApp;

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
    }
}

