package com.javaintoduction2;


public class Movies {
	int movieId=101;
	String movieName="pushpa";
	static String industryName;

	public static void main(String[] args) {
		Movies vnk = new Movies();
		System.out.println(vnk.movieId);
		System.out.println(vnk.movieName);
		industryName = "Tollywood";
		System.out.println(industryName);
	}

}
