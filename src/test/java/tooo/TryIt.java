package tooo;

        import java.io.IOException;
        import net.sf.json.JSONObject;
        import net.sf.json.JSONSerializer;
        import org.apache.commons.io.IOUtils;
        import java.io.InputStream;

public class TryIt {
    private String email;

    public TryIt(String fileToParse)  {
        InputStream is = TryIt.class.getClassLoader().getResourceAsStream(fileToParse);

        if (is == null) {
            throw new IllegalArgumentException(fileToParse + " file does not exist");
        }

        String jsonTxt = null;
        try {
            jsonTxt = IOUtils.toString( is );
        } catch (final IOException e) {
            throw new IllegalStateException("Can not parse file " + fileToParse, e);
        }

        JSONObject json = (JSONObject) JSONSerializer.toJSON( jsonTxt );
//        double coolness = json.getDouble( "coolness" );
//        int altitude = json.getInt( "altitude" );
        JSONObject login = json.getJSONObject("login");
        String firstName = login.getString("userName");
        email = login.getString("email");

        String a = json.getJSONObject("login").getString("email");
        System.out.println( "Coolness: " + login );
        System.out.println( "Altitude: " + firstName );
        System.out.println( "Pilot: " + email );
        System.out.println( "Pilot: " + a );
//        static String myMethod() {
//            System.out.println("hah");
//            return email;
//
//        }


    }
    public String getEmail() {
       return email;
    }

}



