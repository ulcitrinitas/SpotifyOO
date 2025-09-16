import musicas.*;
import usuarios.*;

public class Main {
    public static void main(String[] args) {

        var m = new Musica("Hey, Soul Sister", "Train", "neo mellow", "2:17", "2010");

        System.out.println("--------------------------------------------------------");
        System.out.println(m.info());
        System.out.println("--------------------------------------------------------");

        var u = new Usuario("Ulisses", "xpto@email.com", "askmklsd", "user123");

        System.out.println(u.getId());
        System.out.println(u.getUsername());

    }
}