package lab.demand;

import java.util.List;

public class ManageDemand {

    private Tax tax;

    public ManageDemand(Tax tax) {
        this.tax = tax;
    }


    public double totalTaxes(List<Order> orders){
        if(orders.isEmpty()) return 0.0;
        // Calculate Taxes
        double taxes = 0.0;
        for (Order order : orders) {
            double actual_tax = this.tax.calculateTax(order.getCountry());
            taxes += actual_tax;
        }
        return taxes;
    }
    public double totalQuantity(List<Order> orders){
        if(orders.isEmpty() ) return 0.0;
        // Calculate Total
        double quantities = 0.0;
        for (Order order : orders) {
            double temp = order.getQuantity();
            quantities += temp;
        }
        return quantities;
    }

    public double calculateTotal(List<Order> orders){

        double taxes = totalTaxes(orders);
        double quantities = totalQuantity(orders);

        return quantities * taxes;
    }

    public void changeTaxesValue(double tColombia, double tPeru, double tBrazil){
        tax.setBr_tax(tBrazil);
        tax.setCl_tax(tColombia);
        tax.setP_tax(tPeru);
    }

    //A stands for additionals
    public double calculateTotalA(List<Order> orders, double aColombia, double aPeru, double aBrazil) {
        // Calculate additionals by country
        changeTaxesValue(aColombia, aPeru,aBrazil);
        double result = calculateTotal(orders);
        changeTaxesValue(0.0,0.18,0.12);


        return result;

    }



}
