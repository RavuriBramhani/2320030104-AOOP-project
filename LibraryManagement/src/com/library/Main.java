package com.library;

public class Main {

	public static void main(String[] args) {
		Library library = new Library();

        Book book1 = new Book("1984", "George Orwell");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");
        library.addBook(book1);
        library.addBook(book2);

        Member member1 = new Member("Alice", "M001");
        Member member2 = new Member("Bob", "M002");
        library.addMember(member1);
        library.addMember(member2);

        library.borrowBook("M001", "1984");
        library.returnBook("M001", "1984");
        library.borrowBook("M002", "To Kill a Mockingbird");
        library.returnBook("M002", "To Kill a Mockingbird");

	}

}
