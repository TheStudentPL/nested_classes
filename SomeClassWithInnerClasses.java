package documentation.nested_classes;

/**
 * Created by piotr.rozek on 2018-05-02.
 */
public class SomeClassWithInnerClasses {

    private String field1 = "outerClass field";
    private String x = "IamSomeClassWithInnerClassesX";
    
    public void setField1(String value) {
        this.field1 = value;
    }

    public String getField1(){
        return this.field1;
    }

    public void getFieldFormNestedClass() {
        field1 = new InnerClass().innerField;
    }

    public void setInnerField(InnerClass innerClass) {
    	field1 = innerClass.innerField;
    }
    
    public class InnerClass {
        private String innerField = "innerField";
        private String x = "IamInnerFieldX";
        
        public void displayOutsideField() {
            System.out.println(field1);
            //TODO
        }

        public void someMethod(SomeClassWithInnerClasses someClass) {
            System.out.println(someClass.field1);
            //TODO
        }

        public void setOutsideField(String newValue) {
            field1 = newValue;
        }
   
        public void setInnerFieldMethod(String str) {
        	field1 = str;
        }
        public void displayXMen(String x) {
        	System.out.println(x);
        	System.out.println(this.x);
        	System.out.println(SomeClassWithInnerClasses.this.x);
        }
        
        public SomeClassWithInnerClasses geReferenceOuterObject() {
        	return SomeClassWithInnerClasses.this;
        }
        
    }
}
