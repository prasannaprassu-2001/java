
public class Divisible {
   static String check(int x){
        if(x > 0){
            return "true";
          } else if(x < 0) {
             return "false";
          }else{
            return "zero";
          }

    }

    public static void main(String args[]){
    int first = -127;
System.out.println(first +"is"+ check(first));
    
    }
}
