package ControlFlow;
class Return {

    public static void main(String[] args){
        int result = add();
        System.out.println(result);
    }
    
    static int add(){
        return 10 + 5;
    }
}