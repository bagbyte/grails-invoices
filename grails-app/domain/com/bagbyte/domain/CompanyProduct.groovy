package com.bagbyte.domain

import grails.rest.Resource

/**
 * Created by sabino on 24/04/16.
 */
@Resource(uri='/api/company/products', formats=['json', 'xml'])
class CompanyProduct {
    Company company
    Product product

    Date date
    Double price

    static constraints = {
        product nullable: false
        company nullable: false
        date nullable: true
        price nullable: false
    }
}
