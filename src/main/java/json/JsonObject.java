package json;

//import sun.awt.image.ImageWatched;

import java.util.*;

/**
 * Created by Andrii_Rodionov on 1/3/2017.
 */
public class JsonObject extends Json {
    private ArrayList jArray = new ArrayList();

    public JsonObject(JsonPair... jsonPairs) {
        for(JsonPair jPair : jsonPairs){
            jArray.add(jPair);
        }
    }

    @Override
    public String toJson() {
        String jStr = "";
       for(Object jPair : jArray){
           jStr += ((JsonPair) jPair).key + ":" + ((JsonPair) jPair).value;
       }
       return jStr.toString();
    }

    public void add(JsonPair jsonPair) {
        jArray.add(jsonPair);
    }

    public Json find(String name) {
        for(Object jPair : jArray){
            if(((JsonPair) jPair).key.equals(name))
                return ((JsonPair) jPair).value;
        }
    }

    public JsonObject projection(String... names) {
        // ToDo
        return null;
    }
}
