public class Main {
    public static void ifFish(ProfessionalBasketBallPlayer[] array1){
        for (ProfessionalBasketBallPlayer professionalBasketBallPlayer:array1){
            if(professionalBasketBallPlayer instanceof Fish fishy){
                fishy.goToWork();
                professionalBasketBallPlayer.playBasketBall();
            }
            professionalBasketBallPlayer.playBasketBall();
        }
    }
    public static void main(String[] args) {

    }
}
