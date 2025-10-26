import java.util.*;

public class MyStringclass {
	public static void printletters(String str){
		for(int i = 0 ; i< str.length(); i++){
			System.out.print(str.charAt(i));
		}
	}
	
	public static boolean checkString(String str){
	   for(int i = 0; i<str.length(); i++){
		
		if(str.charAt(i)!=str.charAt(str.length()-1-i)){
			return false;
		}
	}
	   System.out.println("palindrome");
	   return true ;
	}

	public static void main(String[] args) {
		 //  char arr[] = {'a', 'b', 'c', 'd'};
       // String str1 = "abcd";
       // String str2 = "xyz";
        
        // Strings are IMMUTABLE
        
        Scanner sc = new Scanner(System.in);
        String name;
        
       // name = sc.next();
        
		System.out.println("Enter your name: ");
		name = sc.nextLine();
		System.out.println("You entered: " + name);
		String caste = "jaat and chamar";
		System.out.println(caste.length());
		String lastname = "harshit";
		String firstname = "bhagoria";
		String fullname = firstname +" " + lastname;
		System.out.println(fullname);
		System.out.println(fullname.charAt(8));
		printletters(lastname);
		System.out.println();
		printletters(fullname);
		String str3 = "level";
		System.out.print(checkString(str3));
		
		
		sc.close();
	}
}

 

   