package task10.Question_6;

import task10.Question_5.Tea;

public class BlackTea extends Tea {

    //Function to Prepare the Tea
    @Override
    public void prepareTea(String type, int time) {
        System.out.println("Your BlackTea is Ready");
    }
}
