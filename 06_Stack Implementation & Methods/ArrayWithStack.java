package StacksPractice;

public class ArrayWithStack implements  Stack{
    Object [] array;
    int size=0;
    public void resize() {
        Object[] aa = array;
        array = new Object[2 * size];
        System.arraycopy(aa, 0, array, 0, size);
    }
    public ArrayWithStack(int capacity) {
        array = new Object[capacity];
    }
    @Override
    public void push(Object e) {
        if(isFull()){
            resize();
        }
        array[size]=e;
        size++;
    }
    @Override
    public Object pop() {
        Object temp = array[size-1];
        array[size-1]=null;
        --size;
        return temp;
    }
    @Override
    public Object peek() {
        return array[size-1];
    }
    @Override
    public int size() {
        return size;
    }
    public void displayStack(ArrayWithStack s1){
        System.out.print("Printing Array Stack : ");
        for(int i=s1.size()-1;i>=0;i--){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    public void displayReverseStack(ArrayWithStack s1){
        for(int i=0;i<=s1.size()-1;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    public boolean isEmpty(){
        return (size==0);
    }
    public boolean isFull(){
        return size==array.length;
    }
    public static  ArrayWithStack mergeTwoStacks(ArrayWithStack s1 , ArrayWithStack s2){
        for(int i=0;i< s2.size()-1;i++){
            s1.push(s2.array[i]);
        }
        return s1;
    }
    public Object returnBottom(ArrayWithStack s){
        return s.array[0];
    }
    public Object returnSecondLast(ArrayWithStack s){
        return s.array[1];
    }
    public boolean searchElementInStack(ArrayWithStack s1 , Object target){
        for(int i=0;i<s1.size()-1;i++){
            if(array[i]==target){
                return true;
            }
        }
        return false;
    }
    public int  searchElementInStackIndex(ArrayWithStack s1 , Object target){
        for(int i=0;i<s1.size()-1;i++){
            if(array[i]==target){
                return size-i;
            }
        }
        return -999;
    }
    public void convertArrayStackToLinkedStack(ArrayWithStack s1){
        LinkListWithStack stack = new LinkListWithStack();
        for(int i=0;i<=s1.size()-1;i++){
            stack.push(s1.array[i]);
        }
        stack.displayLinkedStack(stack);
    }
    public boolean compareTwoArrayStack(ArrayWithStack s1 , ArrayWithStack s2) {
        if (s1.size != s2.size) {
            return false;
        }
        for(int i=size-1;i>=0;i--) {
            if(s1.array[i]!= s2.array[i]){
                return false;
            }
        }
        return true;
    }
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();

        for(int i=size-1;i>=0;i--){
            stringBuilder.append(array[i]);
        }
        System.out.print("Returning toString :  ");
        return stringBuilder.toString();
    }
   /* public ArrayWithStack deleteBottom(ArrayWithStack s1){
        ArrayWithStack tempStack = new ArrayWithStack(s1.size);
        int tempTop = -1;
        while (s1.size>1){
            tempStack.push(s1.pop());
            tempTop++;
        }
        s1.pop();
        while (tempTop>=0){
            s1.push(tempStack.pop());
            tempTop--;
        }
        return s1;
    }*/
    public ArrayWithStack deleteBottom(ArrayWithStack s1){
        s1.array[0]=null;
        size--;
        for(int i=0;i<s1.size();i++){
            s1.array[i]=s1.array[i+1];
        }
        return s1;
    }

    public ArrayWithStack duplicate(ArrayWithStack s1){
        ArrayWithStack dup = new ArrayWithStack(s1.size());
        for(int i=0;i<size;i++){
            dup.push(s1.array[i]);
        }
        return dup;
    }
    public ArrayWithStack subStack(ArrayWithStack s1 , int start , int end){
        if(start<0||start>s1.size()||end<0||end>s1.size()){
            System.out.println("Invalid Indices");
            return null;
        }
        ArrayWithStack sub = new ArrayWithStack(end-start);
        for(int i=start;i<=end;i++){
            sub.push(s1.array[i]);
        }
        return sub;
    }

        public static void main(String[] args) {
        ArrayWithStack s1 = new ArrayWithStack(5);
        System.out.println(s1.isEmpty());
        s1.push(1);
        System.out.println(s1.isEmpty());
        s1.push(2);
        s1.push(3);
        s1.push(4);
        s1.push(5);
        s1.push(6);
        ArrayWithStack sub = s1.subStack(s1,2,4);
        sub.displayStack(sub);
        /*ArrayWithStack dup = s1.duplicate(s1);
        dup.displayStack(dup);*/
        /*System.out.println(s1.size());
        s1.displayStack(s1);
        System.out.println(s1.peek());
        s1.displayReverseStack(s1);
        System.out.println(s1.pop());
        ArrayWithStack s2 = new ArrayWithStack(5);
        System.out.println(s1.isEmpty());
        s2.push(7);
        System.out.println(s1.isEmpty());
        s2.push(8);
        s2.push(9);
        s2.push(10);
        s2.push(11);
        s2.push(12);
        System.out.println(s2.toString());
        s1.displayStack(s1);
        ArrayWithStack mergeStack = mergeTwoStacks(s1,s2);
//   s1.displayStack(s1);
        s2.displayStack(s2);
        mergeStack.displayStack(mergeStack);
        System.out.println(mergeStack.returnBottom(mergeStack));
        System.out.println(mergeStack.returnSecondLast(mergeStack));
        System.out.println(mergeStack.searchElementInStack(mergeStack,7));
        System.out.println("Index: "+mergeStack.searchElementInStackIndex(mergeStack,7));
        s2.convertArrayStackToLinkedStack(s2);
        System.out.println(s1.compareTwoArrayStack(s1,s2));
        ArrayWithStack s3 = new ArrayWithStack(5);
        s3.push(10);
        s3.push("Afridi");
        s3.push("Azam");
        ArrayWithStack s4 = new ArrayWithStack(5);
        s4.push(10);
        s4.push("Afridi");

       // System.out.println(s3.compareTwoArrayStack(s3,s4));
        s3.displayStack(s3);
        s3.deleteBottom(s3);
        s3.displayStack(s3);
        s3.deleteBottom(s3);
        s3.displayStack(s3);*/

    }
}

// toString method bhi banana ha
// remove the bottom element of the stack
// do in both
