class BaseClass {
    public String publicVar = "I am PUBLIC";        // accessible everywhere
    private String privateVar = "I am PRIVATE";     // accessible only in this class
    protected String protectedVar = "I am PROTECTED"; // accessible in same package & subclasses
    String defaultVar = "I am DEFAULT";             // package-private (no modifier)

    public void showAccess() {
        System.out.println("\n--- Inside BaseClass ---");
        System.out.println(publicVar);     //  accessible
        System.out.println(privateVar);    //  accessible
        System.out.println(protectedVar);  //  accessible
        System.out.println(defaultVar);    //  accessible
    }
}

class SubClass extends BaseClass {
    public void showAccessFromSubclass() {
        System.out.println("\n--- Inside SubClass (extends BaseClass) ---");
        System.out.println(publicVar);     // accessible
        // System.out.println(privateVar); //  private not accessible
        System.out.println(protectedVar);  //  accessible via inheritance
        System.out.println(defaultVar);    //  accessible (same package)
    }
}

public class AccessSpecifiersDemo {
    public static void main(String[] args) {
        BaseClass base = new BaseClass();
        SubClass sub = new SubClass();

        // Inside BaseClass method
        base.showAccess();

        // Inside SubClass method
        sub.showAccessFromSubclass();

        System.out.println("\n--- From main() ---");
        System.out.println(base.publicVar);      //  accessible
       // System.out.println(base.privateVar);  //  ERROR: private
        System.out.println(base.protectedVar);   //  accessible (same package)
        System.out.println(base.defaultVar);     //  accessible (same package)
    }
}