package Factory;

public class BasicContentFactory implements ContentFactory {
    @Override
    public Article createArticle(String title, String content) {
        return new BasicArticle(title, content);
    }

    @Override
    public Author createAuthor(String name) {
        return new BasicAuthor(name);
    }

    @Override
    public Theme createTheme(String colorScheme) {
        return new BasicTheme(colorScheme);
    }
}
