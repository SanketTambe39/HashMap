package com.bridgelabz.hashmap;

public class HashMain {

	public static void main(String[] args) 
	{
		HashMapService hashMap1 = new HashMapService();
		String givenSentence = "�To be or not to be�";
		String[] myStr1 = givenSentence.toLowerCase().split(" ");
		for (String string : myStr1) 
		{
			hashMap1.put(string, 1);
		}
		hashMap1.print();

		HashMapService hashMap2 = new HashMapService();
		String givenParagraph = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
		String[] myStr2 = givenParagraph.toLowerCase().split(" ");
		for (String string : myStr2) 
		{
			hashMap2.put(string, 1);
		}
		hashMap2.print();
	}
}
