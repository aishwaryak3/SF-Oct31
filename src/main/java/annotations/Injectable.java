package annotations;

public class Injectable {
    @SetMe(value="name", count=5)
    private String name = "DEFAULT";
    
    @SetMe
    private String address = "DEFAULT";
    
    
    @SetMe("other")
    private String other = "DEFAULT";

    private String notSet = "DEFAULT";

    @Override
    public String toString() {
        return "Injectable{" + "name=" + name + ", address=" + address + ", other=" + other + ", notSet=" + notSet + '}';
    }
    
   
}
