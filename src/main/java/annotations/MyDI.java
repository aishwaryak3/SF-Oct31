package annotations;

import java.lang.reflect.Field;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

public class MyDI {
    public static void main(String[] args) throws Throwable {
        Properties props = new Properties();
        props.load(Files.newBufferedReader(Paths.get("injection.properties")));
        String classToLoad = props.getProperty("toLoad");
        Class theClass = Class.forName(classToLoad);
        Object target = theClass.newInstance();
        Field[] fields = theClass.getDeclaredFields();
        for (Field f : fields) {
            SetMe annot = f.getAnnotation(SetMe.class);
            if (f != null) {
                f.setAccessible(true);
                f.set(target, "This was injected");
            }
        }
        System.out.println("Target is: " + target);
    }
}
