package Queue;

public class ArrayQueue implements Queue {

    int size;
    Object [] array;

    public ArrayQueue(int size) {
        this.size = 0;
        array = new Object[size];
    }
    public void resize(){
        Object []  newArray= array;
        array= new Object[size*2][2];
        System.arraycopy(newArray,0,array,0,size);
    }
    public boolean isEmpty(){
        return size==0;

    }
    public boolean isFull(){
        return size==array.length;
    }
    public void add(Object e){
        if(isFull()){
            resize();
        }
        array[size]=e;
        size++;
    }
    public Object first(){
        if(isEmpty()){
            throw new IllegalStateException("Queue Is Empty");
        }

        return array[0];
    }
    public Object remove() {
        if(isEmpty()){
            throw new IllegalStateException("Queue Is Empty");
        }


        Object temp = array[0];
        for (int i = 0; i < size - 1; i++) {
            array[i] = array[i + 1];
        }

        size--;
        return temp;
    }

    public int size(){
        return size;
    }
    public void display(ArrayQueue q1){
        System.out.print("Printing the  Queue : ");
        for(int i=0;i<q1.size();i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    public void displayReverse(ArrayQueue q1){
        System.out.print("Printing the Reverse Queue : ");
        for(int i=q1.size()-1;i>=0;i--){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayQueue aq1 = new ArrayQueue(5);
        aq1.add("Apple");
        aq1.add("Orange");
        aq1.add("Grapes");
        aq1.add("StrawBerry");
        aq1.display(aq1);
        aq1.displayReverse(aq1);
        System.out.println(aq1.isFull());
        System.out.println(aq1.size());
        System.out.println(aq1.first());
        System.out.println(aq1.remove());
        System.out.println(aq1.first());
        System.out.println(aq1.size());
    }

}
