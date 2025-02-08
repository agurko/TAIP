package April.StackApp;

class StackX {
    private int maxSize;    // Размер массива
    private long[] stackArray;
    private int top;    // Вершина стека

    // Конструктор
    public StackX(int s) {
        maxSize = s;    // Определение размера стека
        stackArray = new long[maxSize];  // Создание массива
        top = -1;    // Пока нет ни одного элемента
    }

    // Размещение элемента на вершине стека
    public void push(long j) {
        stackArray[++top] = j;    // Увеличение top, вставка элемента
    }

    // Извлечение элемента с вершины стека
    public long pop() {
        return stackArray[top--]; // Извлечение элемента, уменьшение top
    }

    // Чтение элемента с вершины стека
    public long peek() {
        return stackArray[top];
    }

    // True, если стек пуст
    public boolean isEmpty() {
        return (top == -1);
    }

    // True, если стек полон
    public boolean isFull() {
        return (top == maxSize - 1);
    }
} //  StackX


