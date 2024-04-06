abstract class Computer {
    abstract void type();
}
class Dell extends Computer {
    @Override
    void type() {
        System.out.println("Typing Fastly!");
    }
    public static void main(String[] args) {
        Computer c = new Dell(); //Up-casting
        c.type();
    }
}
