package JavaTestProgrammes;

public class ChildTeenAdult {

        public static void main(String[] args) {

            int personA = 17;

            if (personA <= 12) {
                System.out.println("Child");
            } else if (personA >=13 && personA <= 17) {
                System.out.println("Teenager");
            } else {
                System.out.println("Adult");
            }

        }
}
