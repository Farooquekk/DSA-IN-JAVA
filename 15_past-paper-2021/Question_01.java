package pastpaper_2021;

import java.util.*;

public class Question_01  { // think as a queue class


    public static  class Node {
        String data;
        Node next = this;
        Node prev = this;

        public Node(String data, Node next, Node prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }

        public Node(String data) {
            this.data = data;
        }
    }
    Node head = new Node(null);
    int size = 0;
    public void add(String e){
        head.prev.next = new Node(e,head,head.prev);
        head.prev = head.prev.next;
        size++;
    }
   /* public String first(){
        return head.next.data;
    }*/
    /*public String remove(){
        String temp = head.next.data;
        head.next = head.next.next;
        head.next.prev = head;
        --size;
        return temp;
    }*/
    public int size(){
        return size;
    }
    public static void display(Question_01 l1){
        int size = l1.size();
        Node temp = l1.head.next;
        System.out.print("Printing the Queue : ");
        for(int i=0;i<size;i++){
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Question_01 trains = new Question_01();
        trains.add("Allama Iqbal Express");
        trains.add("Tezdum Express");
        trains.add("Hazara Express");

        Question_01 Class = new Question_01();
        Class.add("Economy Class");
        Class.add("Business Class");
        Class.add("3rd/C  Class");

        Question_01 routes = new Question_01();
        routes.add("Kar to Lah");
        routes.add("Hyd to Mul");
        routes.add("Mpk to Hazara");
        Collection<Question_01> collection = new ArrayList<>() ;
        collection.add(trains);
        collection.add(Class);
        collection.add(routes);

        System.out.println("Size of Collection : " + collection.size());

        for(Question_01 queue : collection){
            display(queue);
        }
        List<Question_01> collectionList = new ArrayList<>(collection);
        if (collectionList.size() > 1) {
            collectionList.remove(collectionList.size() - 2);
            collection.clear();
            collection.addAll(collectionList);
        }


        System.out.println();
        for(Question_01 queue : collection){
            display(queue);
        }

    }


}
