package exercise;

public class Emploee {
    private int empId= 2; // Added getter for empId
   private String Name;
   private int basicSal=20000;
   private int incetive =200;
   private int ph = 0;

    public Emploee(String empName, int phoneNo) {
        ph= phoneNo;
        Name=empName;
    }
   
   private void countSaleries(){
        System.out.println(basicSal+incetive);
        // Getter for empId
}
    // getter & setter
    int get(){
        return ph;
    }
    String getName(){
        return Name;
    }
}
