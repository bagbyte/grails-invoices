package com.bagbyte.controllers

import com.bagbyte.domain.Supplier
import org.grails.plugins.restawesome.AwesomeRestfulController

/**
 * Created by sabino on 24/04/16.
 */
class SupplierController extends AwesomeRestfulController {
    static responseFormats = ['json']

    SupplierController(){
        super(Supplier)
    }
}
