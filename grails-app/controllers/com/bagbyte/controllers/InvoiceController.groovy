package com.bagbyte.controllers

import com.bagbyte.domain.Invoice
import org.grails.plugins.restawesome.AwesomeRestfulController

/**
 * Created by sabino on 24/04/16.
 */
class InvoiceController extends AwesomeRestfulController {
    static responseFormats = ['json']

    InvoiceController(){
        super(Invoice)
    }
}