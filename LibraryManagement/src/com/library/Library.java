package com.library;

import java.util.HashMap;
import java.util.Map;

public class Library {
	
	private Map<String, Book> books;
    private Map<String, Member> members;

    public Library() {
        books = new HashMap<>();
        members = new HashMap<>();
    }

    public void addBook(Book book) {
        books.put(book.getTitle(), book);
    }

    public void addMember(Member member) {
        members.put(member.getMemberId(), member);
    }

    public void borrowBook(String memberId, String bookTitle) {
        Book book = books.get(bookTitle);
        Member member = members.get(memberId);

        if (book == null) {
            System.out.println("Book not found.");
            return;
        }

        if (member == null) {
            System.out.println("Member not found.");
            return;
        }

        if (book.isAvailable()) {
            book.borrow();
            System.out.println(member.getName() + " borrowed \"" + bookTitle + "\".");
        } else {
            System.out.println("The book \"" + bookTitle + "\" is currently unavailable.");
        }
    }

    public void returnBook(String memberId, String bookTitle) {
        Book book = books.get(bookTitle);
        Member member = members.get(memberId);

        if (book == null) {
            System.out.println("Book not found.");
            return;
        }

        if (member == null) {
            System.out.println("Member not found.");
            return;
        }

        book.returnItem();
        System.out.println(member.getName() + " returned \"" + bookTitle + "\".");
    }

}
