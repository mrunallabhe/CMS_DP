package Factory;



public class BasicTheme implements Theme {
    private String colorScheme;

    public BasicTheme(String colorScheme) {
        this.colorScheme = colorScheme;
    }

    @Override
    public void applyTheme() {
        System.out.println("Applying theme with color scheme: " + colorScheme);
    }
}
