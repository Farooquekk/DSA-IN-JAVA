package Graph;

public class Catalan_Number {

    public int catalanNumber(int n){
        if(n<=1) return 1;
        int res=0;
       for(int i=0;i<=n-1;i++){
           res+=catalanNumber(i)*catalanNumber(n-i-1);
       }
       return res;
    }

    public static void main(String[] args) {

        Catalan_Number cn1 = new Catalan_Number();
        for(int i=0;i<10;i++){
            System.out.println("Catalan Number of : " + i + " : " + cn1.catalanNumber(i)  );
        }

    }


}
