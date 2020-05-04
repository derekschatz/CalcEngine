public class Main {
    public static void main(String[] args) {
        double val1 = 5;
        double val2 = 10;
        double result;
        char opCode = 's';

        if (opCode == 'a'){
            result = val1 + val2;
            System.out.println(result);
        }
        else if (opCode == 's') {
            result = val2 - val1;
            System.out.println(result);

        }
        else if (opCode == 'm') {
            result = val1 * val2;
            System.out.println(result);
        }

        else if (opCode == 'd') {
            result = val1 > 0 ? val2 / val1 : 0.0;
            System.out.println(result);
        }

        else {
            result = 0.0;
            System.out.println("Invalid Code");
        }

        System.out.println("End of Program.");
    }
}
