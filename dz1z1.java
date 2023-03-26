import java.util.Random;

/**
 * program
 */
//1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
public class program {
    public static void main(String[] args) {
        Random random = new Random();

        int i = random.nextInt(201);
        System.err.println(i);

    }
  }