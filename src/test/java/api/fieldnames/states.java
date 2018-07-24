
// adding additional properties for the nested LIST

package api.fieldnames;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class states {
    public String status;
    public Boolean monitored;

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public Boolean getMonitored() {
        return monitored;
    }
    public void setMonitored(Boolean monitored) {
        this.monitored = monitored;
    }
}
