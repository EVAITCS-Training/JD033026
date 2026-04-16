package com.horrorcore;


import com.horrorcore.dtos.TransferRequest;
import com.horrorcore.entities.BankAccount;
import com.horrorcore.enums.Priority;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        BankAccount account = BankAccount
                .newChecking("JSKADNASSAJFN(*#@(*H9832", new BigDecimal("5000"));

        TransferRequest request = new TransferRequest
                .Builder("JSKADNASSAJFN(*#@(*H9832",
                "NUdsih79rh92fh92h",
                new BigDecimal("250")).priority(Priority.HIGH).build();
        TransferRequest request1 = new TransferRequest.Builder("JSKADNASSAJFN(*#@(*H9832",
                "NUdsih79rh92fh92h",
                new BigDecimal("250"))
                .note("Payback")
                .priority(Priority.LOW)
                .build();

        if(request.getAmount().compareTo(BigDecimal.ZERO) > 0 && request.getAmount().compareTo(request1.getAmount()) <= 0) {

        }
    }
}
