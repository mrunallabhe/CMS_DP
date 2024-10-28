import Decorator.ArticleComponent;
import Decorator.BasicArticle;
import Decorator.CommentsDecorator;
import Decorator.TagsDecorator;
import Factory.Article;
import Factory.Author;
import Factory.BasicContentFactory;
import Factory.ContentFactory;
import Factory.Theme;
import Proxy.ArticleProxy;

public class CMSApp {
    public static void main(String[] args) {
        // Factory Pattern: Creating content
        ContentFactory contentFactory = new BasicContentFactory();
        
        // Creating an article
        Article article = contentFactory.createArticle("Factory Pattern in CMS", "Using the factory pattern for content creation.");
        Author author = contentFactory.createAuthor("John Doe");
        Theme theme = contentFactory.createTheme("Dark Mode");

        // Display created content
        System.out.println("Created Content:");
        article.display();
        author.display();
        theme.applyTheme();

        // Decorator Pattern: Adding comments and tags to the article
        ArticleComponent articleComponent = new BasicArticle("Decorator Pattern in CMS", "Enhancing articles with decorators.");
        CommentsDecorator commentedArticle = new CommentsDecorator(articleComponent);
        commentedArticle.addComment("Great insights!");
        commentedArticle.addComment("Very helpful.");

        TagsDecorator taggedArticle = new TagsDecorator(commentedArticle);
        taggedArticle.addTag("Design Patterns");
        taggedArticle.addTag("Java");

        System.out.println("\nDecorated Article:");
        taggedArticle.display();

        // Proxy Pattern: Restricting access
        System.out.println("\nProxy Pattern:");

        // Creating an editable article for proxy demonstration
        BasicArticle editableArticle = new BasicArticle("Proxy Pattern in CMS", "Initial content for editing.");

        // Attempting to edit as a USER
        ArticleProxy proxyUser = new ArticleProxy(editableArticle, "USER");
        proxyUser.editContent("New content for the article.");  // Should deny access
        
        // Display article content
        System.out.println("Article Content After USER Attempt:");
        editableArticle.display();

        // Attempting to edit as an ADMIN
        ArticleProxy proxyAdmin = new ArticleProxy(editableArticle, "ADMIN");
        proxyAdmin.editContent("New content for the article.");  // Should allow access
        
        // Display article content after successful edit
        System.out.println("Article Content After ADMIN Edit:");
        editableArticle.display();
    }
}
