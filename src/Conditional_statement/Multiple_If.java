package Conditional_statement;

public class Multiple_If {
    public static void main(String[] args) {
        int age = 19;
        String city = "mathura";
       if(age>20){
           System.out.println("person is eiligible for voting....");
       }
       if(city=="mathura"){
          System.out.println("person is eligible for mathura voting...");
        }
        if(age>20 && city=="mathura"){
            System.out.println("the young boy is eligibe for voying...");
        }
    }
}
