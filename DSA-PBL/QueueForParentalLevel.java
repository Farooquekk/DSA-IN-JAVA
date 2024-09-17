
import java.util.Objects;
class QueueForParentalLevel {
    StackOfStudents stackOfStudents1;
    StackOfStudents stackOfStudents2;
    Node[] parentalLevelQueue;

    public QueueForParentalLevel(StackOfStudents s1, StackOfStudents s2) {
        this.stackOfStudents1 = s1;
        this.stackOfStudents2 = s2;
        this.parentalLevelQueue = new Node[10];

        for (int i = 0; i < 10; i++) {
            parentalLevelQueue[i] = new Node(null);

        }
    }
    // for storing gender and avg Marks

    public void push(Student data) {
        String level = data.parentalLevel;
        int index;
        switch (level) {
            case "high school" -> index = 0;
            case "some high school" -> index = 1;
            case "some college" -> index = 2;
            case "associate's degree" -> index = 3;
            case "bachelor's degree" -> index = 4;
            case "master's degree" -> index = 5;
            default -> {

                return;
            }
        }
        parentalLevelQueue[index].push(data);
    }


    public void createQueuesForParentalLevels() {
        StackOfStudents tempStackM = new StackOfStudents();
        StackOfStudents tempStackF = new StackOfStudents();
        while (!stackOfStudents1.isEmpty()) {
            Student student = stackOfStudents1.pop();
            tempStackM.push(student);
            push(student);
        }
        while (!stackOfStudents2.isEmpty()) {
            Student student = stackOfStudents2.pop();
            tempStackF.push(student);
            push(student);
        }

        // restoring our stack
        while (!tempStackM.isEmpty()) {
            Student student = tempStackM.pop();
            stackOfStudents1.push(student);
        }
        while (!tempStackF.isEmpty()) {
            Student student = tempStackF.pop();
            stackOfStudents2.push(student);
        }


    }


    void displayQueues() {
        for (int i = 0; i < 5; i++) {
            Node current = parentalLevelQueue[i].next;
            System.out.println((i + 1) + " : Queue for Parental Level: ");
            System.out.println("-----------------------------");

            if (current != null) {
                System.out.println("Parental Level: " + current.data.parentalLevel);
            }

            while (current != null) {
                   System.out.println("Student: Average Marks - " + current.data.averageMarks() + ", Gender - " + current.data.gender);
                current = current.next;
            }
            System.out.println();
        }
    }




    // problem 2 -->  gender performance at parental level  --> start

    public void genderPerformanceAtParentalLevel() {
        genderPerformanceFinder(parentalLevelQueue[0].next);
        genderPerformanceFinder(parentalLevelQueue[1].next);
        genderPerformanceFinder(parentalLevelQueue[2].next);
        genderPerformanceFinder(parentalLevelQueue[3].next);
        genderPerformanceFinder(parentalLevelQueue[4].next);
    }


    public void genderPerformanceFinder(Node head) {
        Node temp = head;
        String pl = head.data.parentalLevel;
        double male = 0, female = 0;
        int maleSize = 0;
        int femaleSize = 0;

        while (temp != null && temp.data != null) {
            if (Objects.equals(temp.data.gender, "female")) {
                female += temp.data.averageScore;
                femaleSize++;
            } else {
                male += temp.data.averageScore;
                maleSize++;
            }

            temp = temp.next;
        }


        System.out.println("Performance Of Male : at Parental Level : " + pl + " : " + male / maleSize);
        System.out.println("Performance Of Female at Parental Level : " + pl + " : " + female / femaleSize);
        if (male / maleSize > female / femaleSize) {
            System.out.println("Male performs better");
        } else if (male / maleSize < female / femaleSize) {
            System.out.println("Female performs better");
        }


    }

    // problem 2  -->  end of gender performance finder method


    // problem 3 --> start of group performance at parental level

    public void groupPerformanceAtParentalLevel() {


        System.out.println("**** Data For Parental Level : " + parentalLevelQueue[0].next.data.parentalLevel +" ****");
        groupPerformanceFinder(parentalLevelQueue[0].next);
        System.out.println("**** Data For Parental Level : " + parentalLevelQueue[1].next.data.parentalLevel +" ****");
        groupPerformanceFinder(parentalLevelQueue[1].next);
        System.out.println("**** Data For Parental Level : " + parentalLevelQueue[2].next.data.parentalLevel +" ****");
        groupPerformanceFinder(parentalLevelQueue[2].next);
        System.out.println("**** Data For Parental Level : " + parentalLevelQueue[3].next.data.parentalLevel +" ****");
        groupPerformanceFinder(parentalLevelQueue[3].next);
        System.out.println("**** Data For Parental Level : " + parentalLevelQueue[4].next.data.parentalLevel +" ****");
        groupPerformanceFinder(parentalLevelQueue[4].next);
        System.out.println("**** Data For Parental Level : " + parentalLevelQueue[5].next.data.parentalLevel +" ****");
        groupPerformanceFinder(parentalLevelQueue[5].next);
    }

    public void groupPerformanceFinder(Node head) {
        Node temp = head;
        String[] groups = {"group A", "group B", "group C", "group D", "group E"};
        double[] avgMarks = new double[groups.length];
        int[] totalNumber = new int[groups.length];

        while (temp != null && temp.data != null) {
            for (int i = 0; i < groups.length; i++) {
                if (Objects.equals(temp.data.group, groups[i])) {
                    avgMarks[i] += temp.data.averageScore;
                    totalNumber[i]++;
                }
            }
            temp = temp.next;
        }
        for(int i=0;i<groups.length;i++){


            System.out.println(groups[i] + ": Total AVG marks : " +   avgMarks[i] + ": Total Number of Students : " + totalNumber[i]);
        }

        double max = 0;
        int maxIndex = 0;

        for (int i = 0; i < groups.length; i++) {
           double marks = totalNumber[i] != 0 ? avgMarks[i] / totalNumber[i] : 0; // Handle division by zero imp
            if (marks > max) {
                max = marks;
                maxIndex = i;
            }
        }

        System.out.println("The group with the highest average marks is: " + groups[maxIndex] + " : marks : " + max + " Total Students: " + totalNumber[maxIndex]);
        System.out.println();
    }

    // problem 3 --> end of group performance finder at parental level

    // problem 4 --> start of finding median of avg marks of male and female

    public void medianOfAvgOfMaleAndFemale(){
        medianOfAvgMarksFinder(stackOfStudents1);
        medianOfAvgMarksFinder(stackOfStudents2);
    }
    public void medianOfAvgMarksFinder(StackOfStudents stackOfStudents ){
        Node temp1 = stackOfStudents.head;
       temp1.sort();
        int size = Node.size(temp1);
        int limit = size/2;
        double medianMarks ;
        if(size%2==1){
            for(int i=0;i<limit+1;i++){
                temp1 = temp1.next;
            }
            medianMarks = temp1.data.averageScore;
        }
        else{
            for(int i=0;i<limit;i++){
                temp1=temp1.next;
            }
            medianMarks = (temp1.data.averageScore + temp1.next.data.averageScore)/2;
        }

        System.out.println("Median of Given AVG marks of list of " + temp1.data.gender + " is : " + medianMarks);

    }
// end of problem 4 --> finding median











  /*  public void checkLength(int length) {
        if (length >= parentalLevelQueue.length) {
            resizeQueuesArray();
        }
    }

    public void resizeQueuesArray() {
        int size = parentalLevelQueue.length;
        Node[] newQueue = new Node[2 * size];
        System.arraycopy(parentalLevelQueue, 0, newQueue, 0, size);
        parentalLevelQueue = newQueue;


    }*/
}



