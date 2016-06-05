package com.bagbyte.rest

import grails.rest.*
import grails.util.GrailsNameUtils

/**
 * Created by sabino on 05/06/16.
 */
class PaginationRestfulController<T> extends RestfulController<T> {

    PaginationRestfulController(Class<T> resource) {
        this(resource, false)
    }

    PaginationRestfulController(Class<T> resource, boolean readOnly) {
        super(resource, readOnly)
    }

    @Override
    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        def output = [total: countResources(), results: listAllResources(params)]
        respond output
    }
}
