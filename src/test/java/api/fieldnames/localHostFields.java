package api.fieldnames;

import java.util.List;

public class localHostFields {
    public Object id;
    public String ebaId;
    public String name;
    public String comments;
    public contacts contact;
    public states state;
    public List<String> accreditations; // this is for   "accreditations": ["AIS","PIS"]
    public nationalAccreditationDatas nationalAccreditationData;  //    public AddPropFields additionalProperties; can use this format but that does not work for all nested array
    public List<String>  physicalContact;


    public Object getId() {
        return id;
    }
    public void setId(Object id) {
        this.id = id;
    }
    public String getEbaId() {
        return ebaId;
    }
    public void setEbaId(String ebaId) {
        this.ebaId = ebaId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getComments() {
        return comments;
    }
    public void setComments(String comments) {
        this.comments = comments;
    }
    public states getState() {
        return state;
    }
    public void setState(states state) {
        this.state = state;
    }
    public contacts getContact() {
        return contact;
    }
    public void setContact(contacts contact) {
        this.contact = contact;
    }
    public List<String> getAccreditations() {
        return accreditations;
    }
    public void setAccreditations(List<String> accreditations) {
        this.accreditations = accreditations;
    }
    public nationalAccreditationDatas getNationalAccreditationData() {
        return nationalAccreditationData;
    }
    public void setNationalAccreditationData(nationalAccreditationDatas nationalAccreditationData) {
        this.nationalAccreditationData = nationalAccreditationData;
    }

    public List<String> getPhysicalContact() {
        return physicalContact;
    }
    public void setPhysicalContact(List<String> physicalContact) {
        this.physicalContact = physicalContact;
    }
}
