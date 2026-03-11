import java.util.ArrayList;

class Game {
    int price;
    String name;

}

public class Methods{
    public static void main(String[] args){

        ArrayList<Game> game = new ArrayList<>();

        Game g1 = new Game();
        g1.name = "Fifa 20";
        g1.price = 300;

        Game g2 = new Game();
        g2.name = "God of war";
        g2.price = 500;

        game.add(g1);
        game.add(g2);



        for (Game p : game){
            System.out.println(p.name + " is " + p.price);
            }



    }
}








