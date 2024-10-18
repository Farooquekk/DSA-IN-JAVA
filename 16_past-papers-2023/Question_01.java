package pastpaper_2023;

public class Question_01 {
    public static class Node{
        Object data;
        Node next;

        public Node(Object data) {
            this.data = data;
        }

        public Node(Object data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
    Node top;
    int size;
    public void add(Object e ){
        top = new Node(e,top);
        size++;
    }
    public int size(){
        return size;
    }
    public Object first(){
        return top.data;
    }
    public Object remove(){
        Object temp = top.data;
        top=top.next;
        size--;
        return temp;
    }

    public boolean count(Question_01 q1){
        Node temp = q1.top;
        int count =0;
        while (temp!=null){
            count++;
            temp=temp.next;
        }
        return count >= 5;
    }
    public boolean search(Question_01 q1 , Object data) {
        Node temp = q1.top;
        while (temp!=null){
            if(temp.data==data){
                return true;
            }
            temp=temp.next;
        }
        return false;
    }
    public Object peekSecondLast(Question_01 q1){
        Node temp = q1.top;
        while (temp.next.next!=null){
            temp=temp.next;
        }
        return temp.data;

    }
    public boolean checkBottom(Question_01 q1 , Question_01 q2){
        Node temp1 = q1.top;
        Node temp2 = q2.top;
        while (temp1.next!=null&&temp2.next!=null){
            temp1=temp1.next;
            temp2=temp2.next;
        }
        return temp1.data==temp2.data;

    }
}
