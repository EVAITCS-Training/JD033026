

import entities.*;
import utils.Calculator;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {

    private final static List<String> strings = new ArrayList<>();

    public static void main(String[] args) {
//        List<BankAccount> listOfAccounts = List.of(
//             new SavingsAccount("a6f3h1-6e9k7e", new BigDecimal("450.00"), new BigDecimal("4.55")),// <- index 0
//             new SavingsAccount("0259j243r9j29m320", new BigDecimal("1000.00"), new BigDecimal("6.00")),// <- index 1
//             new CheckingsAccount("vuv023h4f378hf93h093", new BigDecimal("1600.00"), new BigDecimal("15.00"))
//        );
//
//        //System.out.println(listOfAccounts.get(0).equals(listOfAccounts.get(0)));
//        Transferable[] transferables = new Transferable[10];
//        int count = 0;
//        for (BankAccount account : listOfAccounts) {
//            account.applyMonthlyFee();
//            if(account instanceof Transferable transferable) {
//                transferables[count++] = transferable;
//            }
//        }
//
//        listOfAccounts.forEach(System.out::println);
//        for (Transferable transferable : transferables) {
//            System.out.println(transferable);
//        }

        System.out.println(Calculator.add(1, 2));
//        System.out.println(Calculator.add(40.0, 25.00));
//        Example example = new Example();
        //strings = new ArrayList<>();// <-- will throw a Compile Time Exception
        strings.add("Hello");
        strings.add("Good");
        strings.remove(0);
    }
}
