package arrays;
public class remove_duplicate {
    public static void main(String args[]){
        int arr[] = {5,5,10,10,10,10,20,20,30};
        System.out.print("Before: ");
        for(int i=0; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }

        removeDup2(arr);
        System.out.print("\nAfter: ");
        for(int i=0; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }

    static void removeDup2(int arr[]){
        int res=1;
        for(int i=0; i<arr.length ; i++){
            if(arr[i]!=arr[res-1]){
                arr[res]=arr[i];
                res++;
            }
        }

        for(int i=res ; i<arr.length ; i++){
            arr[i]=0;
        }

    }

    static void removeDup1(int arr[]){
        int n = arr.length;
        int temp[]=new int[n];
        temp[0]=arr[0];
        int res = 1;    //Size of the new array which only has distict elements;

        for(int i=1; i<n; i++){
            if(arr[i]!=temp[res-1]){
                temp[res]=arr[i];
                res++;
            }
        }

        for(int i=0; i<res; i++){
            arr[i]= temp[i];
        }

        for(int i=res ; i<n ; i++){
            arr[i]=0;
        }
    }
}
