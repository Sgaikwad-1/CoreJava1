package com.edubridge.string;

public class StringMethodDemo {

	public static void main(String[] args) {
		String str1= "Nia Sharma";
		String str2= " ";
		System.out.println(str1.length());
		char []arr=new char[10];
		str1.getChars(0, 10, arr, 0);
		//System.out.println(Arrays.toString(arr));
		System.out.println(str1.compareTo("nia shaRma"));
		System.out.println(str1.compareTo("Nia shaRma"));
		System.out.println(str1.compareToIgnoreCase("nia shaRma"));
		
		System.out.println(str2.isEmpty());
		//System.out.println(str2.isBlank());
		
		System.out.println(str1.charAt(4));
		
		//System.out.println("Hey guys you're awesome".startsWith(str2) "He");
		//System.out.println("Hey guys you're awesome".endsWith(str2)" me");
		
		System.out.println(str1.toUpperCase());
		
		System.out.println("  SPACE SPACE SPACE  ".trim());
		//System.out.println("  SPACE SPACE SPACE  ".strip());
		
		//System.out.println("SPACE SPACE SPACE, ".repeat(2));

	}

}


	}

}
