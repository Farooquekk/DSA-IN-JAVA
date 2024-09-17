
class QueueForGroups {

   public static class Node{
        String gender ;
        double avgMarks;
        Node next;

        public Node(String gender, double avgMarks) {
            this.gender = gender;
            this.avgMarks = avgMarks;
        }
        public void pushNode(Student data) {
            Node newNode = new Node(data.gender,data.averageScore);
            if (this.next == null) {
                this.next = newNode;
            } else {
                Node current = this.next;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = newNode;
            }
        }

    }

    StackOfStudents stackOfStudents1;
    StackOfStudents stackOfStudents2;

    Node [] groupQueue;

    public QueueForGroups(StackOfStudents s1, StackOfStudents s2) {
        this.stackOfStudents1 = s1;
        this.stackOfStudents2 = s2;
        this.groupQueue = new Node[10];

        for (int i = 0; i < 10; i++) {
            groupQueue[i] = new Node(null,0);
        }
    }



    public void push(Student data) {
        String group = data.group;
        int index;
        switch (group) {
            case "group A" -> index = 0;
            case "group B" -> index = 1;
            case "group C" -> index = 2;
            case "group D" -> index = 3;
            case "group E" -> index = 4;
            case "group F" -> index = 5;
            default -> {

                return;
            }
        }
        groupQueue[index].pushNode(data);
    }

     public void createQueuesForGroups() {
        while (!stackOfStudents1.isEmpty()) {
            Student student = stackOfStudents1.pop();
            push(student);
        }
        while (!stackOfStudents2.isEmpty()) {
            Student student = stackOfStudents2.pop();
            push(student);
        }
    }


    public void displayQueues() {
        for (int i = 0,j=65; i < 10; i++,j++) {
            Node current = groupQueue[i].next;

            if (current != null) {
                System.out.println((i+1)+". Queue for Group : " + (char)j )  ;
                System.out.println("-----------------------------");
                while (current != null) {
                    System.out.println("Student: Average Marks - " + current.avgMarks + ", Gender - " + current.gender);
                    current = current.next;
                }

                System.out.println();
            }

        }
    }

    // problem 1 --> finding the best avg marks of group A and D
    public void bestAvgMarksOfGroups() {
        System.out.print (" Best AVG Marks Of  Group A is : ");
        bestAvgMarksFinder(groupQueue[0].next);
        System.out.println();
        System.out.print (" Best AVG Marks Of  Group D is : ");
        bestAvgMarksFinder(groupQueue[3].next);
        System.out.println();
    }

    public void bestAvgMarksFinder(Node head) {
        if (head == null) {
            System.out.println("No data found.");
            return;
        }

        double bestAvg = 0;


        Node temp = head;
        while (temp != null) {
            if (temp.avgMarks > bestAvg) {

                bestAvg = temp.avgMarks;
            }
            temp = temp.next;
        }

        System.out.println(   bestAvg);
    }
  // problem 1 --> end of the method











    /*public void checkLength(int length) {
        if (length >= groupQueue.length) {
            resizeQueuesArray();
        }
    }
    public void resizeQueuesArray() {
        int size =groupQueue.length;
        Node[] newQueue = new Node[2 * size];
        System.arraycopy(groupQueue, 0, newQueue, 0, size);
        groupQueue = newQueue;

    }
*/



}

