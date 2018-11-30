import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class CsvRandomizer {

    private static CsvModel csvModel = new CsvModel();
    private static final int ENTRY_SIZE = 1_000_000;
    private static final long leftLimit = 1001L;
    private static final long rightLimit = 5001L;

    public static void main(String[] args) throws IOException {
        fileWriter();
    }

    private static void fileWriter() throws IOException {
        try(FileWriter fw = new FileWriter(Util.FILE_DIR + "/" + "output.csv")){

            for (long i = 0; i < ENTRY_SIZE; i++) {
                long generatedLong = Math.abs(leftLimit + (long) (Math.random() * (rightLimit - leftLimit)));

                String clientId = Util.randomizeClientId();
                String callId = Util.randomizeClientId();
                Date startDate = Util.randomizeDate();

                csvModel.setClientId(clientId);
                csvModel.setCallId(!callId.equals(clientId) ? callId : Util.randomizeClientId());
                csvModel.setCallTime(Math.abs(new Random().nextInt(255)));
                csvModel.setCallStartDateTime(Util.formatDate(startDate));
                csvModel.setCallResponseDateTime(Util.formatDate(new Date(startDate.getTime() + generatedLong )));

                fw.write(csvModel.toString()+"\n");
            }
        }
    }
}
