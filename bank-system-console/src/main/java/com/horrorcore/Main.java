package com.horrorcore;


import com.horrorcore.dtos.TransferRequest;
import com.horrorcore.entities.BankAccount;
import com.horrorcore.enums.Priority;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
//        BankAccount account = BankAccount
//                .newChecking("JSKADNASSAJFN(*#@(*H9832", new BigDecimal("5000"));
//
//        TransferRequest request = new TransferRequest
//                .Builder("JSKADNASSAJFN(*#@(*H9832",
//                "NUdsih79rh92fh92h",
//                new BigDecimal("250")).priority(Priority.HIGH).build();
//        TransferRequest request1 = new TransferRequest.Builder("JSKADNASSAJFN(*#@(*H9832",
//                "NUdsih79rh92fh92h",
//                new BigDecimal("250"))
//                .note("Payback")
//                .priority(Priority.LOW)
//                .build();
//
//        if(request.getAmount().compareTo(BigDecimal.ZERO) > 0 && request.getAmount().compareTo(request1.getAmount()) <= 0) {
//
//        }
        try {
            readFile();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

        System.out.println(divide(4, 12));
    }

    public static void readFile() throws IOException {
        FileReader fr = new FileReader("bad-text.txt");
    }

    public static int divide(int a, int b) {
        if(a == 0 || b == 0) throw new ArithmeticException("Cannot divide by zero");
        return a/b;
    }
}
