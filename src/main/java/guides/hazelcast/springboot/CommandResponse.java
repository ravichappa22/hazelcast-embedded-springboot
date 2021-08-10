package guides.hazelcast.springboot;

public class CommandResponse {

    private String value;
    private String podName;

    public CommandResponse(String value, String podName) {
        this.value  = value;
        this.podName = podName;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getPodName () {
        return podName;
    }

    public void setPodName (String podName) {
        this.podName = podName;
    }
}
