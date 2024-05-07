package task10.Question_7;

import task10.Question_5.Tea;
import task10.Question_6.BlackTea;
import task10.Question_6.GreenTea;
import task10.Question_6.HerbalTea;

public class Instance {

    public static void main(String[] args) {

        //Instances of Tea Class and its Sub-Classes
        Tea t = new Tea();
        GreenTea gtea = new GreenTea();
        BlackTea btea = new BlackTea();
        HerbalTea htea = new HerbalTea();

        //Array of Instances
        String tea[] = new String[5];
        tea[0] = "t";
        tea[1] = "gtea";
        tea[2] = "btea";
        tea[3] = "htea";

    }
}
