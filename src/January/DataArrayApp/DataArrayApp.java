package January.DataArrayApp;
class DataArrayApp {
    public static  void main(String[] args){
        int maxSize=100;
        DataArray arr;
        arr=new DataArray(maxSize);
        System.out.println("\nВставка 10 элементов");
        arr.insert("Evans", "Patty", 24);
        arr.insert("Smith", "Lorraine", 37);
        arr.insert("Yee", "Tom", 43);
        arr.insert("Adams", "Henry", 63);
        arr.insert("Hashimoto", "Sato", 21);
        arr.insert("Stimson", "Henry", 29);
        arr.insert("Velasquez", "Jose", 72);
        arr.insert("Lamarque", "Henry", 54);
        arr.insert("Vang", "Minh", 22);
        arr.insert("Creswell", "Lucinda", 18);
        arr.displayA();

        System.out.println("\n Поиск элемента");
        String searchKey="Stimson";
        Percon found;
        found = arr.find(searchKey);
        if(found!=null){
            System.out.print("Found");
            found.displayPerson();
        }else
            System.out.print("Can't find " + searchKey);
        System.out.println("Deleting Smith, Yee, and Creswell");

        System.out.println("\nУдаление трех элементов");
        arr.delete("Smith");
        arr.delete("Yee");
        arr.delete("Creswell");
        arr.displayA();
    }
}
