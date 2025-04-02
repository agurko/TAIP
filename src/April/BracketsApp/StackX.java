package April.BracketsApp;

class StackX {
    private int maxSize; private char[] stackArray;
    private  int  top;
    //---- Конструктор
    public  StackX(int  s) {
        maxSize = s;
        stackArray = new char[maxSize];
        top  =  -1;
    }
    //---- Размещение элемента на вершине стека ----------
    public void push(char j) {stackArray[++top] = j;}

    //-- Извлечение элемента с вершины стека ------------
    public  char  pop() {return stackArray[top--];
    }
    //---- Чтение элемента с вершины стека -----------
    public  char  peek() {return stackArray[top];
    }
    //---- True, если стек пуст ------------------------
    public boolean isEmpty()	{return (top == -1);
    }
} // Конец класса StackX

