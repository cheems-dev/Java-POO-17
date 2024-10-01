package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    private LocalDateTime moment;
    private OrderStatus status;
    private Client client;
    private List<OrderItem> items;

    public void addItem(OrderItem orderItem)  {
        items.add(orderItem);
    }

    public double total() {
        double sum = 0;

        for(OrderItem item : items)  {
            sum += item.subTotal();
        }

        return sum;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order moment: ");
        sb.append(moment).append("\n");
        sb.append("Order status: ");
        sb.append(status).append("\n");
        sb.append(client).append("\n");
        sb.append("Order items: \n");

        for(OrderItem item : items) {
            sb.append("Order item\n");
            sb.append(item);
            sb.append("Subtotal\n");
            sb.append(item.subTotal());
        }

        sb.append("\nTotal\n");
        sb.append(this.total());

        return sb.toString();
    }
}
