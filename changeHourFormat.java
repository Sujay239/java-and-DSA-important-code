
import java.util.Scanner;

public class hourformat {
 
   public static String timeConversion( String s){
    if(s.contains("AM")){
        int idx = s.indexOf("AM");
        String t = s.substring(0, idx);

        if(t.contains("12")){
            int i = t.indexOf("2");
            String t3 = t.substring(i+1,t.length());
            return "00:"+t3;
        }else{
            return t;
        }
        
    }else{
        s = s.replace("PM", "");
        if(s.contains("12")){
            return s;
        }
        String t2 = s.substring(0,2);
        int t4 = Integer.parseInt(t2);
        t4 += 12;
       String t5 = Integer.toString(t4);
        s = s.replace(t2, t5);
        return s;
        
    }
   }

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        String s = x.nextLine();
        x.close();
        String real = timeConversion(s);
        System.out.println(real);
    }
}
