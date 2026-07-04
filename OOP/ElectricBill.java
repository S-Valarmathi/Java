package OOP;

public class ElectricBill {
    String CustomerName;
    int unitsConsumed;
    double amount;

    ElectricBill(String CustomerName, int unitsConsumed){
        this.CustomerName = CustomerName;
        this.unitsConsumed = unitsConsumed;
    }
    void CalculateBill(){
        amount = unitsConsumed * 8;
    }

    void display(){
        System.out.println("Customer Name: " + CustomerName);
        System.out.println("Units Consumed: " + unitsConsumed);
        System.out.println("Bill Amount: " + amount);
        System.out.println();
    }

    public static void main(String[] args){
        ElectricBill e1 = new ElectricBill("Priya",  12000);
        ElectricBill e2 = new ElectricBill("Dharshini", 15000);

        e1.CalculateBill();
        e2.CalculateBill();

        e1.display();
        e2.display();



    }
    
}
