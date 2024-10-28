package Atividade_2.aplication;

import Atividade_2.entities.Comments;
import Atividade_2.entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class program {
    public static void main(String[] args) throws ParseException {

        Comments c1 = new Comments("Have a nice trip");
        Comments c2 = new Comments("Wow that's awesome");

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Post p1 = new Post(
                sdf.parse("21/06/2018 13:05:44"),
                "Traveling to new Zealand",
                "I'm Going to visit this wonderful country",
                12
        );
        p1.addCommet(c1);
        p1.addCommet(c2);
        Post p2 = new Post(
                sdf.parse("28/07/2018 23:14:19"),
                "Good nights guys",
                "See you tomorrow",
                5
        );
        Comments c3 = new Comments("Good night");
        Comments c4 = new Comments("May the Force be with you");
        p2.addCommet(c3);
        p2.addCommet(c4);

        System.out.println(p1);
        System.out.println(p2);
    }
}
