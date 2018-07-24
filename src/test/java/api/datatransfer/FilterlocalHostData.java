package api.datatransfer;

//import ru.yandex.qatools.allure.annotations.Step;

import api.fieldnames.contacts;
import api.fieldnames.localHostFields;
import api.fieldnames.nationalAccreditationDatas;
import api.fieldnames.states;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterlocalHostData {

    private final List<localHostFields> allPoints;  //constant variable bikepoints

    //constructor
    public FilterlocalHostData(localHostFields[] places) {
        allPoints = Arrays.asList(places);
    }

    public List<Object> getallid() {
        return allPoints.stream()
                .map(bp -> bp.id)
                .collect(Collectors.toList());
    }
    public List<String> getallebaId() {
        return allPoints.stream()
                .map(bp -> bp.ebaId)
                .collect(Collectors.toList());
    }
    public List<String> getallname() {
        return allPoints.stream()
                .map(bp -> bp.name)
                .collect(Collectors.toList());
    }
    public List<states> getState() {
        return allPoints
                .stream()
                .map(bp -> bp.state)
                .collect(Collectors.toList());
    }
    public List<String> getallcomments() {
        return allPoints.stream()
                .map(bp -> bp.comments)
                .collect(Collectors.toList());
    }

// Get all contact Details

    public List<contacts> getallcontacts() {
        return allPoints
                .stream()
                .map(bp -> bp.contact)
                .collect(Collectors.toList());
    }
    public List<Object> getcontactEmail() {

        return getallcontacts().stream()
                .map(x -> x.email)
                .collect(Collectors.toList());
    }
    public List<Object> getcontactCity() {

        return getallcontacts().stream()
                .map(x -> x.city)
                .collect(Collectors.toList());
    }
    public List<Object> getcontactPhone() {

        return getallcontacts().stream()
                .map(x -> x.phone)
                .collect(Collectors.toList());
    }
    public List<Object> getcontactAddress() {
        return getallcontacts().stream()
                .map(x -> x.addressLines)
                .collect(Collectors.toList());
    }

// Get all State Details

    public List<Object> getStateStatus() {

        return getState().stream()
                .map(x -> x.status)
                .collect(Collectors.toList());
    }
    public List<Object> getStateMonitored() {

        return getState().stream()
                .map(x -> x.monitored)
                .collect(Collectors.toList());
    }


    // Get all Accreditations Details
    public List<List<String>> getallAccreditations() {
        return allPoints.stream()
                .map(bp -> bp.accreditations)
                .collect(Collectors.toList());
    }

// Get all nationalAccreditationData Details

    public List<nationalAccreditationDatas> getallnationalAccreditationData() {
        return allPoints
                .stream()
                .map(bp -> bp.nationalAccreditationData)
                .collect(Collectors.toList());
    }
    public List<Object> getNationalID() {
        return getallnationalAccreditationData().stream()
                .map(x -> x.nationalId)
                .collect(Collectors.toList());
    }
//    public List<Object> getnationalAccreditation() {
//        return getallnationalAccreditationData().stream()
//                .map(x -> x.accreditations)
//                .collect(Collectors.toList());
//    }

//    // Get all PhysicalContacts Details
//    public List<physicalcontacts> getallPhysicalContacts() {
//        return allPoints.stream()
//                .map(bp -> bp.physicalContact)
//                .collect(Collectors.toList());
//    }
}

//    public List<Object> getAllAdditionalProperties() {
//        List<AddPropFields> data = allPoints          // passing the additional properties of the nested
//                .stream()
//                .flatMap(bp -> bp.additionalProperties.stream())
//                .collect(Collectors.toList());
//
//        return data.stream()
//                .map(x -> x.getEmail())
//                .collect(Collectors.toList());
//    }
//
//
//    public List<Object> getAllAdditionalProperties() {
//        List<contact> data = allPoints          // passing the additional properties of the nested
//                .stream()
//                .flatMap(bp -> bp.additionalProperties.stream())
//                .collect(Collectors.toList());
//
//        return data.stream()
//                .map(x -> x.modified)
//                .collect(Collectors.toList());
//    }

