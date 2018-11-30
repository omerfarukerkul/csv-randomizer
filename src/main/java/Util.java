import java.io.*;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public final class Util {

    public static File FILE_DIR = new File(System.getProperty("user.dir"), "csv-folder");

    static {
        if (!FILE_DIR.exists()) {
            FILE_DIR.mkdir();
        }
    }

    public static Date randomizeDate(){
        Date d1 = new GregorianCalendar(2010, 1, 1).getTime();
        Date d2 = new Date();

        Date randomDate = new Date(ThreadLocalRandom.current()
                .nextLong(d1.getTime(), d2.getTime()));

        return randomDate;
    }

    public static String formatDate(Date randomDate){
        SimpleDateFormat smp = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String formatted = smp.format(randomDate);

        return formatted;
    }

    public static String randomizeClientId(){
        final StringBuilder strb = new StringBuilder();
        final Random rand = new Random();

        strb.append(rand.nextInt(10));
        strb.append(rand.nextInt(10));
        strb.append(rand.nextInt(10));
        return strb.toString();
    }



    public static void makeRow() throws IOException {
        final Random random = new Random();



    }


}
