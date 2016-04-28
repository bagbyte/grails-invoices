package com.bagbyte.domain

import grails.rest.Resource

/**
 * Created by spapagna on 28/04/2016.
 */
@Resource(uri='/expenses', formats=['json', 'xml'])
class Expense {
    DailyIncome dailyIncome

    Double amount

    String note
    String description

    static constraints = {
        dailyIncome nullable: false
        amount nullable: false
        note nullable: true
        description nullable: true
    }
}
