package projectDebugginJava;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Inciated program in the method main");
        MethodA();
        System.out.println("Endind program in the method main");
        }

    public static void MethodA() {
        System.out.println("Inciated program in the method A");
        MethodB();
        System.out.println("Endind program in the method A");
    }

    public static void MethodB() {
        System.out.println("Inciated program in the method B");
        MethodC();
        System.out.println("Endind program in the method B");
    }

    public static void MethodC() {
        System.out.println("Inciated program in the method C");
        
        System.out.println("Endind program in the method C");
    }
}
