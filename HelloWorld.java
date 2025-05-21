import java.util.Arrays;

public class HelloWorld {
    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        System.out.println(greeter.getGreeting() + ' ' + Arrays.toString(args));
    }
}

class Greeter {
    String getGreeting() {
        return "Hello World!";
    }
}
