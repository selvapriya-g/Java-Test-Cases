class Father {

    void job() {
        System.out.println("Retired Professor");
    }

    void hobby() {
        System.out.println("Newspaper and TV watching");
    }

    void property() {
        System.out.println("A house in native village");
    }
}

class Daughter extends Father {

    void job() {
        System.out.println("Student");
    }

    void hobby() {
        System.out.println("Playing games, social media");
    }

    void property() {
        System.out.println("No property");
    }

    public static void main(String[] args) {

        Father f1 = new Father();

        f1.job();
        f1.hobby();
        f1.property();

        Daughter d = new Daughter();

        d.job();
        d.hobby();
        d.property();
    }
}