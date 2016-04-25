package com.bagbyte.domain

import grails.rest.Resource

/**
 * Created by sabino on 24/04/16.
 */
@Resource(uri='/companies', formats=['json', 'xml'])
class Company {
    String name
    String vatCode
    String description
    String note

    static hasOne = [address: Address]

    static hasMany = [invoicesIssued: Invoice,
                      invoicesReceived: Invoice,
                      products: CompanyProduct]

    static mappedBy = [invoicesIssued: "issuer",
                       invoicesReceived: "client"]

    static constraints = {
        name nullable: false
        vatCode nullable: true
        description nullable: true
        note nullable: true
        address unique: true, nullable: true
    }
}
