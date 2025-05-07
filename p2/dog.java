package p2;

class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getHumanAge() {
        return age * 7;
    }

    @Override
    public String toString() {
        return name + " (" + age + " лет, " + getHumanAge() + " по-человечески)";
    }
}

class TestDog {
    public static void main(String[] args) {
        Dog d1 = new Dog("Шарик", 4);
        Dog d2 = new Dog("Рэкс", 6);

        System.out.println(d1);
        System.out.println(d2);
    }
}

