public class MainClass {
    public static void main(String[]args) {
        CalculatorClass calc = new CalculatorClass(10, 5);
        System.out.println("Sum = " + calc.sum());
        System.out.println("Diff = "+ calc.difference());
        calc.miptiply();
        calc.divide();
    }
}
