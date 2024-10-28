package Factory;

public interface ContentFactory {
    Article createArticle(String title, String content);
    Author createAuthor(String name);
    Theme createTheme(String colorScheme);
}
