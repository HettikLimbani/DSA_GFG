package arrays;
public class sorted_array {
    public static void main(String args[]){
        // int arr[] = {5,10,12,20,2,14};
        int arr[] = {8,10,10,20,100};
        System.out.println(isSorted(arr));
    }

    public static boolean isSorted(int arr[]){
        for(int i=0; i<arr.length-1 ; i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }
    
}
