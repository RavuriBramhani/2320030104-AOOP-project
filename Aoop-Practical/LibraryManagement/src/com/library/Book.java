package com.library;

public class Book implements Borrowable {
	
	private String title;
    private String author;
    private boolean available;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.available = true;
    }

    public boolean isAvailable() {
        return available;
    }

    public void borrow() {
        if (available) {
            available = false;
            System.out.println("The book \"" + title + "\" has been borrowed.");
        } else {
            System.out.println("The book \"" + title + "\" is not available.");
        }
    }

    public void returnItem() {
        available = true;
        System.out.println("The book \"" + title + "\" has been returned.");
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

}
