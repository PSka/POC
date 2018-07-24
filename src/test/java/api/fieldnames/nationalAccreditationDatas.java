
// adding additional properties for the nested LIST

package api.fieldnames;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class nationalAccreditationDatas {
    public String nationalId;
    public List<String> nationalaccreditations;

    public String getNationalId() {
        return nationalId;
    }
    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }

    public List<String> getNationalaccreditations() {
        return nationalaccreditations;
    }
    public void setNationalaccreditations(List<String> nationalaccreditations) {
        this.nationalaccreditations = nationalaccreditations;
    }
}
