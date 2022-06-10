package tooo;

import org.json.JSONObject;
import net.sf.json.JSONSerializer;

import java.io.InputStream;
import java.util.Objects;

public class JasonParsing {

    public static JSONObject json;

    static {
        InputStream stream = JasonParsing.class.getResourceAsStream("/Campaign_test.json");

        String jsonTxt = Objects.requireNonNull(stream).toString();

        json = (JSONObject) JSONSerializer.toJSON(jsonTxt);
    }
}
