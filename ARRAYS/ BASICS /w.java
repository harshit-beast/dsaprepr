  
public class w{
    
    public static void subarrprint(int array[]){
        for(int i =0; i<array.length; i++){
            int start = i;
            for(int j =0; j<array.length; j++){
                int end =j;
                for(int k = start ; k<=end; k++){
                    System.out.print(array[k]);
                }
                
            }
            System.out.println();
        
        }
        System.out.println();
    }
    public static void main(String[] args) {
          int marks []= {1,2,24,5};
          subarrprint(marks);
          
    }
}
