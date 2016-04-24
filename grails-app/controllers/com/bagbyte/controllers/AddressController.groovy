package com.bagbyte.controllers

import com.bagbyte.domain.Address
import org.grails.plugins.restawesome.AwesomeRestfulController

/**
 * Created by sabino on 24/04/16.
 */
class AddressController extends AwesomeRestfulController {
    static responseFormats = ['json']

    AddressController(){
        super(Address)
    }
}
