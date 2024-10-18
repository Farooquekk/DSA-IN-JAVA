package StacksPractice;
public class LinkListWithStack implements Stack {

    public static class Node {
        Object data;
        Node next;
        public Node(Object data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
    Node top;
    int size;
    public boolean isEmpty() {
        return (size == 0);
    }
    @Override
    public void push(Object e) {
        top = new Node(e, top);
        size++;
    }
    @Override
    public Object pop() {
        Object temp = top.data;
        top = top.next;
        --size;
        return temp;
    }
    @Override
    public Object peek() {
        return top.data;
    }
    @Override
    public int size() {
        return size;
    }


    public void displayLinkedStack(LinkListWithStack s1){
        Node temp = s1.top;
        System.out.print("Displaying Linked Stack : ");
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public void displayReverseReverse(LinkListWithStack s1){
        Node prev = null;
        Node current=s1.top;
        Node next = null;
        while (current!=null){
            next = current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
           //top=prev;
        System.out.print("Displaying Reverse Linked Stack : ");
        while (prev!=null){
            System.out.print(prev.data+" ");
            prev=prev.next;
        }
        System.out.println();
    }
    public boolean searchElement(LinkListWithStack s1 ,Object target){
        Node temp = s1.top;
        while (temp!=null){
            if(temp.data==target){
                return true;
            }
            temp=temp.next;
        }
        return false;
    }
    public int searchElementIndex(LinkListWithStack s1 ,Object target){
        Node temp = s1.top;
        int idx=0;
        while (temp!=null){
            idx++;
            if(temp.data==target){
                return idx;
            }
            temp=temp.next;
        }
        return -999;
    }
    public Object returnBottom(LinkListWithStack s1){
        Node temp = s1.top;
        while (temp.next!=null){
            temp=temp.next;
        }
        return temp.data;
    }
    public Object returnSecondLast(LinkListWithStack s1){
        Node temp = s1.top;
        while (temp.next.next!=null){
            temp=temp.next;
        }
        return temp.data;
    }
    /*public static LinkListWithStack mergeTwoLinkedStack(LinkListWithStack s1 , LinkListWithStack s2){
        Node temp1=s1.top;
        //LinkListWithStack temp1 = s1;
        while (temp1!=null){
            s2.push(temp1.data);
            temp1=temp1.next;
        }
        return s2;
    }*/

    public static LinkListWithStack mergeTwoLinkedStack(LinkListWithStack s1 , LinkListWithStack s2){
        Node temp1=s1.top;
        //LinkListWithStack temp1 = s1;
        while (temp1!=null){
            s2.push(temp1.data);
            temp1=temp1.next;
        }
        return s2;
    }



    public void convertLinkedStackToArrayStack(LinkListWithStack s1){
        LinkListWithStack temp = s1;
        // temp.displayReverseReverse(temp);
        ArrayWithStack arrayWithStack = new ArrayWithStack(s1.size);
        System.out.print("Linked Stack Is Converted To Array Stack Successfully :  ");
        while (temp.top!=null){
            arrayWithStack.push(temp.pop());
        }
        arrayWithStack.displayReverseStack(arrayWithStack);
    }
    public boolean compareTwoLinkedStack(LinkListWithStack s1 , LinkListWithStack s2){
        if(s1.size!=s2.size){
            return false;
        }

        Node temp1 = s1.top;
        Node temp2 = s2.top;
        while (temp1!=null){
            if(!temp1.data.equals(temp2.data)){
                return false;
            }

            temp2 = temp2.next;
            temp1 = temp1.next;
        }
        return true;
    }
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        Node temp = top;
        while (temp!=null){
            stringBuilder.append(temp.data);
            temp=temp.next;
        }
        System.out.print("Returning toString :  ");
        return stringBuilder.toString();
    }
    public LinkListWithStack deleteBottom(LinkListWithStack s1){
        Node temp = s1.top;
        while (temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
        return s1;
    }
    public static void main(String[] args) {
        LinkListWithStack s1 = new LinkListWithStack();
        System.out.println(s1.isEmpty());
        s1.push(1);
        System.out.println(s1.isEmpty());
        s1.push(2);
        s1.push(3);
        s1.push(4);
        s1.push(5);
        s1.push(6);
        /*System.out.println(s1.toString());
        s1 = s1.deleteBottom(s1);
        s1.displayLinkedStack(s1);
        System.out.println(s1.size());
        s1.displayLinkedStack(s1);
        System.out.println(s1.peek());
        System.out.println(s1.pop());
        s1.displayLinkedStack(s1);
        System.out.println(s1.searchElement(s1,3));
        System.out.println(s1.searchElementIndex(s1,1));
        s1.displayReverseReverse(s1);
        LinkListWithStack s2 = new LinkListWithStack();
        System.out.println(s1.isEmpty());*/
        LinkListWithStack s2 = new LinkListWithStack();
        s2.push(7);
        System.out.println(s1.isEmpty());
        s2.push(8);
        s2.push(9);
        s2.push(10);
        s2.push(11);
        s2.push(12);
        s1.displayLinkedStack(s1);
        s2.displayLinkedStack(s2);
        LinkListWithStack mergeLinkedStack = LinkListWithStack.mergeTwoLinkedStack(s1,s2);
        mergeLinkedStack.displayLinkedStack(mergeLinkedStack);
        s2.convertLinkedStackToArrayStack(s2);
        System.out.println(s1.compareTwoLinkedStack(s1,s2));
        LinkListWithStack s3 = new LinkListWithStack();
        s3.push(10);
        s3.push("Afridi");
        LinkListWithStack s4 = new LinkListWithStack();
        s4.push(10);
        s4.push("Afridi");
        System.out.println(s3.compareTwoLinkedStack(s3,s4));
        s3.displayLinkedStack(s3);
        System.out.println(s3.returnBottom(s3));
        System.out.println(s3.returnSecondLast(s3));
        System.out.println(s3.toString());

    }
}
