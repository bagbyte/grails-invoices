import com.bagbyte.domain.Address
import com.bagbyte.domain.Invoice
import com.bagbyte.domain.InvoiceDetails
import com.bagbyte.domain.Product
import com.bagbyte.domain.Supplier
import com.bagbyte.domain.SupplierProduct
import org.grails.plugins.restawesome.renderer.ApiCollectionRendererJson
import org.grails.plugins.restawesome.renderer.ApiRendererJson

// Place your Spring DSL code here
beans = {
    // Address
    addressRenderer(ApiRendererJson, Address) {
        label = "address"
    }
    addressCollectionRenderer(ApiCollectionRendererJson, Address) {
        label = "addresses"
    }

    // Invoice
    invoiceRenderer(ApiRendererJson, Invoice) {
        label = "invoice"
    }
    invoiceCollectionRenderer(ApiCollectionRendererJson, Invoice) {
        label = "invoices"
    }

    // InvoiceDetails
    invoiceDetailsRenderer(ApiRendererJson, InvoiceDetails) {
        label = "invoiceDetails"
    }
    invoiceDetailsCollectionRenderer(ApiCollectionRendererJson, InvoiceDetails) {
        label = "invoicesDetails"
    }

    // Product
    productRenderer(ApiRendererJson, Product) {
        label = "product"
    }
    productCollectionRenderer(ApiCollectionRendererJson, Product) {
        label = "products"
    }

    // Supplier
    supplierRenderer(ApiRendererJson, Supplier) {
        label = "supplier"
    }
    supplierCollectionRenderer(ApiCollectionRendererJson, Supplier) {
        label = "suppliers"
    }

    // SupplierProduct
    supplierProductRenderer(ApiRendererJson, SupplierProduct) {
        label = "supplierProduct"
    }
    supplierProductCollectionRenderer(ApiCollectionRendererJson, SupplierProduct) {
        label = "supplierProducts"
    }
}
