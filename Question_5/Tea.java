package task10.Question_5;

public class Tea {

    String T;
    String hot_water;
    String tea_leaves;
    String milk;
    String sugar;

    //Function to Prepare the Tea
    public void prepareTea(String type, int time){
        T = T + hot_water + tea_leaves;
        System.out.println("Your Tea is Ready : Take it Please");
    }

    //Function to Add Milk to the Tea
    public void addMilk(){
        T = T + milk;
        System.out.println("Milk has Added to Your Tea");
    }

    //Function to Add Sugar to the Tea
    public void addSugar(){
        T = T + sugar;
        System.out.println("Sugar has Added to Your Tea");
    }
}
