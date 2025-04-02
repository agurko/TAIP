package April.BracketsApp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class BracketsApp {
    public static void main(String[] args) throws IOException {
        String input; while(true) {
            System.out.print(
                    "Введите пример: ");
            System.out.flush();
            input = getString();	// Чтение строки с клавиатуры
            if( input.equals("") )	// Завершение, если [Enter]
                break;
// Создание объекта
            BracketChecker theChecker = new BracketChecker(input);
            theChecker.check();	// Проверка парных скобок
        }
    }
    //--------------------------------------------------------------
    public static String getString() throws IOException {
        InputStreamReader isr =  new  InputStreamReader(System.in);
        BufferedReader br  =  new  BufferedReader(isr);
        String s = br.readLine(); return  s;
    }
//--------------------------------------------------------------
} // Конец класса BracketsApp

