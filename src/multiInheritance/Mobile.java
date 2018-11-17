package multiInheritance;

public class Mobile extends Computer {
    private boolean pc = true;

    void process() {
        super.process();
        System.out.println("Mobile OS Installing");
        if (pc) {
            this.makePhone().process();
            pc = false;
        }
    }

     Phone makePhone() {
        if (!pc) {

        }
        return new Phone() {
            void process() {
                super.process();
                System.out.println("Mobile Network Installing");
                Mobile.this.process();
            }
        };
    }
}
