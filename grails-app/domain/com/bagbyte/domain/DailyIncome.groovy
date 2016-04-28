package com.bagbyte.domain

import grails.rest.Resource

/**
 * Created by spapagna on 28/04/2016.
 */
@Resource(uri='/dailyIncomes', formats=['json', 'xml'])
class DailyIncome {
    Date date

    Double total
    Double cash
    Double extra

    String note

    static hasMany = [expenses: Expense]

    static constraints = {
        date nullable: false
        total nullable: false
        cash nullable: false
        extra nullable: true
        note nullable: true
        expenses nullable: true
    }

    def beforeInsert() {
        cash = total

        if (expenses != null)
            expenses.each{ cash -= it.amount }

        if (extra != null)
            cash += extra
    }
}
