package arrays;

public class largest_element {
    public static void main(String args[]){
        int arr[] = {5,10,12,20,2};
        int largest = getLargest(arr);
        System.out.println("largest element in array is :: " + arr[largest]);
    }

    public static int getLargest(int arr[]){
        int largest = 0;
        for(int i=1 ; i<arr.length ; i++){
            if (arr[i] > arr[largest]){
                largest = i;
            }
        }
        return largest;
    }
    
}
