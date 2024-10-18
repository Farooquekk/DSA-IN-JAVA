package pastpaper_2021;

public class Question_02 {

    public static class Node{
        Object data;
        Node next = this;
        Node prev = this;

        public Node(Object data, Node next, Node prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }

        public Node(Object data) {
            this.data = data;
        }
    }


    Node head = new Node("");
    int size = 0;
    public void add(String e){
        head.prev.next = new Node(e,head,head.prev);
        head.prev=head.prev.next;
        size++;
    }
    public Object first(){
        return head.next.data;
    }
    public Object remove(){
        Object temp = head.next.data;
        head.next = head.next.next;
        head.next.prev = head;
        size--;
        return temp;
    }
    public int size (){
        return size;
    }
    public String toString(){
        Node temp = head;
        StringBuilder stringBuilder = new StringBuilder();
        int i=0;
        while (i<=size){

            stringBuilder.append(temp.data);
            temp= temp.next;
            i++;
        }
        return stringBuilder.toString();
    }


    public String reverse(){
        Node current = head.next;
        Node prev = null;
        Node next = null;

        for(int i=0;i<size;i++){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;

        }
        StringBuilder reverse = new StringBuilder();
        for(int ii=0;ii<size;ii++){
           reverse.append(prev.data);
            prev=prev.next;
        }


        return reverse.toString();
    }

    public Object [] toArray(){
        Node temp = head;
        Node temp2 = head.next;
        Object [] arr = new Object[size()];
        int i=0;
        while (temp!=temp2){
            arr[i]= temp.next.data;
            temp=temp.next;
            temp2=temp2.next.next;
            i++;
        }
       return arr;

    }

    public static void main(String[] args) {




        Question_02 q2 = new Question_02();
        q2.add("Apple");
        q2.add("Banana");


        /*System.out.println(q2.head.data);
        System.out.println(q2.head.next.data);
        System.out.println(q2.toString());*/
      System.out.println(q2.reverse());
        /*Object[] arr = q2.toArray();
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
*/
    }


}
