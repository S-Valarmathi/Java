package OOP;

public class AmazonOrder {
    private int orderId;
    private String customerName;
    private String productName;
    private int quantity;
    private double price;

    public void setOrderId(int orderId){
        this.orderId = orderId;
    }

    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }

    public void setProductName(String productName){
        this.productName = productName;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public int getOrderID(){
        return orderId;
    }

    public String getCustomerName(){
        return customerName;
    }

    public String getProductName(){
        return productName;
    } 
    
    public int getQuantity(){
        return quantity;
    }

    public double price(){
        return price;
    }

    public static void main(String[] args){
        AmazonOrder a1 = new AmazonOrder();
        AmazonOrder a2 = new AmazonOrder();
        a1.setOrderId(101);
        a1.setCustomerName("Valarmathi");
        a1.setQuantity(1);
        a1.setProductName("Laptop");
        a1.setPrice(55000);

        a2.setOrderId(102);
        a2.setCustomerName("Priya");
        a2.setQuantity(2);
        a2.setProductName("Headphones");
        a2.setPrice(3000);

        System.out.println("Order Id: " + a1.getOrderID());
        System.out.println("Customer Name: " + a1.getCustomerName());
        System.out.println("Quantity: " + a1.getQuantity());
        System.out.println("Product Name: " + a1.getProductName());
        System.out.println("Price: " + a1.price());
        System.out.println();

        System.out.println("Order Id: " + a2.getOrderID());
        System.out.println("Customer Name: " + a2.getCustomerName());
        System.out.println("Quantity: " + a2.getQuantity());
        System.out.println("Product Name: " + a2.getProductName());
        System.out.println("Price: " + a2.price());



    

    
    
    }
}
