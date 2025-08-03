public class Util {
    protected static Shirt[] addShirt(Shirt[] shirtsArray, Shirt newShirt) {
        Shirt[] newArray = new Shirt[shirtsArray.length + 1];
        for (int i = 0; i < shirtsArray.length; i++) {
            newArray[i] = shirtsArray[i];
            newArray[i+1] = newShirt;
        }
        return newArray;
    }
}
