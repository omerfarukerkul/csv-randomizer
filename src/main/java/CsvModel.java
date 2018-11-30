import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class CsvModel implements Serializable {

    private String clientId;
    private String callId;
    private Integer callTime;
    private String callStartDateTime;
    private String callResponseDateTime;

    public CsvModel() {
    }

    public CsvModel(String clientId, String callId, Integer callTime, String callStartDateTime, String callResponseDateTime) {
        this.clientId = clientId;
        this.callId = callId;
        this.callTime = callTime;
        this.callStartDateTime = callStartDateTime;
        this.callResponseDateTime = callResponseDateTime;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getCallId() {
        return callId;
    }

    public void setCallId(String callId) {
        this.callId = callId;
    }

    public Integer getCallTime() {
        return callTime;
    }

    public void setCallTime(Integer callTime) {
        this.callTime = callTime;
    }

    public String getCallStartDateTime() {
        return callStartDateTime;
    }

    public void setCallStartDateTime(String callStartDateTime) {
        this.callStartDateTime = callStartDateTime;
    }

    public String getCallResponseDateTime() {
        return callResponseDateTime;
    }

    public void setCallResponseDateTime(String callResponseDateTime) {
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
