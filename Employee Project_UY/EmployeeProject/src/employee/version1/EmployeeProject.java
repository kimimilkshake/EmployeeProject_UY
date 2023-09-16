package employee.version1;
import java.util.Date;

public class EmployeeProject {

    public static void main(String[] args) {
        
        HourlyEmployee h1 = new HourlyEmployee(27, "Kirzteen", null, null, (float) 40.5, 250);

        System.out.println("Hourly Employee Data:");
        h1.displayInfo();
        System.out.println("================================");

        PieceWorkerEmployee PWE1 = new PieceWorkerEmployee(28, "Kirzleen", null, null, 27, 25);

        System.out.println("Piece Worker Employee Data:");
        PWE1.displayInfo();
        System.out.println("================================");


        CommissionEmployee CE1 = new CommissionEmployee(29, "Kirzly", null, null, 40000);

        System.out.println("Commission Employee Data:");
        CE1.displayInfo();
        System.out.println("================================");

        BasePlusCommissionEmployee BPS1 = new BasePlusCommissionEmployee(30, "Kirzion", null, null, 400000, 150);

        System.out.println("Base and Commission Employee Data:");
        BPS1.displayInfo();
        System.out.println("================================");
    }
    
}
