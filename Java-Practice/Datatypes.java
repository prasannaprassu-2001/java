public class Datatypes {
    public static void main(String[] args){
        byte a = 120;
        System.out.println(a);  //size -128 to 127

        int b = 100000;
        System.out.println(b);  //size -32768 to 32767

        short c = 10000;
        System.out.println(c);  //size -2147483648 to 2147483648

        long d = 2000000;
        System.out.println(d);  // 8byte
         
        float e =2.43456f;
        System.out.println(e);  //4 bytes

        double f = 2.34567889123;
        System.out.println(f);  //8 bytes

        char g = 'H';
        System.out.println(g);  //2 bytes

        boolean is_Avail = true;
        System.out.println(is_Avail); 


        //Derived datatypes

        int size[] = {10,20,30,40,50};
        String names[] = {"Vidya","Chana","Ashok","Teju"};
        System.out.println(size[0]);
        System.out.println(names[1]);
    }
    
}
