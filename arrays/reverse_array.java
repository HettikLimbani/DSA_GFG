package arrays;
public class reverse_array {
    public static void main(String args[]){
        int arr[] = {8,10,20,100};
        System.out.print("Before: ");
        for(int i=0; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }

        reverse(arr);
        System.out.print("\nAfter: ");
        for(int i=0; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void reverse(int arr[]){
        int low=0; int high=arr.length-1;
        while(low<high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }
}
