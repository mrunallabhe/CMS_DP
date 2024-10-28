package Decorator;

public class BasicArticle extends ArticleComponent {

    // Constructor to initialize title and content
    public BasicArticle(String title, String content) {
        super(title, content);
    }

    @Override
    public void display() {
        System.out.println("Article Title: " + title);
        System.out.println("Content: " + content);
    }

    
    public void setContent(String newContent) {
        this.content = newContent; // Update the content with the new value
    }
}
