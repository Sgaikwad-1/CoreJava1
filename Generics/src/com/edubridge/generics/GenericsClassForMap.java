package com.edubridge.generics;
/*program to demonstrate on generic class by passing 
 * Multiple parameters of different type*/
class Dictionary<K,V>
{
	K key;
	V value;
	
	void print(K key, V value)
	{
		this.key=key;
		this.value=value;
		System.out.println("The value is:"+key+" "+value);
	}	
}
//driver class
public class GenericsClassForMap {
	public static void main(String[] args) {
		Dictionary<Character, String>obj=new Dictionary<>();
		obj.print('c',"Dynamic");
		obj.print('d',"Dynamic");
	}
}
