package March.ObjectSortApp;

class Person {
    private final String lastName;
    private final String firstName;
    private final int age;

    // Конструктор
    public Person(String last, String first, int a) {
        lastName = last;
        firstName = first;
        age = a;
    }

    //--- displayPerson ------
    public void displayPerson() {
        System.out.print(lastName);
        System.out.print(" " + firstName);
        System.out.println(", Age: " + age);
    }

    //Получение фамилии
    public String getLast() {
        return lastName;
    }
}  // Конец класса Person

