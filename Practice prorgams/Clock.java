public class Clock {
    public static void main(String[] args) {
        while (true) {
            long currentTimeMillis = System.currentTimeMillis();
            long totalSeconds = currentTimeMillis / 1000;
            long hours = (totalSeconds / 3600) % 24;
            long minutes = (totalSeconds / 60) % 60;
            long seconds = totalSeconds % 60;

            System.out.printf("\r%02d:%02d:%02d", hours, minutes, seconds);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}