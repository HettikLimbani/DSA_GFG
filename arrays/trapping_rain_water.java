package arrays;

public class trapping_rain_water {
    public static void main(String args[]){
        int arr[] = {3,0,1,2,5};
        System.out.print("Array: ");
        for(int i=0; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        getWater2(arr);
    }

    // M2) by precalculating lmax & rmax and storing their values in lmx[] & rmax[];;
    // Time complexity :: O(N)
    // Auxiliary Space :: O(N)
    public static void getWater2(int arr[]){
        int res = 0;
        int n = arr.length;

        int lmax[] = new int [n];
        lmax[0] = arr[0];
        for(int i=1 ; i<n ; i++){
            lmax[i] = Math.max(arr[i],lmax[i-1]);
        }

        int rmax[] = new int [n];
        rmax[n-1] = arr[n-1];
        for(int i=n-2 ; i>=0 ; i--){
            rmax[i] = Math.max(arr[i],rmax[i+1]);
        }

        for (int i=0 ; i<n ; i++){
            res = res + (Math.min(lmax[i],rmax[i]) - arr[i]);
        }

        System.out.println("Water Trapped :: " + res);
    }    


    // M1) by calculating lmax & rmax for each iteration of i;
    // Time complexity :: O(N^2)
    public static void getWater1(int arr[]){
        int res = 0;
        for(int i=1; i<arr.length-1 ; i++){
            
            int lmax = arr[i];       // Calculating lmax value for i index
            for(int j=0;j<i;j++){
                lmax = Math.max(lmax,arr[j]);
            }

            int rmax = arr[i];       // Calculating rmax value for i index
            for(int j=i+1;j<arr.length;j++){
                rmax = Math.max(rmax,arr[j]);
            }

            res = res + (Math.min(lmax,rmax) - arr[i]);
        }

        System.out.println("Water Trapped :: " + res);
    }
}
