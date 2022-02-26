package academy.devdojo.javaoneforall.javacore.Gassociation.test;

//64 - Object Orientation - Association pt 01 - Arrays with objects

import academy.devdojo.javaoneforall.javacore.Gassociation.domain.Player;

public class PlayerTest01 {
    public static void main(String[] args) {
        Player p1 = new Player("Pelé");
        Player p2 = new Player("Romário");
        Player p3 = new Player("Cafu");

//        Player[] players = new Player[3];
//        players[0] = p1;

//        Player[] players = new Player[]{p1, p2, p3};

        Player[] players = {p1, p2, p3};

//      players + "ALT+Enter" --> to iterate over it

        for (Player player : players) {
            player.print();
        }


//        p1.print();
//        p2.print();
//        p3.print();
    }
}
