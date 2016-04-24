package com.bagbyte.controllers

import com.bagbyte.domain.InvoiceDetails
import org.grails.plugins.restawesome.AwesomeRestfulController

/**
 * Created by sabino on 24/04/16.
 */
class InvoiceDetailsController extends AwesomeRestfulController {
    static responseFormats = ['json']

    InvoiceDetailsController(){
        super(InvoiceDetails)
    }
}
