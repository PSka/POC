package api.service;

public class DeleteJsonData {

//    private static final String PostUrl = "http://localhost:3000/posts";
//
//    public void DeleteData(Integer id,
//                           String firstname,
//                           String lastname,
//                           DataTable tableData) {
//
//        List<contact> mylist = new ArrayList<>(); // this list will help add all the results from "add"
//
//        JsonFields_Demo postfields = new JsonFields_Demo();
//        postfields.setId(id);
//        postfields.setFirst_name(firstname);
//        postfields.setLast_name(lastname);
//
//        for (Map<String, String> data : tableData.asMaps(String.class, String.class)) {
//
//            contact add = new contact();
//            add.setEmail(data.get("Email"));
//            add.setAddress(data.get("Address"));
//            add.setCountry(data.get("Country"));
//            add.setPhone(Integer.valueOf(data.get(1212121212)));
//            add.setModified(data.get("modified"));
//
//            mylist.add(add);
//        }
//        postfields.setAdditionalProperties(mylist);
//
//        RestAssured
//                .given()
//                .contentType(ContentType.JSON)
//                .body(postfields)
//                .when()
//                .request(Method.POST, PostUrl)
//                .then()
//                .statusCode(201);
//    }
}




