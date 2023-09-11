import entities.Order;
import entitiesEnum.OrderStatus;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Order order = new Order(1080, new Date(), OrderStatus.SHIPPED);

    System.out.println(order);
    }
}