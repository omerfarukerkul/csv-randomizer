import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;
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

        Date randomDate = new Date(ThreadLocalRandom.current()
                .nextLong(d1.getTime(), d2.getTime()));

        return randomDate;
    }

    static String formatDate(Date randomDate) {
        SimpleDateFormat smp = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String formatted = smp.format(randomDate);

        return formatted;
    }

    static String randomizeClientId() {
        final StringBuilder strb = new StringBuilder();
        final Random rand = new Random();

        strb.append(rand.nextInt(10));
        strb.append(rand.nextInt(10));
        strb.append(rand.nextInt(10));
        return strb.toString();
    }

}
