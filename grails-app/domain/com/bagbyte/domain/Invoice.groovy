package com.bagbyte.domain

import grails.rest.Resource

/**
 * Created by sabino on 24/04/16.
 */
@Resource(uri='/invoices', formats=['json', 'xml'])
class Invoice {
    Company issuer
    Company client

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
    }
}
