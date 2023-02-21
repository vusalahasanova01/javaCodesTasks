package lambdas.functionalInterface;

public class Main {
    public static void main(String[] args) {
        Greeting greeting = new HelloGreeting();
        greeting.sayHello();

        Greeting greeting1 = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("say Hello");
            }
        };
        greeting1.sayHello();
    }
}
