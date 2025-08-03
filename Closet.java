

public class Closet {
    private Shirt[] shirtsArr;

    public Closet() {
    }

    public Shirt[] getShirtsBySize(int size){
        int location = 0;
        Shirt[] newArr = new Shirt[shirtsArr.length];
        for (int i = 0; i < shirtsArr.length; i++) {
            if (shirtsArr[i].getSize() == size){
                newArr[location]= shirtsArr[i];
                location++;
            }
        }
        return newArr;
        }
}
