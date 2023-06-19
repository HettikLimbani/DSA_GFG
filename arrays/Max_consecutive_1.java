package arrays;

public class Max_consecutive_1 {
    public static void main(String args[]){
        int arr[] = {0,1,1,1,0,1,1,0,1};
        System.out.print("Array: ");
        for(int i=0; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        maxOnes2(arr);
    }

    // M2) Time complexity :: O(N)
    public static void maxOnes2(int arr[]){
        int res=0, curr=0;
        for(int i=0; i<arr.length ; i++){
            if(arr[i]==0){
                curr=0;
            }
            else{curr++;}

            res = Math.max(curr,res);
        }

        System.out.println("Max consecutive ones are :: " + res);
    }

    // M1) Time complexity :: O(N^2)
    public static void maxOnes1(int arr[]){
        int res=0;
        for(int i=0; i<arr.length ; i++){
            int curr=0;
            for(int j=i; j<arr.length ; j++){
                if (arr[j]==0){break;}
                else{curr++;}
            }
            res = Math.max(curr,res);
        }

        System.out.println("Max consecutive ones are :: " + res);
    }
}
