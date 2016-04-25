package com.bagbyte.domain

import grails.rest.Resource

/**
 * Created by sabino on 24/04/16.
 */
@Resource(uri='/company/products', formats=['json', 'xml'])
class CompanyProduct {
    Company company
    Product product

    Date date
    Double price
}
