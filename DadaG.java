package exercise;
//single lavle indarit


public class DadaG {
    String name="om pandey" ;
    String surname = "pandey";
}
class Father extends DadaG{
    String name ="vinod";
    int prp=50;

}
class Me extends Father{
    String name = "Shivam";
}
class Mother{
    String name="Mom";
    int prp =20;
}
class run{
    public static void main(String[]args){
        Me m = new Me();
        System.out.println(m.name);
        System.out.println(m.surname);
    }
}
