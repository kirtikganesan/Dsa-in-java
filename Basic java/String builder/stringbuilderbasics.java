public class stringbuilderbasics{
    public static void main(String args[]){
        StringBuilder sb=new StringBuilder("Kirtik");
        System.out.println(sb);
        System.out.println(sb.charAt(0));
        sb.setCharAt(0, 'P');
        System.out.println(sb);
        sb.insert(0, 'A');
        System.out.println(sb);
        sb.insert(3, 'r');
        System.out.println(sb);
        sb.delete(3, 4);
        System.out.println(sb);

    }
}