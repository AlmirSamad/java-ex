package EstudoEnum.Aula01;

import java.util.Date;

public class Program {
    static void main() {

        Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);

        System.out.println(order);

        //  alterando o status do pedido

        order.setStatus(OrderStatus.DELIVERED);

        System.out.println(order);

        // teste
        order.trocaStatus();
        System.out.println(order);

    }
}
