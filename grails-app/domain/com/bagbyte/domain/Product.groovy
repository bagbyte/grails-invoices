package com.bagbyte.domain

import grails.rest.Resource

/**
 * Created by sabino on 24/04/16.
 */
@Resource(uri='/products', formats=['json', 'xml'])
class Product {
    String name
    String description
    String note

    static belongsTo = [companyProduct: CompanyProduct]
}
