package Factory;

// Interface for the Article


// BasicArticle class implementing the Article interface
public class BasicArticle implements Article {
    private String title;
    private String content;

    public BasicArticle(String title, String content) {
        this.title = title;
        this.content = content;
    }

    @Override
    public void display() {
        System.out.println("Article Title: " + title);
        System.out.println("Content: " + content);
    }

    @Override
    public void setContent(String content) {
        this.content = content; // Implementing the method
    }
    
    public String getTitle() {
        return title; // Optional: Getter for the title
    }

    public String getContent() {
        return content; // Optional: Getter for the content
    }
}
