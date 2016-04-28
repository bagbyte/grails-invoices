package com.bagbyte.domain

import grails.rest.Resource

/**
 * Created by spapagna on 28/04/2016.
 */
@Resource(uri='/expenses', formats=['json', 'xml'])
class Expense {
    Company vendor
    Company client

    Date date
    Double amount
    Currency currency

    String note
    String description
}
