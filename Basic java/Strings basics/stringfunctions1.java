public class stringfunctions1 {
    public static void main(String[] args) {
        // concatenation
        // String firstname="Kirtik";
        // String lastname="Ganesan";
        // String fullname=firstname + " " + lastname;
        // System.out.println(fullname);
        // System.out.println(fullname.length());
        // for(int i=0;i<fullname.length();i++){
        //     System.out.print(fullname.charAt(i));
        // }
        String name1="Kirtik";
        String name2="Kirtik";
        if(name1.compareTo(name2)==0){
            System.out.println("Strings are equal");
        }
        else if(name1.compareTo(name2)>0){
            System.out.println("Positive value");
        }
        else if(name1.compareTo(name2)<0){
            System.out.println("Negative value");
        }
    }
}
