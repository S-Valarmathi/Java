public  class Payment {
    void pay(){
        System.out.println("Payment Successful");
    }

    static class UPIPayment extends Payment{
        @Override
        void pay(){
            super.pay();
            System.out.println("Payment Successful using UPI");
            
        }

        public static void main (String[] args){
            UPIPayment p1 = new UPIPayment();

            p1.pay();
        }
    }
    
}
