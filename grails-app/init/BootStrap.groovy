import com.bagbyte.domain.DailyReport
import com.bagbyte.domain.Expense
import com.bagbyte.domain.Invoice
import grails.converters.JSON

class BootStrap {

    def init = { servletContext ->
        /*
        JSON.registerObjectMarshaller(Date) {
            return it?.format("dd/MM/yyyy")
        }
/*
        JSON.registerObjectMarshaller(DailyReport) { DailyReport report ->
            def output = [
                    id: report?.id,
                    total: report?.total,
                    cash: report?.cash,
                    extra: report?.extra,
                    note: report?.note,
                    date: report?.date
            ]

            def expenses = []

            report.expenses.each { Expense exp ->
                def map = [
                        id: exp?.id,
                        amount: exp?.amount,
                        hasInvoice: exp?.hasInvoice,
                        note: exp?.note,
                        description: exp?.description,
                ]

                if (exp.invoice)
                    map['invoice'] = [ id: exp.invoice.id ]

                expenses << map
            }

            output['expenses'] = expenses

            return output
        }
        */
    }

    def destroy = {
    }
}
