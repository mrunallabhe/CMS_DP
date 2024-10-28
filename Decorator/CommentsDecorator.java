package Decorator;

import java.util.ArrayList;
import java.util.List;

public class CommentsDecorator extends ArticleDecorator {
    private List<String> comments = new ArrayList<>();

    public CommentsDecorator(ArticleComponent article) {
        super(article);
    }

    public void addComment(String comment) {
        comments.add(comment);
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Comments:");
        for (String comment : comments) {
            System.out.println(" - " + comment);
        }
    }
}
