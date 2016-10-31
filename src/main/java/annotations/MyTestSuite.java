package annotations;

//@RunMe
public class MyTestSuite {
//    @RunMe
    private String name;
    
    @RunMe
    public void doATest() {
        System.out.println("Running doATest");
    }

    @RunMe
    private void doAPrivateTest() {
        System.out.println("Running doAPrivateTest");
    }

    public void dontDoATest() {
        System.out.println("Running dontDoATest");
    }
}
