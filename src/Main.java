public class Main {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(5);
        s.push(1);
        s.pop();
        s.push(10);

        System.out.println("Максимальное число: " + s.max());
        System.out.println("Минимальное число: " + s.min());

    }
}