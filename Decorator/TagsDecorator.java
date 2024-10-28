package Decorator;

import java.util.ArrayList;
import java.util.List;

public class TagsDecorator extends ArticleDecorator {
    private List<String> tags = new ArrayList<>();

    public TagsDecorator(ArticleComponent article) {
        super(article);
    }

    public void addTag(String tag) {
        tags.add(tag);
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Tags:");
        for (String tag : tags) {
            System.out.println(" # " + tag);
        }
    }
}
