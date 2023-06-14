package arrays;

public class move_zeroes_to_end {
    public static void main(String args[]){
        int arr[] = {5,10,0,20,20,0,0,30};
        System.out.print("Before: ");
        for(int i=0; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }

        moveZeroes(arr);
        System.out.print("\nAfter: ");
        for(int i=0; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }

    static void moveZeroes(int arr[]){
        int count =0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]!=0){
                int temp = arr[count];
                arr[count] = arr[i];
                arr[i] = temp;

                count++;
            }
        }
    }
}
