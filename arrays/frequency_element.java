package arrays;

public class frequency_element {
    public static void main(String args[]){
        int arr[] = {10,10,10,25,30,30};
        System.out.print("Array: ");
        for(int i=0; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }

        
        System.out.println("\n");
        frequency(arr);
    }

    static void frequency(int arr[]){
        int n = arr.length;
        int freq = 1, i=1;
        while (i<n){
            while(i<n && arr[i]==arr[i-1]){
                freq++;
                i++;
            }
            System.out.println(arr[i-1] + " -> frequency: " + freq);
            i++;
            freq=1;
        }
        if(n==1 || arr[n-1]!=arr[n-2]){
            System.out.println(arr[n-1] + " -> frequency: 1");
        }
    }
}
