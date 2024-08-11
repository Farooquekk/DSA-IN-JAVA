package Sorting;

public class Bubble_Sort {

     int  []  array ;

    public Bubble_Sort(int [] array) {
        this.array = array;
    }

    public int [] bubbleSort(){
        for(int i=0;i<array.length-1;i++){
            for(int j=0;j<array.length-1;j++){
                if(array[j]>array[j+1]){
                    int temp = array[j+1];
                    array[j+1]=array[j];
                    array[j] = temp;
                }
            }

        }
        return new int[array.length];


    }
    public void print(){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int []  arr = {2,0,10,8,7,-9999};
        Bubble_Sort b1 = new Bubble_Sort(arr);
        b1.print();
        b1.bubbleSort();
        b1.print();
    }

}
