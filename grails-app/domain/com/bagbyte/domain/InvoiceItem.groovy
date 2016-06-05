package com.bagbyte.domain

import com.bagbyte.rest.PaginationRestfulController
import grails.rest.Resource

/**
 * Created by sabino on 24/04/16.
 */
@Resource(uri='/api/invoices/items', formats=['json', 'xml'], superClass = PaginationRestfulController)
class InvoiceItem {
    Invoice invoice
    CompanyProduct product

    Integer quantity

    DiscountType discountType = DiscountType.VALUE

    Double discount

    /**
     * Store the price in order to do not change it when the
     * price of the product change
     */
    Double price

    /**
     * If the user overrides the price on front end or
     * the price is different than the one of the product
     * in database
     */
    Boolean customPrice = false

    static constraints = {
        invoice nullable: false
        product nullable: false
        quantity nullable: false
        price nullable: true
        customPrice nullable: false
        discountType nullable: false
        discount nullable: true, validator: { value, obj ->
            return discountValidator(value, obj.discountType, obj.getPrice())
        }
    }

    def beforeInsert() {
        def pr = getPrice()
        price = applyDiscount(pr, discount, discountType)
    }

    private Double getPrice() {
        if (price != null)
            return price

        if (product != null)
            return product.price

        return null
    }

    private static Double applyDiscount(Double price, Double discount, DiscountType discountType) {
        if (price == null)
            return price

        if ((discount == null) || (discount == 0.toDouble()))
            return price

        if (!discountValidator(discount, discountType, price))
            return price

        if (discountType == DiscountType.PERCENTAGE)
            return (discount > 1) ? price*(1-discount/100) : price*(1-discount)
        else if (discountType == DiscountType.VALUE)
            return price - discount
        else
            return price
    }

    private static Boolean discountValidator(Double discount, DiscountType discountType, Double price) {
        if ((discount == null) || (discount == 0.toDouble()))
            return true
        if (discountType == DiscountType.PERCENTAGE)
            return ((discount >= 0) && (discount <= 1))
        if (discountType == DiscountType.VALUE)
            return ((discount != null) && (discount <= 0) && (discount <= price))
        return true
    }

    public static enum DiscountType {
        PERCENTAGE('percentage'),
        VALUE('value')

        String value

        DiscountType(String value) {
            this.value = value
        }
    }
}
