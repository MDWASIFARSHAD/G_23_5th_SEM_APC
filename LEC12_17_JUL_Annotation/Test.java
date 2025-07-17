package CustomAnnotation;

import java.lang.annotation.Annotation;

public class Test {
	
	public static void main(String[] args) {
		
		CustomAnnotationExample ca = new CustomAnnotationExample();
		Class c =ca.getClass();
		Annotation a = c.getAnnotations(SmartPhone.class);
	}
	        

}
