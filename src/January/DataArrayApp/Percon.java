package DataArrayApp;

class Percon {
    private String lastName; private String firstName; private int age;
    public Percon(String last, String first, int a){
        lastName=last; firstName=first; age=a;
    }

    public void displayPerson(){
        System.out.print(lastName);
        System.out.print(" " + firstName);
        System.out.print(",Age:"+ age);
    }
    public String getLast(){
        return lastName;
    }
}
