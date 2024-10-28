package Factory;


public class BasicAuthor implements Author {
    private String name;

    public BasicAuthor(String name) {
        this.name = name;
    }

    @Override
    public void display() {
        System.out.println("Author Name: " + name);
    }
}
