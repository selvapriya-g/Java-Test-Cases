/*a class has three types members
variables-static,instance,local methods-
static,instance, void,return types
nested class-static non static
*/

class Two {

    // To add two numbers - static method
    static void add(int a, int b) {
        System.out.println(a + b);
    }

    public static void main(String[] args) {
        add(40, 12);
        Two.add(1, 2);
    }
}

