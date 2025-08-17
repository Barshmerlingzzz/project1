public class Main {
    public static void ifFish(ProfessionalBasketBallPlayer[] array1) {
        for (ProfessionalBasketBallPlayer professionalBasketBallPlayer : array1) {
            if (professionalBasketBallPlayer instanceof Fish fishy) {
                fishy.goToWork();
                professionalBasketBallPlayer.playBasketBall();
            } else {
                professionalBasketBallPlayer.playBasketBall();
            }
        }
    }

    public static void isPlayer(Fish[] array2) {
        int counter = 0;

        for (Fish fish : array2) {
            if (fish instanceof ProfessionalBasketBallPlayer) {
                counter++;
            }
        }
        ProfessionalBasketBallPlayer[] array = new ProfessionalBasketBallPlayer[counter];
        //Fish fish:array2
        for (int i = 0; i < array2.length; i++) {
            if (array2[i] instanceof ProfessionalBasketBallPlayer) {
                array[i] = (ProfessionalBasketBallPlayer) array2[i];
            }
            ifFish(array);
        }
    }

    public static void main(String[] args) {

    }
}
