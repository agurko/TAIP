package January.DataArrayApp;

class DataArray {
    private Percon[]a;
    private int nElems;
    public DataArray(int max){
        a=new Percon[max];
        nElems=0;
    }
    public Percon find(String searchNAme){
        int j;
        for (j=0; j<nElems;j++)
            if(a[j].getLast().equals(searchNAme))
                break;
            if(j==nElems)
                return null;
            else
                return a[j];
    }
    public void insert(String last, String first, int age){
        a[nElems]=new Percon(last, first, age);
        nElems++;
    }
    public boolean delete(String searchName){
        int j;
        for(j=0;j<nElems;j++){
            if(a[j].getLast().equals(searchName))
                break;
        }
        if(j==nElems)
            return false;
        else{
            for (int k=j; k<nElems;k++)
                a[k]=a[k+1];
            nElems--;
        }
        return true;
    }
    public void displayA(){
        for(int j=0;j<nElems;j++) {
            a[j].displayPerson();
            System.out.println();
        }
    }
}
