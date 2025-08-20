public class MyArrayList<T> {

    private Object[] arrList;
    private final int DEFAULT_LENGTH = 10;
    private int size = 0;

    public MyArrayList() {
        this.arrList = new Object[DEFAULT_LENGTH];

    }

    public void add(T v) {
        if (size == arrList.length) {
            newArr();
        }

        arrList[size] = v;
        size++;

    }

    public int getSize() {
        return size;
    }

    private void newArr() {
        Object[] newArr = new Object[arrList.length + DEFAULT_LENGTH];
        for (int i = 0; i < arrList.length; i++) {
            newArr[i] = arrList[i];
        }
        arrList = newArr;
    }

    public T get(int position) {
        return (T)arrList[position];
    }

    public void set(int position, T num){
        arrList[position] = num;
    }

}

