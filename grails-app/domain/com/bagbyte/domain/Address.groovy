package com.bagbyte.domain

import grails.rest.Resource

/**
 * Created by sabino on 24/04/16.
 */
@Resource(uri='/addresses', formats=['json', 'xml'])
class Address {
    String header
    String street
    String houseNumber
    String postalCode
    String city
    String country
    String note

    Double latitude
    Double longitude

    Company company

    static constraints = {
        header nullable: true
        street nullable: true
        houseNumber nullable: true
        postalCode nullable: true
        city nullable: false
        country nullable: false
        note nullable: true
        latitude nullable: true
        longitude nullable: true
        company nullable: false
    }
}
