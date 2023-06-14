package arrays;

public class left_rotate_d {
    public static void main(String args[]){
        int arr[] = {5,10,12,20,2};
        System.out.print("Before: ");
        for(int i=0; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }

        leftRotateD3(arr,3);
        System.out.print("\nAfter: ");
        for(int i=0; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }

    // M3) Reversal algorithm
    // Space complexity :: O(N)
    // Space complexity :: O(1)
    static void leftRotateD3(int arr[],int d){
        reverse(arr,0,d-1);
        reverse(arr,d,arr.length-1);
        reverse(arr,0,arr.length-1);
    }

    public static void reverse(int arr[],int low,int high){
        while(low<high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }

    //M2) we create a new temp[] of d size and swap element to front;
    // Space complexity :: O(N)
    // Space complexity :: O(d)
    static void leftRotateD2(int arr[], int d){   
        int temp[] = new int [d];

        for (int i=0; i<d; i++){  //copying d values to temp[];
            temp[i]=arr[i];
        }
        
        for(int i=d ; i<arr.length ; i++){ // Shifting remaining arr[] elements, d places forward;
            arr[i-d]=arr[i];
        }

        for(int i=0; i<d ; i++){
            arr[arr.length-d+1]= temp[i];
        }
    }

    // M1) where we run for loop for d times and for each iteration we do a left rotate by 1
    // Time complexity :: O(Nd)
    // Space complexity :: O(1) 
    static void leftRotateD1(int arr[], int d){   
        for (int i=0 ; i<d ; i++){
            leftRotate(arr);
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
