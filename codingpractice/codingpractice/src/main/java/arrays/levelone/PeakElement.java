package arrays.levelone;

public class PeakElement {
    public static void main(String[] args) {

        int arr[] = {2,1,5};
        int n = arr.length;
        System.out.println("Index of peak element: "+findPeakElement(arr, n));

    }

    public static int findPeakElement(int[] arr, int n) {

        if(n==1){
            return 0;
        }

        if(arr[0] > arr[1]){
            return 0;
        }

        if(arr[n-1] > arr[n-2]){
            return n-1;
        }

        int low=1, high = n-2;
        while(low<=high){
            int mid = (low+high)/2;

            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
                return mid;
            }else if(arr[mid]>arr[mid-1]){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }


        return -1;
    }
}
