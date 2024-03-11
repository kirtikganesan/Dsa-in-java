public class preandpostincrement{
    public static void main(String[] args) {
        // Post increment
        int a=10;
        int b=0;
        b=a++;
        System.out.println(a);
        System.out.println(b);
        // Pre increment
        int c=10;
        int d=0;
        d=++c;
        System.out.println(c);
        System.out.println(d);
    }
}