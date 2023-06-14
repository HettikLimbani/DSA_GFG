package arrays;

public class max_difference_order {
    public static void main(String args[]){
        int arr[] = {2,3,10,6,4,8,1};
        System.out.print("Array: ");
        for(int i=0; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        int max = maxDiff2(arr);
        System.out.print("Max difference :: " + max);
    }

    // M2) //Time complexity :: O(N)
    static int maxDiff2(int arr[]){
        int res = arr[1]-arr[0];
        int minVal =arr[0];

        for(int j=1; j<arr.length; j++){
            res = Math.max(res, arr[j]-minVal);
            minVal = Math.min(minVal, arr[j]); 
        }
        return res;
    
    }

    // M1) //Time complexity :: O(N^2)
    static int maxDiff1(int arr[]){
        int res = arr[1]-arr[0];
        for(int i=0 ; i<arr.length ; i++){
            for(int j=i+1 ; j<arr.length ; j++){
                res = Math.max(res,arr[j]-arr[i]);
            }
        }
        return res;
    }
}
