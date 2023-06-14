package arrays;

public class leaders {
    public static void main(String args[]){
        int arr[] = {7,10,4,3,6,5,2};
        System.out.print("Array: ");
        for(int i=0; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        System.out.println("Leaders ::");
        leader2(arr);
        
    }

    //M2) we will traverse the array backwards and then print the leaders one-by-one
    // here all the leaders are printed in reverse order ;;
    //Time complexity :: O(N)
    static void leader2(int arr[]){
        int curr_ldr= arr[arr.length-1];
        System.out.println(curr_ldr);

        for(int i=arr.length-2 ; i>=0 ; i--){
            if(arr[i]>curr_ldr){
                curr_ldr = arr[i];
                System.out.println(curr_ldr);
            }
        }

    }

    //M1) Time complexity :: O(N^2)
    static void leader1(int arr[]){
        for(int i=0; i<arr.length ; i++){
            boolean flag = false;
            for(int j=i+1 ; j<arr.length ; j++){
                if(arr[j]>arr[i]){
                    flag=true;
                    break;
                }
            }
            if(flag==false){
                System.out.println(arr[i]);
            }
        }
    }
}
