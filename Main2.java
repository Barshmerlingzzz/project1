public class Main2 {


    public static void main(String[] args) {
        MyArrayList<Integer> ARRLIST = new MyArrayList<>();

    }


    public <T> void ex2(MyArrayList<T> arrayList) {
        for (int i = 0; i < arrayList.getSize(); i++) {
            System.out.println(arrayList.get(i));
        }
    }

}
