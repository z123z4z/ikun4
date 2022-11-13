class Mod implements ICalculate{
    private double result;
    public double calculate(double  m,double  n){
        result= (int)m%(int)n;
        System.out.println(m+"%"+n+"="+(int)result);
        return result;
    }
}