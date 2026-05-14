package EstudoEnum.Ex03.Entities;

import EstudoEnum.Ex03.Entities.Enum.OrderStatus2;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private Date moment;
    private OrderStatus2 status;
    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
    private Client client;
    private List<OrderItem> items = new ArrayList<>();

    public Order(){}

    public Order(Date moment, OrderStatus2 status,Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus2 getStatus() {
        return status;
    }

    public void setStatus(OrderStatus2 status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }


    public void addItem (OrderItem orderItem){
        items.add(orderItem);
    }

    public void removeItem (OrderItem orderItem){
        items.remove(orderItem);
    }

    public Double total(){
        double sum = 0.0;
        for (OrderItem c : items){
            sum += c.subtotal();
        }
        return sum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order moment: ");
        sb.append(sdf.format(moment) + "\n");
        sb.append("Order status: ");
        sb.append(status + "\n");
        sb.append("Client: ");
        sb.append(client + "\n");
        sb.append("Order items:\n");
        for (OrderItem item : items) {
            sb.append(item + "\n");
        }
        sb.append("Total price: $");
        sb.append(String.format("%.2f", total()));
        return sb.toString();
    }

}
