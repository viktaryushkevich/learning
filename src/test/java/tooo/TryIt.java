package tooo;

        import net.sf.json.JSONObject;
        import net.sf.json.JSONSerializer;
        import org.apache.commons.io.IOUtils;
        import java.io.InputStream;

public class TryIt {
    public static String email;

    public static void main(String[] args) throws Exception {
        InputStream is =
                TryIt.class.getResourceAsStream( "sample.json");
        String jsonTxt = IOUtils.toString( is );

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
    public String getUs() {
       String goal = email;

        return goal;
    }

}



