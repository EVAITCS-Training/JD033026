import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        byte num = 127;
        System.out.println(num);
        num++;
        System.out.println(num);
        num--;
        System.out.println(num);
        char letter = 'A';
        System.out.println(letter);
        System.out.println((int) letter);
        letter = (char) ((char) letter + 37);
        System.out.println(letter);
        String string1 = "Hello";
        String string2 = "Hello";
        System.out.println(string1.hashCode());
        System.out.println(string1.hashCode() == string2.hashCode());
        String string3 = new String("Hello");
        System.out.println(string1.hashCode() == string3.hashCode());
        System.out.println(string1 == string3);
        BigDecimal amount = new BigDecimal("100000000000000.99");
        double doubleAmount = 100000000000000.99;
        System.out.println(amount);
        System.out.println(doubleAmount);
    }
}
