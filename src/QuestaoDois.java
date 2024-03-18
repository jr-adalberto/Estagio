import java.util.ArrayList;

public class QuestaoDois {

    public static ArrayList<Integer> generateFibonacciSequence(int limit) {
        ArrayList<Integer> sequence = new ArrayList<>();
        sequence.add(0);
        sequence.add(1);

        int i = 2;
        while (true) {
            int nextNumber = sequence.get(i - 1) + sequence.get(i - 2);
            if (nextNumber <= limit) {
                sequence.add(nextNumber);
                i++;
            } else {
                break;
            }
        }

        return sequence;
    }

    public static boolean checkFibonacci(int number) {
        ArrayList<Integer> sequence = generateFibonacciSequence(number);
        return sequence.contains(number);
    }

    public static void main(String[] args) {
        int numeroVerificado = 21;

        if (checkFibonacci(numeroVerificado)) {
            System.out.println("O número " + numeroVerificado + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numeroVerificado + " não pertence à sequência de Fibonacci.");
        }
    }
}