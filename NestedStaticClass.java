package documentation.nested_classes;

public class NestedStaticClass {

	public final static String finalStaticField = "someValue";
    public String commonField = "commonField";

    public static void someStaticMethod() {
    }

    public void someMethod() {
    }

    public void someMethod(SomeClassWithStaticClasses someClassWithStaticClasses) {
        System.out.println(someClassWithStaticClasses.field1);
    }
	
}
