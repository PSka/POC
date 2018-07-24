
// adding additional properties for the nested LIST

package api.fieldnames;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class contacts {
    public String email;
    public String phone; // as dummy data has
    public String city;
    public List<String> addressLines;

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public List<String> getAddressLines() {
        return addressLines;
    }
    public void setAddressLines(List<String> addressLines) {
        this.addressLines = addressLines;
    }
}
