package clock.src.com.time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Time implements Runnable {

    private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss dd-MM-yyyy");
    public static String currenTime = LocalDateTime.now().format(formatter);

    @Override
    public void run() {
        while (currenTime != LocalDateTime.now().format(formatter)) {
            currenTime = LocalDateTime.now().format(formatter);
        }
    }


}
