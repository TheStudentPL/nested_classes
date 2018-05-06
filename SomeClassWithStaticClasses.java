package documentation.nested_classes;

/**
 * Created by piotr.rozek on 2018-05-02.
 */
public class SomeClassWithStaticClasses {

    public String field1;

    public void getFieldFormNestedClass() {
        field1 = new NestedStaticClass().commonField;
    }

  /*  public static class NestedStaticClass {
        public final static String finalStaticField = "someValue";
        private String commonField = "commonField";

        public static void someStaticMethod() {
        }

        public void someMethod() {
        }

        public void someMethod(SomeClassWithStaticClasses someClassWithStaticClasses) {
            System.out.println(someClassWithStaticClasses.field1);
        }
    }*/

}

