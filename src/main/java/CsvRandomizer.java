import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Random;

public class CsvRandomizer {

    private static CsvModel csvModel = new CsvModel();

    public static void main(String[] args) throws IOException {
        fileWriter();
    }

    private static void fileWriter() throws IOException {

        try(FileWriter fw = new FileWriter(Util.FILE_DIR + "/" + "output.csv")){
            for (long i = 0; i < 1000000; i++) {
                long leftLimit = 1001L;
                long rightLimit = 5001L;
                long generatedLong = Math.abs(leftLimit + (long) (Math.random() * (rightLimit - leftLimit)));

                String clientId = Util.randomizeClientId();
                String callId = Util.randomizeClientId();
                Date startDate = Util.randomizeDate();

                csvModel.setClientId(clientId);
                csvModel.setCallId(!callId.equals(clientId) ? callId : Util.randomizeClientId());
                csvModel.setCallTime(Math.abs(new Random().nextInt(255)));
                csvModel.setCallStartDateTime(Util.formatDate(startDate));
                csvModel.setCallResponseDateTime(Util.formatDate(new Date(startDate.getTime() + generatedLong )));

                fw.write(csvModel.getClientId()+","+csvModel.getCallId()+","+csvModel.getCallTime()+","+csvModel.getCallStartDateTime()+","+csvModel.getCallResponseDateTime()+"\n");
            }
        }
    }
}
