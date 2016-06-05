package com.bagbyte.domain

import com.bagbyte.rest.PaginationRestfulController
import grails.rest.Resource

/**
 * Created by sabino on 24/04/16.
 */
@Resource(uri='/api/products', formats=['json', 'xml'], superClass = PaginationRestfulController)
class Product {
    String name
    String description
    String note

    static belongsTo = [companyProduct: CompanyProduct]
}
