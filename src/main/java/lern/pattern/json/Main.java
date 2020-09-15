package lern.pattern.json;
//Чтение и запись в файл json
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Main {

    public static void main(String[] args) throws IOException, ParseException {
        ArrayList<Cat> cats=new ArrayList<>();
        org.json.simple.parser.JSONParser parser=new org.json.simple.parser.JSONParser();
        FileReader reader=new FileReader("src/main/java/lern/pattern/json/mycat");

        Object object = parser.parse(reader);

        JSONArray array = (JSONArray)object;

        for (int i=0; i<array.size();i++){
            Cat cat=new Cat();
            JSONObject obj2 = (JSONObject)array.get(i);

            cat.setName(String.valueOf(obj2.get("name")));
            cat.setWeight(Integer.valueOf(String.valueOf(obj2.get("weight"))));
            cat.setAge(Integer.valueOf(String.valueOf(obj2.get("age"))));

            cats.add(cat);
        }

        Cat newCat=new Cat();

        newCat.setName("Muuuuuurka");
        newCat.setAge(3);
        newCat.setWeight(12);

        cats.add(newCat);

        FileOutputStream fileOutputStream=new FileOutputStream("src/main/java/lern/pattern/json/mycat");

        ObjectMapper mapper = new ObjectMapper();

        mapper.writeValue(fileOutputStream, cats);

//        mapper.writeValue(stringWriter, cats);

    }
}
