package Decorator;

public abstract class ArticleDecorator extends ArticleComponent {
    protected ArticleComponent article;

    public ArticleDecorator(ArticleComponent article) {
        super(article.title, article.content);
        this.article = article;
    }

    @Override
    public void display() {
        article.display();
    }
}
