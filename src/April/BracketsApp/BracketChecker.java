package April.BracketsApp;

class BracketChecker {
    private String input;	// Входная строка
    //---- BracketChecker ------------------------------
    public BracketChecker(String in)	// Конструктор
    { input = in; }
    //- check ---
    public void check() {
        int stackSize =  input.length();	// Определение размера стека
        StackX theStack = new StackX(stackSize);  // Создание стека

// Последовательное чтение
        for(int j=0; j<input.length(); j++)  {
            char ch = input.charAt(j);	// Чтение символа
            switch(ch) {
                case '{':	// Открывающие скобки
                case '[':
                case '(':
                        theStack.push(ch);	// Занести в стек
                        break;
                case '}':	// Закрывающие скобки case ']':
                case ')':
                    if( !theStack.isEmpty() )	// Если стек не пуст,
                    {
                        char chx = theStack.pop(); // Извлечь и проверить
                        if( (ch=='}'  &&  chx!='{')  || (ch==']' && chx!='[') || (ch==')'  &&  chx!='(')  )
                        System.out.println("Ошибка: "+ch+" at "+j);
                    }
                    else	// Преждевременная нехватка элементов
                        System.out.println("Ошибка:  "+ch+"  at  "+j);
                    break;
                default:	// Для других символов действия не выполняются break;
            }
        }
// В этой точке обработаны все символы
        if( !theStack.isEmpty()  )
            System.out.println("Ошибка: Ожидается закрывающая скобка");
//        else
//            System.out.println("Сообщение: Скобки сбалансированы");
    }//--------------------------------------------------------------
} // Конец класса BracketChecker

