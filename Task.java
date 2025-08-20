public class Task {
    private String name;
    private boolean mission;
    private int importance;

    public void update() {
        if (mission) {
            System.out.println("המשימה הושלמה!! יאי!");
        } else if (mission == false) {
            System.out.println("המשימה ממש לא הושלמה! פאאאקקק יוווו");
        }
    }
    public void moreUpdate(){
        importance++;
    }


}
