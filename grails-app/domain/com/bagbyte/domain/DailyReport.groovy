package com.bagbyte.domain

import com.bagbyte.rest.PaginationRestfulController
import grails.rest.Resource

/**
 * Created by spapagna on 28/04/2016.
 */
@Resource(uri='/api/dailyReports', formats=['json', 'xml'], superClass = PaginationRestfulController)
class DailyReport {
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
        extra = total - cash

        if (expenses != null)
            expenses.each{ extra -= it.amount }
    }
}
