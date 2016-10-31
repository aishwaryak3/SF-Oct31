package annotations;

import java.lang.reflect.Method;

public class MyJUnit {
    public static void main(String[] args) throws Throwable {
//        System.setSecurityManager(new SecurityManager());
//        System.setSecurityManager(new SecurityManager());
        String theClassName = "annotations.MyTestSuite";
        Class<?> theClass = Class.forName(theClassName);
        
        Object target = theClass.newInstance();
        
//        target.getClass() // don't need to do this, we started with class...
        Method[] methods = theClass.getDeclaredMethods();
        for (Method m : methods) {
            System.out.println("> " + m);
            RunMe myAnnot = m.getAnnotation(RunMe.class);
            if (myAnnot != null) {
                System.out.println("Annotated with @RunMe");
                m.setAccessible(true);
                m.invoke(target);
            }
        }
    }
}
