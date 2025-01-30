import java.util.Scanner;

public class StopWatch {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter time in minutes you want to count:- ");
            int timeLimit = sc.nextInt(), minutes = 0, seconds = 0, milliseconds = 0;
            for (;;) {
                if (minutes < timeLimit) {
                    if (seconds <= 60) {
                        if (milliseconds < 100) {
                            milliseconds++;
                            System.out.printf("\r%02d:%02d:%03d", minutes, seconds, milliseconds);
                            Thread.sleep(7);
                        } else {
                            milliseconds = 0;
                            seconds++;
                        }
                    } else {
                        seconds = 0;
                        minutes++;
                    }
                } else {
                    System.out.println("\n\nLimit reached!\n");
                    System.exit(0);
                }
                sc.close();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
