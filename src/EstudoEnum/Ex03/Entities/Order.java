package EstudoEnum.Ex03.Entities;

import EstudoEnum.Aula01.OrderStatus;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private Date moment;
    private OrderStatus status;

    private Client client;
    private List<OrderItem> orderItems = new ArrayList<>();

    public Order(){}

    public Order(Date moment, OrderStatus status, List<OrderItem> orderItems) {
        this.moment = moment;
        this.status = status;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void addItem (OrderItem orderItem){
        orderItems.add(orderItem);
    }

    public void removeItem (OrderItem orderItem){
        orderItems.remove(orderItem);
    }

    public Double total(){
        double sum = 0.0;
        for (OrderItem c : orderItems){
            sum += c.subtotal();
        }
        return sum;
    }

}
