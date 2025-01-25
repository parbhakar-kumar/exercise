package exercise;

public class Typecasting {
    public static void main (String[]args){
        System.out.println("type Casting");
        //Automatic Casting -wide casting
        float fvar = 23.494f;
        double dvar = fvar;
        System.out.println(dvar);
        //manual casting- narrow casting
        long lavar = (long) fvar;
        System.out.println(lavar);
    }
}
