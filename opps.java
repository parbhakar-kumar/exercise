package exercise;
class employ{
    int empId= 2;
    int basicSal=20000;
    int incetive =200;
    void countSaleries(){
        System.out.println(basicSal+incetive);
    }
}
public class opps {
    public static void main(String[]args){
        employ engineer = new employ();
        System.out.println(employ.empId);

    }
}
