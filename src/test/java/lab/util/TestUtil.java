package lab.util;

import java.util.List;
import java.util.ArrayList;

import lab.demand.Order;

public class TestUtil {

    public static List<Order> buildOrdersPeru() {
        List<Order> ordersPeru = new ArrayList<Order>();
        ordersPeru.add(new Order("PE", 10L));
        ordersPeru.add(new Order("PE", 10L));
        ordersPeru.add(new Order("PE", 15L));
        return ordersPeru;
    }

    public static List<Order> buildOrdersColombia() {
        List<Order> ordersColombia = new ArrayList<Order>();
        ordersColombia.add(new Order("CL", 10L));
        ordersColombia.add(new Order("CL", 13L));
        ordersColombia.add(new Order("CL", 9L));
        ordersColombia.add(new Order("CL", 18L));
        return ordersColombia;
    }

    public static List<Order> buildOrdersBrazil() {
        List<Order> ordersBrazil = new ArrayList<Order>();
        ordersBrazil.add(new Order("BR", 7L));
        ordersBrazil.add(new Order("BR", 31L));
        ordersBrazil.add(new Order("BR", 9L));
        ordersBrazil.add(new Order("BR", 18L));
        return ordersBrazil;
    }


    public static List<Order> buildOrdersMix() {
        List<Order> general_orders = new ArrayList<Order>();
        general_orders.add(new Order("BR", 7L));
        general_orders.add(new Order("BR", 31L));
        general_orders.add(new Order("BR", 9L));
        general_orders.add(new Order("BR", 18L));
        general_orders.add(new Order("CL", 10L));
        general_orders.add(new Order("CL", 13L));
        general_orders.add(new Order("CL", 9L));
        general_orders.add(new Order("CL", 18L));
        general_orders.add(new Order("PE", 10L));
        general_orders.add(new Order("PE", 10L));
        general_orders.add(new Order("PE", 15L));
        return general_orders;
    }

}