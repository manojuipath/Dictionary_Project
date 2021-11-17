package com.dictionary.beans;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {
	
	private Map<String, Word> dict = new HashMap<>() ;
	private String name;
	public Dictionary(String dictionaryName) {
		// TODO Auto-generated constructor stub
		this.name=dictionaryName;
	}
	public Map<String, Word> getDict() {
		return dict;
	}
	public void setDict(Map<String, Word> dict) {
		this.dict = dict;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
