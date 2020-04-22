package XML;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import javax.swing.*;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

public class MLJ_08_bai1 {
    public static void main(String[] args) {
        try {
            Object obj = new JSONParser().parse(new FileReader("menu.json"));
            JSONObject jsonObject = (JSONObject) obj;
            Map menu = ((Map) jsonObject.get("menu"));
            Iterator<Map.Entry> itr1 = menu.entrySet().iterator();
            while (itr1.hasNext()) {
                Map.Entry pair = itr1.next();
                System.out.println(pair.getKey() + " : " + pair.getValue());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
