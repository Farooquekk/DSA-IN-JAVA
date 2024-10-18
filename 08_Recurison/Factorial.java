package Recurison;

public class Factorial {


    public int fact(int num){
        if(num<0) return -999;
        if(num==0||num==1) return 1;

        return num * fact(num - 1);


    }

    public static void main(String[] args) {

        Factorial f1 = new Factorial();
        System.out.println(f1.fact(0));
    }


}
