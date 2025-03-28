package exercise;
class Features{
    static void add(int a, int b){
        System.out.println(a+b);
    }
    static void add(double a,double b){
        System.out.println(a+b);
    }
}

public class Calculater {
    public static void main(String[] args) {
        Features.add(5, 7);
        Features.add(5.5, 7.7);
    }
}
