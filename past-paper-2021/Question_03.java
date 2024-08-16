package pastpaper_2021;

public class Question_03 {
    public static class Node {
        String data;
        Node next;

        public Node(String data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
        Node top;
        int size;
        public void push(String e){
            top = new Node(e,top);
            size++;
        }
        public String peek(){
            return top.data;
        }
        public String pop(){
            String temp = top.data;
            top=top.next;
            size--;
            return temp;
        }
        public int size(){
            return size;
        }

        public Question_03 merge(Question_03 s1 , Question_03 s2 , Question_03 s3){
            Node temp1 = s2.top;
            while (temp1!=null){
                s1.push(temp1.data);
                temp1=temp1.next;
            }
            Node temp2 = s3.top;
            while (temp2!=null){
                s1.push(temp2.data);
                temp2=temp2.next;
            }
            return s1;
        }

        public void print(Question_03 s1){
            Node temp = s1.top;
            while (temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }

        public static void main(String[] args) {
            Question_03 s1 = new Question_03();
            s1.push("C++");
            s1.push("Calculus");
            s1.push("IICT");
            s1.push("English");

            Question_03 s2 = new Question_03();
            s2.push("Java");
            s2.push("LAAG");
            s2.push("ISE");
            s2.push("PP");

            Question_03 s3 = new Question_03();
            s3.push("DSA");
            s3.push("OR");
            s3.push("DBS");
            s3.push("SRE");

            s3 = s3.merge(s1,s2,s3);
            s3.print(s3);

        }





}
