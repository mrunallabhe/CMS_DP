package Decorator;

public abstract class ArticleComponent {
    protected String title;
    protected String content;

    public ArticleComponent(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public abstract void display();
}
