package arrays;

public class left_rotate_1 {
    public static void main(String args[]){
        int arr[] = {5,10,12,20,2};
        System.out.print("Before: ");
        for(int i=0; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }

        leftRotate(arr);
        System.out.print("\nAfter: ");
        for(int i=0; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }

    static void leftRotate(int arr[]){
        int temp = arr[0];
        for(int i=1 ; i<arr.length ; i++){
            arr[i-1] = arr[i];
        }
        arr[arr.length-1]=temp;
    }
}
