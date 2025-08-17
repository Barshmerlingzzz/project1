public class SpongeBobCheff extends BobSponge{

    public SpongeBobCheff(String name, int age, String favFood) {
        super(name, age, favFood);
        super.playBasketBall();
    }

    @Override
    public void playBasketBall() {
        System.out.println("I am playing");
    }
}
