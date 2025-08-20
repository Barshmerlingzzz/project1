public class Main2 {

    public static void main(String[] args) {
        StringChar func = (x, y) -> ex1(x, y);
        TwoInts newFunc = ( b,  r) -> ex2(b, r);
        newOneint funcc = ( a, oneInt)-> System.out.println(oneInt.ex31(a));

    }

    public static boolean ex1(char x, String y) {

        for (int i = 0; i < y.length(); i++) {
            if (y.charAt(i) == x) {
                return true;
            }
        }
        return false;
    }

    public static int ex2(int b, int r) {
        int min = Math.min(b, r);
        int max = Math.max(b, r);
        return (int) Math.pow(min, max);
    }

}
