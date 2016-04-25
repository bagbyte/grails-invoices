package com.bagbyte.domain

import grails.rest.Resource

/**
 * Created by sabino on 24/04/16.
 */
@Resource(uri='/invoices/items', formats=['json', 'xml'])
class InvoiceItem {
    Invoice invoice
    CompanyProduct product

    Integer quantity
    Double discount

    /**
     * Store the price in order to do not change it when the
     * price of the product change
     */
    Double price

    /**
     * If the user overrides the price on front end or
     * the price is different than the one of the product
     * in database
     */
    Boolean customPrice
}
