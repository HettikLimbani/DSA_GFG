package arrays;

public class second_largest_element {
    public static void main(String args[]){
        int arr[] = {5,10,12,20,2,14};
        //int arr[] = {10,10,10};
        int second_largest_element = getSecondLargest2(arr);
        System.out.println("Second largest element in array is :: " + arr[second_largest_element]);
    }

    // Method 2 : using only single for loop;
    public static int getSecondLargest2(int arr[]){
        int largest=0, res=-1;
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i]>arr[largest]){
                res=largest;
                largest=i;
            }

            else if (arr[i] < arr[largest]){
                if ( res==-1 || arr[i]>arr[res] ){
                    res=i;
                }
            }
        }
        return res;
    }


     
    // Method 1 : we used two for loop i.e. 1 for finding the largest element and 2 for finding the second largest element;
    public static int getSecondLargest1(int arr[]){
        int largest = getLargest(arr);
        int res = -1;
        for(int i=0; i<arr.length ; i++){
            if(arr[i]!=arr[largest]){
                if(res == -1){
                    res = i;
                }
                else if(arr[i]>arr[res]){
                    res =i;
                }
            }
        }
        return res;
    }

    public static int getLargest(int arr[]){
        int largest = 0;
        for(int i=1 ; i<arr.length ; i++){
            if (arr[i] > arr[largest]){
                largest = i;
            }
        }
        return largest;
    }
    
}
