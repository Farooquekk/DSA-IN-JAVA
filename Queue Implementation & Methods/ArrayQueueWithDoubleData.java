package Queue;

public class ArrayQueueWithDoubleData   {
    int size;
    Object [][] array;

    public ArrayQueueWithDoubleData(int size) {
        this.size = 0;
        array = new Object[size][2];
    }
    public void resize(){
        Object [] [] newArray= array;
        array= new Object[size*2][2];
        System.arraycopy(newArray,0,array,0,size);
    }
    public boolean isEmpty(){
        return size==0;

    }
    public boolean isFull(){
        return size==array.length;
    }
    public Object display(Object [] a){

        for(int i=0;i<a.length;i++){
          System.out.print(a[i]+ " ");
        }
        System.out.println();
        return ("");
    }
    public Object first(){
        if(isEmpty()){
            throw new IllegalStateException("Queue Is Empty");
        }
        return display(array[0]);
    }
    public Object remove() {
        if(isEmpty()){
            throw new IllegalStateException("Queue Is Empty");
        }

        Object [] temp = array[0];
        for (int i = 0; i < size - 1; i++) {
            array[i] = array[i + 1];
        }

        size--;
        return display( temp);
    }




    public void add(Object [] e){
        if(isFull()){
            resize();
        }
        array[size]=e;
        size++;
    }

    public int size(){
        return size;
    }
    public void display(ArrayQueueWithDoubleData q1){
        System.out.println("Printing the  Queue : ");
        for(int i=0;i<q1.size();i++){
            for(int j=0;j<2;j++){
                System.out.print(q1.array[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public void displayReverse(ArrayQueueWithDoubleData q1){
        System.out.println("Printing the Reverse  Queue : ");
        for(int i=q1.size()-1;i>=0;i--){
            for(int j=1;j>=0;j--){
                System.out.print(q1.array[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public boolean searchString(ArrayQueueWithDoubleData a1 , Object data){
        for(int i=0;i<a1.size();i++){
            for(int j=0;j<2;j++){
                if(a1.array[i][j]==data){
                    return true;
                }
            }
        }
        return false;
    }


    public static void main(String[] args) {
        ArrayQueueWithDoubleData a1 = new ArrayQueueWithDoubleData(3);
        Object [] fruit1 = {"Apple",200};
        Object [] fruit2 = {"Banana",100};
        Object [] fruit3 = {"Orange",120};
        Object [] fruit4 = {"Strawberry",250};
        a1.add(fruit1);
        a1.add(fruit2);
        a1.add(fruit3);
        a1.add(fruit4);
        a1.display(a1);
        a1.displayReverse(a1);
        System.out.println(a1.remove());
        a1.display(a1);
        System.out.println(a1.first());
        System.out.println(a1.searchString(a1,"Orange"));

    }










}
