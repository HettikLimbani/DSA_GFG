package arrays;

//import java.util.Arrays;

class Search_element{
    public static void main(String argd[]){
        int arr[] = {5,10,12,20,2};
        int x = 1; // Element to be searched;
        System.out.println(search(arr,x));
    }

    public static int search(int arr[], int x){  //Linear Search --> for unsorted arrays;
        int n = arr.length;
        for (int i=0 ; i<n ; i++){
            if (arr[i]==x){
                return 1;
            }
        }
        return -1;
    }
}