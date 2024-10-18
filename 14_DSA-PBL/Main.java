import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\Farooque\\IdeaProjects\\DSA_PBL\\src\\StudentsData.txt";
        Node maleHead = null;
        Node femaleHead = null;
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            boolean firstLine = true; // Skip the header line
            while ((line = br.readLine()) != null) {
                if (firstLine) {
                    firstLine = false;
                    continue;
                }
                String[] values = line.split(",");

                String gender = values[0].replaceAll("\"", "").trim();
                String group = values[1].replaceAll("\"", "").trim();
                String parentalEducation = values[2].replaceAll("\"", "").trim();
                String lunch = values[3].replaceAll("\"", "").trim();
                String testPreparation = values[4].replaceAll("\"", "").trim();
                int mathScore = Integer.parseInt(values[5].replaceAll("\"", "").trim());
                int readingScore = Integer.parseInt(values[6].replaceAll("\"", "").trim());
                int writingScore = Integer.parseInt(values[7].replaceAll("\"", "").trim());

                Student student = new Student(gender, group, parentalEducation,  mathScore, readingScore, writingScore);
                if (Objects.equals(student.gender, "female")) {
                    if (femaleHead == null) femaleHead = new Node(student);
                    else
                        femaleHead.push(student);
                }
                else
                    if(maleHead==null) maleHead = new Node(student);
                    else maleHead.push(student);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        System.out.println("**************************************************************************************");
        System.out.println();
    //    maleHead.print(maleHead);
        System.out.println();
     //   femaleHead.print(femaleHead);
        maleHead.sort();
        femaleHead.sort();
        System.out.println();
      //  maleHead.print(maleHead);
       // femaleHead.print(maleHead);
        System.out.println();


        Node temp1 = maleHead;
        Node temp2 = femaleHead;
        StackOfStudents maleStack = new StackOfStudents();
        while(temp1!=null){
            maleStack.push(temp1.data);
           temp1 = temp1.next;
        }

        StackOfStudents femaleStack = new StackOfStudents();
        while(temp2!=null){
            femaleStack.push(temp2.data);
            temp2 = temp2.next;
        }
     //   maleStack.printStack(maleStack);
       // femaleStack.printStack(femaleStack);
        System.out.println();

        System.out.println("Size :" + maleStack.size());
        System.out.println();
        System.out.println("Size :" + femaleStack.size());
        System.out.println();

       /* System.out.println(maleStack.peek());
        System.out.println();
        maleStack.printStack(maleStack);
        System.out.println(maleStack.pop());*/




     //    maleStack.printStack(maleStack);
        System.out.println();
       // femaleStack.printStack(femaleStack);


        System.out.println();
      QueueForParentalLevel q1 = new QueueForParentalLevel(maleStack,femaleStack);
     // maleHead.print(q1.parentalLevelQueue[0]);
      q1.createQueuesForParentalLevels();
      q1.groupPerformanceAtParentalLevel();
       q1.medianOfAvgOfMaleAndFemale();
      q1.genderPerformanceAtParentalLevel();

  //    q1.displayQueues();//

        QueueForGroups queueForGroups = new QueueForGroups(maleStack,femaleStack);

       /* queueForGroups.createQueuesForGroups();
        queueForGroups.displayQueues();
        queueForGroups.bestAvgMarksOfGroups();
*/







    }
}
