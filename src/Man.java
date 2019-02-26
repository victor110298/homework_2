package man;

// Task 2.4

public final class Man {
    private int age;

    public Man(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }


    public static void main(String[] args) {
        Man man = new Man(32);
        System.out.println(man.getAge());

    }
}