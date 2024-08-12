package Searching;

public class Binary_Search {

public int binary_Search(int [] arr , int target){
    int low = 0;
    int high = arr.length-1;
    while (low<=high){
        int mid = low+(high-low)/2;
        if(arr[mid]==target){
            return mid;
        }
        else if(arr[mid]<target){
            low=mid+1;
        }
        else{            // if arr[mid]>target
            high = mid-1;
        }

    }

    return -1;
}

    public static void main(String[] args) {
        Binary_Search bs1 = new Binary_Search();
        int [] arr = {1,2,3,4,5,6};
        System.out.println("Element Found At Index : " + bs1.binary_Search(arr,4));
    }


}
