public class Coin {

    public String getFace(){
        double random = Math.floor(Math.random() * 10);
//        0 1 2 3 4 tails 5 6 7 8 9
        if (random < 5) {

            return "Tails";

        }
        else if (random >= 5){
            return "Heads";
        }
        else return "failed";
    }
}
