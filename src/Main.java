

public class Main {

    public static void main(String[] args) {

        //for (int i = 1; i <= 30; i++) {
        //  if (i % 3 == 0) {
        //    System.out.println("ping");
        //   if (i % 5 == 0) {
        //          System.out.println("pong");
        //     }
        //     if (i % 3 == 0 && i % 5 == 0) {
        //          System.out.println("ping pong");}

        int f1 = 0;
        int f2 = 1;
        int f3;
        System.out.println(f1 + " " + f2 + " ");
        for (int a = 3; a <= 10; a++) {
            f3 = f1 + f2;
            System.out.print(f3 + " ");
            f1 = f2;
            f2 = f3;
        }
    }
}


