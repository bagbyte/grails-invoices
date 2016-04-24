package com.bagbyte.controllers

import com.bagbyte.domain.SupplierProduct
import org.grails.plugins.restawesome.AwesomeRestfulController

/**
 * Created by sabino on 24/04/16.
 */
class SupplierProductController extends AwesomeRestfulController {
    static responseFormats = ['json']

    SupplierProductController(){
        super(SupplierProduct)
    }
}
