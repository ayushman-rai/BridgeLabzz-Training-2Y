public class WrapperToPrimitive {
    public static void main(String[] args) {
        Double obj = 45.67;   // Wrapper object
        double d = obj;       // auto-unboxing
        int i = (int) d;      // casting double → int

        System.out.println("Double object: " + obj);
        System.out.println("Primitive double: " + d);
        System.out.println("Primitive int: " + i);
    }
}
