package Sorting;

public class Selection_sort {
    int [] arr;

    public Selection_sort(int[] arr) {
        this.arr = arr;

    }

    public int [] Selection_Sort(){
        for(int i=0;i<arr.length-1;i++){
            int minIdx = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minIdx]>arr[j]){
                    minIdx=j;

                }
            }
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
        return new int[arr.length];


    }
    public void print(){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int []  arr = {2,0,10,8,7,-9999};
        Selection_sort s1 = new Selection_sort(arr);
        s1.print();
        s1.Selection_Sort();
        s1.print();
    }






}
