public class Main {
    public static void main(String[] args) {
        Ints intsCalc = new IntsCalculator();
        System.out.println(intsCalc.sum(2, 3));
        System.out.println(intsCalc.mult(100, 15));
        System.out.println(intsCalc.pow(2, 8));
    }
}