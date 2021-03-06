import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.concurrent.ThreadLocalRandom;

final class Util {

    static File FILE_DIR = new File(System.getProperty("user.dir"), "csv-folder");

    static {
        if (!FILE_DIR.exists()) {
            FILE_DIR.mkdir();
        }
    }

    static Date randomizeDate() {
        Date d1 = new GregorianCalendar(2010, 1, 1).getTime();
        Date d2 = new Date();

        return new Date(ThreadLocalRandom.current()
                .nextLong(d1.getTime(), d2.getTime()));
    }

    static String formatDate(Date randomDate) {
        return new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(randomDate);
    }

    static String randomizeClientId() {
        return String.valueOf(ThreadLocalRandom.current().nextInt(10)) +
                ThreadLocalRandom.current().nextInt(10) +
                ThreadLocalRandom.current().nextInt(10);
    }

}
