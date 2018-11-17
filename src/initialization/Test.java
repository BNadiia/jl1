package initialization;

public class Test {
    int var1;               //field; instance variable; int var1 = 0;
    static  int var2;       //field; class variable
    int x = 10;
    int y;

    public Test(int b) {
        y = b;
    }

    void m(){
        int var3 = 0;          // not field; local variable
        System.out.println(var1 + var2);
        System.out.println(var3);

        final int a;
    }
}
