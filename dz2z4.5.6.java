// 4. Дано два числа, например 3 и 56, 
// необходимо составить следующие строки: 3 + 56 = 59 3 – 56 = -53 3 * 56 = 168 Используем метод StringBuilder.append().        
import java.util.Scanner;

public class ProgramNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
int a = 56;
        int b = 3;
        StringBuilder builder = new StringBuilder();
        builder.append(String.format("%d + %d = %d\n", a, b, a + b));
        builder.append(String.format("%d - %d = %d\n", a, b, a - b));
        builder.append(String.format("%d * %d = %d\n", a, b, a * b));
        builder.append(String.format("%d / %d = %d\n", a, b, a / b));
        // System.out.println(builder.toString());
        System.out.println(builder.toString().replaceAll("=", "равно"));

// 5. Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(),StringBuilder.deleteCharAt().

result.deleteCharAt(7);
result.insert(7, " равно");
System.out.println(result);  

// 6. *Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().

result1.replace(6, 8, " равно ");
System.out.println(result1);

    }
}