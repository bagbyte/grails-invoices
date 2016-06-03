package com.bagbyte.domain

import grails.rest.Resource

/**
 * Created by spapagna on 28/04/2016.
 */
@Resource(uri='/api/expenses', formats=['json', 'xml'])
class Expense {
    DailyReport dailyIncome

    Boolean hasInvoice
    Double amount

    String note
    String description

    static hasOne = [invoice: Invoice]

    static constraints = {
        dailyIncome nullable: false
        amount nullable: false
        note nullable: true
        description nullable: true
        invoice nullable: true
    }
}
