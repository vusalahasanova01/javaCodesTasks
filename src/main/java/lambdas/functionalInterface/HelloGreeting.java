package lambdas.functionalInterface;

public class HelloGreeting implements Greeting{
    @Override
    public void sayHello() {
        System.out.println("Say Hello!");
    }
}
