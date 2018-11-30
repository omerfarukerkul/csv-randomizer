import java.io.Serializable;
import java.util.Objects;

public class CsvModel implements Serializable {

    private String clientId;
    private String callId;
    private Integer callTime;
    private String callStartDateTime;
    private String callResponseDateTime;

    CsvModel() {
    }

    public CsvModel(String clientId, String callId, Integer callTime, String callStartDateTime, String callResponseDateTime) {
        this.clientId = clientId;
        this.callId = callId;
        this.callTime = callTime;
        this.callStartDateTime = callStartDateTime;
        this.callResponseDateTime = callResponseDateTime;
    }

    String getClientId() {
        return clientId;
    }

    void setClientId(String clientId) {
        this.clientId = clientId;
    }

    String getCallId() {
        return callId;
    }

    void setCallId(String callId) {
        this.callId = callId;
    }

    Integer getCallTime() {
        return callTime;
    }

    void setCallTime(Integer callTime) {
        this.callTime = callTime;
    }

    String getCallStartDateTime() {
        return callStartDateTime;
    }

    void setCallStartDateTime(String callStartDateTime) {
        this.callStartDateTime = callStartDateTime;
    }

    String getCallResponseDateTime() {
        return callResponseDateTime;
    }

    void setCallResponseDateTime(String callResponseDateTime) {
        this.callResponseDateTime = callResponseDateTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CsvModel csvModel = (CsvModel) o;
        return Objects.equals(clientId, csvModel.clientId) &&
                Objects.equals(callId, csvModel.callId) &&
                Objects.equals(callTime, csvModel.callTime) &&
                Objects.equals(callStartDateTime, csvModel.callStartDateTime) &&
                Objects.equals(callResponseDateTime, csvModel.callResponseDateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientId, callId, callTime, callStartDateTime, callResponseDateTime);
    }

    @Override
    public String toString() {
        return  "clientId='" + clientId + '\'' +
                ", callId='" + callId + '\'' +
                ", callTime=" + callTime +
                ", callStartDateTime='" + callStartDateTime + '\'' +
                ", callResponseDateTime='" + callResponseDateTime + '\'' +
                '}';
    }
}
