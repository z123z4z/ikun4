//Calculator.java

import java.util.Scanner;

public class Calculator {

    public static void main(String[] stra0) {
        double op1;
        double op2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input first Double Number:");
        op1=sc.nextDouble();
        System.out.println("Please input second Double Number:");
        op2=sc.nextDouble();
        System.out.print("Add Sub Mul Div Mod Resultes:\n");
        Calculate cal=new Calculate();
        cal.doCalculate(new Add(),op1,op2);
	cal.doCalculate(new Sub(),op1,op2);
        cal.doCalculate(new Mul(),op1,op2);
        cal.doCalculate(new Div(),op1,op2);
	cal.doCalculate(new Mod(),op1,op2);
    }
}