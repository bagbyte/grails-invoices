package com.bagbyte.domain

import com.bagbyte.rest.PaginationRestfulController
import grails.rest.Resource

/**
 * Created by sabino on 20/05/16.
 */
@Resource(uri='/api/users', formats=['json', 'xml'], superClass = PaginationRestfulController)
class User {
    String firstName
    String lastName
    String email
    String image
    String username
    String password
}
