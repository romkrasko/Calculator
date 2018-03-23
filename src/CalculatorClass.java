public class CalculatorClass {
    double value1,value2;

    public CalculatorClass(double value1, double value2) {
        this.value1 = value1;
        this.value2 = value2;
    }
    public double sum()
    {
        return(value1+value2);
    }

    public double  difference()
    {
        return (value1-value2);
    }

    public void miptiply()
    {
        System.out.println("Multiply = "+ value1*value2);
    }

    public void divide()
    {
        System.out.println("Divide = "+ value1/value2);
    }
}
