public class stringbuilder {
	public static void main(String[] args) {
	StringBuilder sb  = new StringBuilder("harshit");	
	System.out.println(sb);
	
	//append is used to end string with given char 
	// --> e adds to the same string unlike the str+= "e" where new string is crearted in heap 
	sb.append("e");
	System.out.println(sb);
	
	//setchar
	// setchar replace the given char atindex of orignal string 
	sb.setCharAt(3, 'm');
	System.out.println(sb);
	// insert basically insert and shift  string char
	sb.insert(3, 'm');
	System.out.println(sb);
	//delete
	sb.delete(2, 4);
	System.out.println(sb);
	
	

	}
	

}
