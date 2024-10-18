package pastpaper_2023;

public class Question_02 {
public static class Node{
    Object data;
    Node next;

    public Node(Object data) {
        this.data = data;
    }
}
public int size (Node head){
    Node temp =  head;
    int size= 0;
    while (temp!=null){
        size++;
        temp=temp.next;
    }
    return size;
}
  public Object [] mergeToArray(Node l1 , Node l2){
    Node temp1 = l1;
    Node temp2 = l2;
    Object [] array = new Object[size(temp1)+size(temp2)];
    int idx = 0;
    while (temp1!=null){
        array[idx]=temp1.data;
        temp1=temp1.next;
        idx++;
    }
      while (temp2!=null){
          array[idx]=temp2.data;
          temp2=temp2.next;
          idx++;
      }
      return array;

  }
    public static void main(String[] args) {

    Question_02 q2 = new Question_02();

    Node n1 = new Node("Fruit");
        Node n2 = new Node("Ice Cream");
        Node n3 = new Node("Cake");
        Node n4= new Node("Shake");
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;


        Node p1 = new Node("Chicken");
        Node p2 = new Node("Fish");
        Node p3 = new Node("mutton");
        Node p4= new Node("vegetable");
        p1.next=p2;
        p2.next=p3;
        p3.next=p4;

        Object [] temp = q2.mergeToArray(n1,p1);
        for(Object temp1 : temp){

            System.out.print(temp1+" ");
        }
        System.out.println();



    }


}



