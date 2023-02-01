public class Arrays {
    public static void main(String args[]){
        int []a;                    //declaration
        a = new int[5];             //Creation
        System.out.println(a[0]);   //Initialization

        int[] b = {10,20,30,40,50};  //single line declaration,creation,initialization
        System.out.println(b[3]);

        //datatypes
        int[] size={100,200,300};
        String[] names={"cat","dog","rat"};
        char[] ch={'c','d','r'};
        System.out.println(size[1]);
        System.out.println(names[0]);
        System.out.println(ch[1]);

        byte c = 100;
        short e= c;
        System.out.println(e);   //byte --> short --> int --> long --> float --> double
        

        //loop
        int[] age = {20,30,40,50,60};
        int total = 0;
        for(int value: age){
            total = total + value;
        }
        System.out.println(total);


        int[] car = {10,20,30,40,50};
        int newcar = 60;
        for (int i=0;i<=car.length-1;i++){
            newcar = newcar+ a[i];
        }
        System.out.println(newcar);

        //length and length()

        int[] siz = {100,200,300};
        String msg = "Hello";
        System.out.println(siz.length);
        System.out.println(msg.length());
    }  
}                                                 


