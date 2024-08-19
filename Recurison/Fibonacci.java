package Recurison;

public class Fibonacci {

    public int fabo(int num){

   if(num<=1) return num;
   return fabo(num-1)+fabo(num-2);
    }

    public static void main(String[] args) {
        Fibonacci f1 = new Fibonacci();
        for(int i=0;i<10;i++){
            System.out.print(f1.fabo(i) + " ");
        }
        System.out.println();


    }


}
