public class recursionass {

    // Count occurrences of key in array
    public static int occurr(int array[], int key , int i){
        if(i >= array.length){
            return 0;
        }
        int count = (array[i] == key) ? 1 : 0;
        return count + occurr(array, key, i+1);
    }

    // Find length of string using recursion
    public static int lengthofs(String s, int i){
        if(i == s.length()){
            return 0;
        }
        return 1 + lengthofs(s, i+1);
    }

    public static void main(String[] args) {
        int array[] = {3,2,4,5,6,2,7,2,2};
        int key = 2;
        System.out.println("Occurrences of " + key + " : " + occurr(array, key, 0));

        String s = "system";
        System.out.println("Length of string: " + lengthofs(s, 0));
    }
}
