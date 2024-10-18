package StacksPractice;



public class RPN {

    public RPN(String [] args) {
        ArrayWithStack stack = new ArrayWithStack(args.length);

        for (int i = 0; i < args.length; i++) {
            String input = args[i];

            if (IsAnOperator(input)) {
                double y = Double.parseDouble((String) stack.pop());
                double x = Double.parseDouble((String) stack.pop());
                double z = evaluate(x, y, input);
                stack.push(" " + z);
            } else {
                stack.push(" " + input);
            }

        }
    }
    public boolean IsAnOperator(String input){
        return (input.length()==1 && "AMSD".contains(input));
    }

    public Double evaluate(double x , double y , String op){
       double result;
        if(op.equals("A")) result = x+y;
        else if(op.equals("M")) result = x*y;
        else if(op.equals("S")) result = x-y;
        else result=x/y;
        System.out.println(x + " " + op + " " + y + " = " + result);
        return result;
    }

    public static void main(String[] args) {
        String [] aa = {"99" , "9" , "9" ,"10","10","D","D","D","D"};
        String [] a = {"7" , "2" , "A"};

        new RPN(a);
        new RPN(aa);

    }

}
