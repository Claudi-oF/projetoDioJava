package projectFlowControl;

import java.util.Random;

public interface DoWhileExample {
    public static void main(String[] args) {
        System.out.println("Dialing...");

        do {

            System.out.println("Phone ringing");

        }while(ringing());

        System.out.println("Hello!!!");

    }

    private static boolean ringing(){
        boolean attended = new Random().nextInt(3) == 1;
        System.out.println(("Attended? ") + attended);

        //
        return ! attended;

    }
}
