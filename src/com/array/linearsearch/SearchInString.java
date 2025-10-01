package com.array.linearsearch;

public class SearchInString {
	public static void main(String[] args) {
		String str="Tilak";
		char target='i';
		boolean status=false;
		// using for loop
		for(int i=0;i<str.length();i++) {
			if(target==str.charAt(i)) {
				System.out.println("Character is present");
				status=true;
			}
	}
		//using for each loop
		for(char ch:str.toCharArray()) {
			if(ch==target) {
				System.out.println("Character is present");
				status=true;
			}
		}
		if(status==false) System.out.println("Character is not present");
}
}