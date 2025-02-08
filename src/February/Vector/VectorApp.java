package February.Vector;

class VectorApp {
    public static void main(String[] args) {
        int maxSize = 9; // Размер массива
        Vector arr; // Ссылка на массив
        arr = new Vector(maxSize); // Создание массива
        arr.insert(77); // Вставка 11 элементов
        arr.insert(99);
        arr.insert(22);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(0);
        arr.insert(22);
        arr.insert(33);
        arr.insert(33);
        arr.display(); // Вывод элементов
    }
}

