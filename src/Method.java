public class Method {
    public static void main(String[] args) {
        // method
        // sayHelloWorld();
        sayHello("Muhamad","Amir");
        sayHello("Rena","Safitri");
    }

    // static void sayHelloWorld() {
    //     System.out.println("Hello World 1");
    //     System.out.println("Hello World 2");
    //     System.out.println("Hello World 3");
    // }

    // method with parameter
    static void sayHello(String firstName, String lastName){
        System.out.println("Hello " + firstName + " " + lastName);
    }
}
