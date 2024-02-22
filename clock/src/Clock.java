package clock.src;
import clock.src.com.time.Time;

public class Clock implements Runnable {
    public static void main(String[] args) throws Exception {

        Time time = new Time();
        Thread timeThread = new Thread(time);
        timeThread.setDaemon(true);
        timeThread.start();

        Clock clock = new Clock();
        Thread clockThread = new Thread(clock);
        clockThread.setPriority(clockThread.getPriority() + 1);
        clockThread.start();
    }

    @Override
    public void run() {

        Boolean bool = true;
        while (bool) {
            System.out.println(Time.currenTime);
        }

    }
}
