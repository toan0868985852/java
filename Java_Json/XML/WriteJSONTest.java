package XML;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

public class WriteJSONTest {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        JSONObject employeeDetails = new JSONObject();
        employeeDetails.put("firsName", "Dang");
        employeeDetails.put("lastName", "Kim Thi");
        employeeDetails.put("website", "codelean.vn");

        JSONObject employeeObject = new JSONObject();
        employeeObject.put("employee", employeeDetails);

        JSONObject employeeDetails2 = new JSONObject();
        employeeDetails2.put("firsName", "Code");
        employeeDetails2.put("lastName", "lean");
        employeeDetails2.put("website", "codelean.com");

        JSONObject employeeObject2 = new JSONObject();
        employeeObject2.put("employee", employeeDetails2);

        JSONArray employeelist = new JSONArray();
        employeelist.add(employeeObject);
        employeelist.add(employeeObject2);

        try (FileWriter file = new FileWriter("employees.json")) {

            file.write(employeelist.toJSONString());
            file.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
