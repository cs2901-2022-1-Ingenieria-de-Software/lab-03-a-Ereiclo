package lab;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import lab.demand.ManageDemand;
import lab.demand.Tax;
import lab.util.TestUtil;
import lab.demand.Order;

import java.util.ArrayList;
import java.util.List;

@Test
public class ManageDemandTest {

    private Tax tax;

    private ManageDemand demand;

    @BeforeClass
    public void setup() {
        tax = new Tax();
        demand =  new ManageDemand(tax);
    }

    public void test_totalQuantityNULL(){
        List<Order> null_orders = new ArrayList<Order>();
        double result = demand.totalQuantity(null_orders);
        Assert.assertEquals(result, 0.0);
    }


    public void test_totalQuantityPE(){
        List<Order> ordersFromPeru = TestUtil.buildOrdersPeru();
        double result = demand.totalQuantity(ordersFromPeru);
        Assert.assertEquals(result, 35.0);

    }

    public void test_totalQuantityCL(){
        List<Order> ordersFromColombia = TestUtil.buildOrdersColombia();
        double result = demand.totalQuantity(ordersFromColombia);
        Assert.assertEquals(result, 50.0);
    }

    public void test_totalQuantityBR(){
        List<Order> ordersFromBrazil = TestUtil.buildOrdersBrazil();
        double result = demand.totalQuantity(ordersFromBrazil);
        Assert.assertEquals(result, 65.0);
    }
    public void test_totalQuantityMix(){
        List<Order> general_orders = TestUtil.buildOrdersMix();
        double result = demand.totalQuantity(general_orders);
        Assert.assertEquals(result, 150.0);
    }
    public void test_totaTaxesNULL(){
        List<Order> null_orders = new ArrayList<Order>();
        double result = demand.totalTaxes(null_orders);
        Assert.assertEquals(result, 0.0);
    }


    public void test_totalTaxesPE(){
        List<Order> ordersFromPeru = TestUtil.buildOrdersPeru();
        double result = demand.totalTaxes(ordersFromPeru);
        Assert.assertEquals(result, 0.54);

    }

    public void test_totalTaxesCL(){
        List<Order> ordersFromColombia = TestUtil.buildOrdersColombia();
        double result = demand.totalTaxes(ordersFromColombia);
        Assert.assertEquals(result, 0.0);
    }

    public void test_totalTaxesBR(){
        List<Order> ordersFromBrazil = TestUtil.buildOrdersBrazil();
        double result = demand.totalTaxes(ordersFromBrazil);
        Assert.assertEquals(result, 0.48);
    }
    public void test_totalTaxesMix(){
        List<Order> general_orders = TestUtil.buildOrdersMix();
        double result = demand.totalTaxes(general_orders);
        Assert.assertEquals(Math.round(result), 1.0);
    }

    public void test_AllOrdersNULL() {
        List<Order> null_orders = new ArrayList<Order>();
        double result = demand.calculateTotal(null_orders);
        Assert.assertEquals(result, 0.0);
    }

    public void test_AllOrdersFromPeru() {
        List<Order> ordersFromPeru = TestUtil.buildOrdersPeru();
        double result = demand.calculateTotal(ordersFromPeru);
        Assert.assertEquals(Math.round(result), 19.0);
    }

    public void test_AllOrdersFromColombia() {
        List<Order> ordersFromColombia = TestUtil.buildOrdersColombia();
        double result = demand.calculateTotal(ordersFromColombia);
        Assert.assertEquals(result, 0.0);
    }

    public void test_AllOrdersFromBrazil() {
        List<Order> ordersFromBrazil = TestUtil.buildOrdersBrazil();
        double result = demand.calculateTotal(ordersFromBrazil);
        Assert.assertEquals(Math.round(result), 31.0);
    }
    public void test_AllOrdersMix(){
        List<Order> general_orders = TestUtil.buildOrdersMix();
        double result = demand.calculateTotal(general_orders);
        Assert.assertEquals(Math.round(result), 153.0);
    }

    public void test_AllOrdersANULL() {
        List<Order> null_orders = new ArrayList<Order>();
        double result = demand.calculateTotalA(null_orders,0.1,0.5,0.15);
        Assert.assertEquals(result, 0.0);
    }


    public void test_AllOrdersA(){
        List<Order> general_orders = TestUtil.buildOrdersMix();
        double result = demand.calculateTotalA(general_orders,0.1,0.5,0.15);
        Assert.assertEquals(Math.round(result), 375.0);
    }


    // Add Tests !!

}
