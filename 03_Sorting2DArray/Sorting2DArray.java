package Sorting_2D_Array;


import java.util.Arrays;

public class Sorting2DArray {

    public int [] twoDToOneD(int [][]arr){
        int [] newArr = new int[arr.length*arr[0].length];
        int idx = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                newArr[idx]=arr[i][j];
                idx++;
            }
        }
        return newArr;
    }
    public int [] sortOneD(int [] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                }
            }
        }
        return arr;

    }
    public int [][] sort2DArray(int [][] arr){
        int [] array1 = twoDToOneD(arr);
        int [] array2 = sortOneD(array1);
        int idx=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
               arr[i][j]=array2[idx++];

            }

        }
        return arr;
    }
    public void print(int [][]arr) {
        for (int[] rows : arr) {
            System.out.println(Arrays.toString(rows)); // can use nested for loop
        }
    }


    public static void main(String[] args) {
        Sorting2DArray s1 = new Sorting2DArray();
        int [][]arr = {{3,2,1},{4,5,6}};
        System.out.println("Printing Before Sorting : ");
        s1.print(arr);
        s1.sort2DArray(arr);
        System.out.println("Printing After Sorting : ");
        s1.print(arr);

    }

}
