public class BobSponge extends Fish {
    public BobSponge(String name, int age, String favFood) {
        super(name, age, favFood);
    }

    @Override
    public void goToWork() {
        takeTheCar();
    }
    public void  playBasketBall(){
        System.out.println("playinBasketBall");
    }
}
