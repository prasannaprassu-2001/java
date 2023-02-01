public class Operators {
     /* public static void main(String[] args){
        byte a = 10;
        byte b = 20;
        int c = a + b;         //max(int, tpe a, type b)
        System.out.println(c);
        System.out.println(a/0); //runtime error
     } */
     
        //pre incr
        public static void main( String[] args){
        int a = 10;
        int b = ++a;   //pre incr - incr and assign 
        int c = a++;   //post incr - assign and incr
        System.out.println(b+" "+a+" "+c);
        }
}
