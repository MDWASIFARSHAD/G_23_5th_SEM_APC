package DependencyInjection_24_07;

public class OptionalExample {
	
	public static void main(String[] args) {

        //empty() - 
        Optional<String> emptyOpt = Optional.empty();
        System.out.println( emptyOpt.isPresent());

        Optional<String> nameOpt = Optional.of("Wasif");
        System.out.println( nameOpt.get());

        Optional<String> nullableOpt = Optional.ofNullable(null);
        System.out.println( nullableOpt.isPresent());

        if (nameOpt.isPresent()) {
            System.out.println(nameOpt.get());
        }

        //  ifPresent() - 
        nameOpt.ifPresent(name -> System.out.println("Length of name: " + name.length()));

        // . orElse() 
        String city = nullableOpt.orElse("Default City");
        System.out.println("City: " + city);

}
