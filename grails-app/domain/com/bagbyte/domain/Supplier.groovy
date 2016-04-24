package com.bagbyte.domain

/**
 * Created by sabino on 24/04/16.
 */
class Supplier {
    String name
    String description
    String note

    Address address

    static hasMany = [products: SupplierProduct]
}
