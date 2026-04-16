package com.horrorcore.services;

import com.horrorcore.utils.AuditLogger;
import com.horrorcore.utils.TransactionValidator;

public class PaymentService {
    private final TransactionValidator transactionValidator;
    private final AuditLogger logger;

    public PaymentService(TransactionValidator transactionValidator, AuditLogger logger) {
        this.transactionValidator = transactionValidator;
        this.logger = logger;
    }
}
