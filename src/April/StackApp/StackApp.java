package April.StackApp;

class StackApp {
    public static void main(String[] args) {
        // Создание нового стека
        StackX theStack = new StackX(10);
        // Занесение элементов в стек
        System.out.println("Помещаем данные в стек");
        theStack.push(20);
        System.out.print(theStack.peek() + " ");
        theStack.push(40);
        System.out.print(theStack.peek() + " ");
        theStack.push(60);
        System.out.print(theStack.peek() + " ");
        theStack.push(80);
        System.out.print(theStack.peek() + " ");

        System.out.println("\nИзвлечение данных их стека");
        while (!theStack.isEmpty()) {
            long value = theStack.pop();
            System.out.print(value);
            System.out.print(" ");
        }
    }
}

