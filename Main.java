package documentation.nested_classes;

public class Main {

	public static void main(String args[]) {
		SomeClassWithStaticClasses obj1 = new SomeClassWithStaticClasses();
		NestedStaticClass obj2 = new NestedStaticClass();
		obj2.someMethod(obj1);
		obj1.getFieldFormNestedClass();
		obj2.someMethod(obj1);
	
		SomeClassWithInnerClasses obj3 = new SomeClassWithInnerClasses();
		SomeClassWithInnerClasses.InnerClass obj4 = new SomeClassWithInnerClasses().new InnerClass();
		SomeClassWithInnerClasses.InnerClass obj5 = obj3.new InnerClass();
		obj3.setInnerField(obj5);
		System.out.println(obj3.getField1());
		obj4.setInnerFieldMethod("Change InnerFieldNow");
		System.out.println(obj3.getField1());
		obj4.displayXMen("xMen");
		
		SomeClassWithInnerClasses.InnerClass obj6 = new SomeClassWithInnerClasses().new InnerClass();
		//double x = (int) x;
		obj6.setOutsideField("NewOutsideField");
		obj6.displayOutsideField();
		
		SomeClassWithInnerClasses obj8 = obj6.geReferenceOuterObject();
		System.out.println(obj8.getField1());
	}
	
	
}
