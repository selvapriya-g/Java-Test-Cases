class TestOverload {

    void add(int a) {
        a++;
        System.out.println(a);
    }

    void add(int a, int b) {
        System.out.println(a + b);
    }

    public static void main(String[] args) {
        TestOverload t = new TestOverload();

        t.add(100);
        t.add(1, 2);
    }
}