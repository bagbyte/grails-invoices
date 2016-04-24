package com.bagbyte.controllers

import com.bagbyte.domain.Product
import org.grails.plugins.restawesome.AwesomeRestfulController

/**
 * Created by sabino on 24/04/16.
 */
class ProductController extends AwesomeRestfulController {
    static responseFormats = ['json']

    ProductController(){
        super(Product)
    }
}
