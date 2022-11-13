class Add implements ICalculate{

    private double result;
    public double calculate(double m,double n){
        result=m+n;
        System.out.println(m+"+"+n+"="+result);
        return result;
    }
}