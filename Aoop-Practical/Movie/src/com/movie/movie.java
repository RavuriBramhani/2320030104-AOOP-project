package com.movie;

public class movie implements Comparable<movie>{
	
	private String name;
	private int year;
	private double rating;
	
	public movie(String name, double d, double rating) {
		this.name=name;
		this.year=(int) d;
		this.rating=rating;
	}
	
	public double getrating() {
		return rating;
	}
	
	public String getname() {
		return name;
	}
	
	public int getyear() {
		return year;
	}

	@Override
	public int compareTo(movie o) {
		return this.year - o.year;
	}
	
	public String toString(){
		return "Movie: " + name + ", Rating: " + rating + ", Year: " + year;
		
	}

}
