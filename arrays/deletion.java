package arrays;

public class deletion {
    public static void main (String args[]){
        // int arr[] = new int[5];
        int arr[] = {5,10,12,20,2};
        System.out.print("Array :: ");
        for(int i=0; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        delete(arr,2);
    }

    public static void delete(int arr[],int index){
        for(int i=index ; i<arr.length-1 ; i++){
            arr[i] = arr[i+1];
        }
        int temp[] = new int[arr.length-1];
        for(int i=0; i<temp.length ; i++){
            temp[i] = arr[i];
        }
        System.out.print("\nArray after deletion :: ");
        for(int i=0; i<temp.length ; i++){
            System.out.print(temp[i] + " ");
        }
    }
}
