public class Arrays {
    public static void main(String args[]){
        int []a;                    //declaration
        a = new int[5];             //Creation
        System.out.println(a[0]);   //Initialization

        int[] b = {10,20,30,40,50};  //single line declaration,creation,initialization
        System.out.println(b[3]);


        int[] size={100,200,300};
        String[] names={"cat","dog","rat"};
        char[] ch={'c','d','r'};
        System.out.println(size[1]);
        System.out.println(names[0]);
        System.out.println(ch[1]);
    }
}
