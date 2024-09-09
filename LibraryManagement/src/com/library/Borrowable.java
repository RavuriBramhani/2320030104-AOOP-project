package com.library;

public interface Borrowable {
	
	boolean isAvailable();
    void borrow();
    void returnItem();

}
