package Proxy;

import Decorator.BasicArticle; // Ensure this is the correct import for the decorator

// Interface for content access proxy


// Proxy class for article access control
public class ArticleProxy implements ContentAccessProxy {
    private BasicArticle article; // Article reference
    private String role; // User role

    // Constructor for the proxy class
    public ArticleProxy(BasicArticle article, String role) {
        this.article = article; // Initialize article
        this.role = role; // Initialize role
    }

    @Override
    public void editContent(String newContent) {
        if (role.equals("ADMIN")) {
            article.setContent(newContent); // Call setContent if role is ADMIN
            System.out.println("Content edited successfully.");
        } else {
            System.out.println("Access Denied: Only ADMIN can edit the content.");
        }
    }
}
