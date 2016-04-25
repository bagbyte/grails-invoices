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
}
