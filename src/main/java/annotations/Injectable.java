package annotations;

public class Injectable {
    @SetMe
    private String name = "DEFAULT";
    private String address = "DEFAULT";
    private String other = "DEFAULT";

    @Override
    public String toString() {
        return "Injectable{" + "name=" + name + ", address=" + address + ", other=" + other + '}';
    }
}
