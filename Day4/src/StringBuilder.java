

public class StringBuilder {
   
    public static void main(String[] args) {
      
        
        StringBuffer sbr = new StringBuffer("Hello");
        StringBuilder sbl = new StringBuilder();

        
        String s1 = sbr.toString();

        
        System.out.println(
            "StringBuffer object to String: ");
        System.out.println(s1);

        
        String s2 = sbl.toString();

        
        System.out.println(
            "StringBuilder object to String: ");
        System.out.println(s2);

        
        sbr.append("Saurabh");

       
        System.out.println(sbr);
        System.out.println(s1);
    }
}