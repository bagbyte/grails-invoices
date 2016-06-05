package com.bagbyte.domain

import com.bagbyte.rest.PaginationRestfulController
import grails.rest.Resource

/**
 * Created by sabino on 24/04/16.
 */
@Resource(uri='/api/invoices', formats=['json', 'xml'], superClass = PaginationRestfulController)
class Invoice {
    Company issuer
    Company client
    Expense expense

    Date date
    Double amount

    String code
    String description
    String note

    static hasMany = [details: InvoiceItem]

    static constraints = {
        issuer nullable: false
        client nullable: false
        date nullable: false
        expense nullable: true
    }
}
