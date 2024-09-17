public class Student {

    //attributes
    String gender;
    String group;
    String parentalLevel;
     int mathScore;
    int readingScore;
    int writingScore;
    double averageScore;

    // constructor

    public Student(String gender, String group, String parentalLevel, int mathScore, int readingScore, int writingScore) {
        this.gender = gender;
        this.group = group;
        this.parentalLevel = parentalLevel;
        this.mathScore = mathScore;
        this.readingScore = readingScore;
        this.writingScore = writingScore;
        this.averageScore =   (mathScore + readingScore + writingScore) /3.0;
    }

    public double averageMarks(){

        return averageScore;



    }

    // toString Method
       @Override
    public String toString() {
        return "Student{" +
                "gender='" + gender + '\'' +
                ", group='" + group + '\'' +
                ", parentalLevel='" + parentalLevel + '\'' +
                ", mathScore=" + mathScore +
                ", readingScore=" + readingScore +
                ", writingScore=" + writingScore +
                ", averageScore=" + averageScore +
                '}';
    }
}