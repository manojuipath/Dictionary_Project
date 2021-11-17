package com.dictionary;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.dictionary.beans.Dictionary;

public class Application {
	
	Map<String, Dictionary>  dictionary = new HashMap<>();
	
	public static void main(String[] args) {
		(new Application()).start();
		
			}
	
	public void createDictionary() {
	//get the dictionary Name 
	//check if the dictionary Name already exists or not
		//if exists return else create dictionary 
		String dictionaryName;
		
		if(dictionary.containsKey(dictionaryName)) {
			return;
		}else {
			dictionary.put(dictionaryName, new Dictionary(dictionaryName));
		}
		
		
	}
	
	private void start() {
		while(true) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the user input choice : " );
			int num = scan.nextInt();
			scan.close();
			System.out.println("The number entered by user: "+num);
		if(num==1) {
			createDictionary();
		}
		}
		
	}

}
