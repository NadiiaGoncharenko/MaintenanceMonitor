public class Main {
    static int x = 5;
    static int y = 6;

    public static void main(String[] args) {
        int i = add(x,y);
        System.out.println(i);
    }

    public static int add(int x, int y) {
        return x+y;
    }
}
