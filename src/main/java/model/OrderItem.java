package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderItem {
    private int quantity;
    private double price;
    private Product product;


    public double subTotal()  {
        return this.price * this.quantity;
    }
}
