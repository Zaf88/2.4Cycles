public class Main {

    public static void main(String[] args) {

        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0) {
                System.out.println("ping");
                if (i % 5 == 0) {
                    System.out.println("pong");
                } else if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("ping pong");
                }
            }

        }
    }
}

