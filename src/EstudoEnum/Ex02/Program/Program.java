package EstudoEnum.Ex02.Program;

import EstudoEnum.Ex02.Entities.Comment;
import EstudoEnum.Ex02.Entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Program {
    static void main() throws ParseException {
        Comment c1 = new Comment("Have a nice trip");
        Comment c2 = new Comment("Wow that's awesome!");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Post post1 = new Post(sdf.parse("21/06/2018 13:05:44"), "Treveling to New Zealand", "I'm going to visit this wonderful country!", 12);

        post1.addComment(c1);
        post1.addComment(c2);

        Comment c3 = new Comment("Good night");
        Comment c4 = new Comment("May the force be with you");

        System.out.println(post1);

        Post post2 = new Post(sdf.parse("28/07/2018 23:14:19"), "Good night guys", "See you tomorrow", 5);

        post2.addComment(c3);
        post2.addComment(c4);

        System.out.println(post2);
    }
}
