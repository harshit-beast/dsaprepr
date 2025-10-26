


public class str {
	/*public static String Stringcompression(String str){
		String newstr = "";
		int count = 0;
		for(int i =0; i<str.length(); i++){
			count = 1;
			while(i<str.length()-1 &&str.charAt(i)== str.charAt(i+1)){
				count ++;
				i++;
			}
			newstr += str.charAt(i);
			if(count >1){
				//converted count to string
				newstr += String.valueOf(count);
			}
		}
		return newstr;  */
		public static String strcompress2(String str){
			StringBuilder sb = new StringBuilder("");
			int count =0;
			for(int i = 0; i<str.length(); i++){
				count = 1;
				while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
					count ++;
					i++;
				}
				 sb.append(str.charAt(i));
				 
				 if(count >1){
					sb.append(count);
				 }
			}
			
			return sb.toString();
		}
		
	 
		

	 public static void main(String[] args) {
		String str = "aaabbbccc";
		//System.out.println(Stringcompression(str));
		System.out.println(strcompress2(str));
	 }

	}