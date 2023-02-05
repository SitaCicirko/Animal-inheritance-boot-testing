class Dog extends Animal {
    private int age;
    public Dog(int age, String name, String breed) {
        super(name, breed);
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void bark() {
    }
    public void walk() {
    }
}
