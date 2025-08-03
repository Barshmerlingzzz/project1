public class MeStudent {

    public static void createMe(){
        Student bar = new Student("bar", 9, 4);

        if (  bar.isStudentHS()){
            System.out.println("bar is in hs");
        }
        System.out.println("bar is not in hs");
        System.out.println(bar);
    }
}
