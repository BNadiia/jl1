package multiInheritance;


public class Dispatcher {
    public static void main(String[] args) {
       Computer[] c = {/*new Computer(), new Computer(),*/ new Mobile()};
       Phone[] p = {/*/new Phone(), new Phone(),*/ new Mobile().makePhone()};


       for(Computer temp : c){
           temp.process();
           System.out.println("------------------------------------");
       }

       for(Phone temp : p){
           temp.process();
       }




    }
}


//1 змінна boolean, яка обирає що вмикати