public class setbit {
    public static void main(String[] args) {
        int n=5;
        int pos=1;
        int bitMask=1<<pos;
        int setbit=(bitMask | n);
        System.out.println(setbit);
    }
}
