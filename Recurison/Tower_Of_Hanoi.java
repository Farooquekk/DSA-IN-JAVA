package Recurison;

public class Tower_Of_Hanoi {


    public void towerOfHanoi(int num ,String source , String auxiliary,String destination ){
        if(num<=0) return;
        towerOfHanoi(num-1,source,destination,auxiliary);
        System.out.println("Moving Disk "+ num +" From " + source + " to " + destination);
        towerOfHanoi(num-1,auxiliary,source,destination);



    }


    public static void main(String[] args) {

        Tower_Of_Hanoi t1 = new Tower_Of_Hanoi();
        t1.towerOfHanoi(3,"Source","Auxiliary","Destination");

    }
}
