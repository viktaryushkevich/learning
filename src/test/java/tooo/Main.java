package tooo;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.File;

public class Main {
//    public static void main(String[] args) throws IOException {
//
//
//        System.out.println(System.getProperty("user.dir"));
//        File f = new File("C:\\Users\\Viktar Yushkevich\\IdeaProjects\\untitled3\\src\\test\\java\\tooo\\sample.json");
//        if(f.exists() && !f.isDirectory()) {
//            System.out.println("Go");
//        }
//        InputStream getLocalJsonFile = new FileInputStream("C:\\Users\\Viktar Yushkevich\\IdeaProjects\\untitled3\\src\\test\\java\\tooo\\sample.json");
//        HashMap<String,Object> jsonMap = new ObjectMapper().readValue(getLocalJsonFile, HashMap.class);
//        System.out.println(jsonMap);
//
//
//
//    ObjectMapper om = new ObjectMapper();
//    Root root= om.readValue(getLocalJsonFile, Root.class);
//
//        String name = root.login.userName;
//
//
//
//}

    public static Root getValues() throws IOException {
        InputStream getLocalJsonFile = new FileInputStream("C:\\Users\\Viktar Yushkevich\\IdeaProjects\\untitled3\\src\\test\\java\\tooo\\sample.json");
        ObjectMapper om = new ObjectMapper();
        Root jsonFile= om.readValue(getLocalJsonFile, Root.class);

//        String name = root.login.userName;

        return jsonFile;
    }


}





