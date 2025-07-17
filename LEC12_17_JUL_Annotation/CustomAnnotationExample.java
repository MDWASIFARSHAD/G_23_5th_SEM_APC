package CustomAnnotation;

@interface SmartPhone
{
	String calling();
	int version();
}

@SmartPhone(calling = "Hello", version = 6)
public class CustomAnnotationExample {
	
	int model;
	
	
	
	

}
