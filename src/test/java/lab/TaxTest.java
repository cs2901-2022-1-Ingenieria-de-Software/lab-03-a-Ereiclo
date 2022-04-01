package lab;

import lab.demand.ManageDemand;
import lab.demand.Tax;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

@Test
public class TaxTest {
    private Tax tax;

    private ManageDemand demand;

    @BeforeClass
    public void setup() {
        tax = new Tax();
        demand =  new ManageDemand(tax);
    }


    //PD stands por Peru Default
    public void testCalculateTaxPD(){

        double p_tax_value = tax.calculateTax("PE");
        Assert.assertEquals(p_tax_value,0.18);

    }
    //PN stands for Peru New

    public void testCalculateTaxPN(){
        tax.setP_tax(0.41);

        double p_tax_value = tax.calculateTax("PE");

        Assert.assertEquals(p_tax_value,0.41);

    }
    //CLD stands por Colombia Default
    public void testCalculateTaxCLD(){

        double cl_tax_value = tax.calculateTax("CL");
        Assert.assertEquals(cl_tax_value,0.0);

    }

    //CLN stands for Colombia New
    public void testCalculateTaxCLN(){
        tax.setCl_tax(0.41);

        double cl_tax_value = tax.calculateTax("CL");

        Assert.assertEquals(cl_tax_value,0.41);

    }

    //BRD stands por Brazil Default
    public void testCalculateTaxBRD(){

        double br_tax_value = tax.calculateTax("BR");
        Assert.assertEquals(br_tax_value,0.12);

    }

    //BRN stands for Brazil New
    public void testCalculateTaxBRN() {

        tax.setBr_tax(0.57);

        double br_tax_value = tax.calculateTax("BR");

        Assert.assertEquals(br_tax_value, 0.57);

    }

    public void testNullInput(){

        double result = tax.calculateTax("");

        Assert.assertEquals(result,0.0);

    }

}
