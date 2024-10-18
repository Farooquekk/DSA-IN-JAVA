package Sorting;

public class Insertion_Sort {
    int [] array;

    public Insertion_Sort(int[] array) {
        this.array = array;
    }
    public int []  insertion_Sort(){
        for(int i=1;i<array.length;i++){
            int key = array[i];
            int idx=i-1;
            while (idx>=0&&array[idx]>key){
                 array[idx+1]=array[idx];

                idx--;
            }
            array[idx+1] = key;
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

        Insertion_Sort s1 = new Insertion_Sort(arr);
        s1.print();
        s1.insertion_Sort();
        s1.print();

    }

}
