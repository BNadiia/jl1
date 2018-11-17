package foreach;

public class Dispatcher {
    public static void main(String[] args) {
/*        int[] x = {3, 6, 2, 8, 5};    // 4 7 3 9 6
        int[] y = {13, 16, 12, 18, 15};
//        for (int i = 0; i < x.length; i++) {
//            //System.out.print(x[i] + " ");
//           // x[i]++;
//        }
//        System.out.println();
        for (int temp : x) {
            temp++;
            System.out.print(temp + " ");
        }
        System.out.println();

        for (int temp : x) {
            System.out.print(temp + " ");
        }
*/

        Car[] c = {new Car(3000), new Car(2000), new Car(4000)};
        for (Car temp: c) {
//            temp.price += 200;
            temp = new Car(10000);
        }

        for (Car temp: c) {
            System.out.print(temp.price + " ");
        }




    }
}

//За допомогою форіч ми не можемо міняти об'єкт, але можна міняти поля та властивості об'єкта
