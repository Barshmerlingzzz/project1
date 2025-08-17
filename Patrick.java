public abstract class Patrick extends Fish {
    public Patrick(String name, int age, String favFood) {
        super(name, age, favFood);
    }

    @Override
    public void goToWork() {
        takeTheTrain();
    }

    public void  playBasketBall(){
        System.out.println("playinBasketBall");
    }

}
