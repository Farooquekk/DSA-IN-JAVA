package Searching;

public class Linear_Search {

    public int  linear_Search(int [] arr , int target){

        for(int i=0;i<arr.length;i++) {
            if (arr[i] == target) {
               return i;

            }
        }

               return -1;



    }


    public static void main(String[] args) {
        Linear_Search ls1 = new Linear_Search();
        int [] arr = {1,4,5,3,0,-99};
        System.out.println("Element found At Index : " + (ls1.linear_Search(arr,1)));

    }
}
