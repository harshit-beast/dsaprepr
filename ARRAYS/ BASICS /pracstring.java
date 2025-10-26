import java.util.*;
public class pracstring {
	
	public static void main(String[] args) {
		//String str = "harshit";
		//System.out.println(str);
		
		///INPUT STRING 
		Scanner sc = new Scanner(System.in);
		//String str2 = sc.next();
		String str1 = sc.nextLine(); //used to print whole line enterd by the user 
		//System.out.println(str2);
		 
		System.out.println(str1);
		//length of string print 
		/* System.out.println("str1 length :" +str1.length());
		System.out.println("str1 index : " +str1.indexOf('a'));
		*/
		
		//compare 
		String str2 = "harshit";
		System.out.println(str1.compareTo(str2));
		//check substring
		System.out.println("contains:"+   str1.contains("p"));
		System.out.println("startswith: " +str1.startsWith("ja"));
		System.out.println("touppercase: "+str1.toUpperCase());
		System.out.println("tolowercase: "+ str1.toLowerCase());
		
		// ADDITIPONOF ANY INTEGER/CHAR/STRING VALUE TO A  STRING 
		
		String str3 = "MOHIT";
		str3+= "abc";
		System.out.println(str3);
		System.out.println(str3 + 10 +20);
		System.out.println(10+20+ str3);
		System.out.println(str3 + 10 +20);
		//print substrings
		
		System.out.println(str3.substring(0));
		System.out.println(str3.substring(0, 4));
		
		
		
		sc.close();
		
	}
	
}
