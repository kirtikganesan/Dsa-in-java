public class stringbuilderfunctions {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("h");
        System.out.println(sb);
        sb.append("e");
        sb.append("l");
        sb.append("l");
        sb.append("o");
        System.out.println(sb);
        System.out.println(sb.length());
        sb.reverse();
        System.out.println(sb);
    }
}
