package net.zerotodev.api.designPatterns;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class OrderTest {
    @Test @DisplayName("Order Example")
    void main(){
        Order.place(order -> order.add("shoes")
                                .add("smart phone")
                                .add("food")
                                .deliverAt("Street No 45 Gangnam"));
    }

}
@Data @AllArgsConstructor @NoArgsConstructor
class Order{
    private List<String> cart = new ArrayList<>();
    private String address;
    public Order add(String item){
        cart.add(item);
        System.out.println(item + " added to the Cart");
        return new Order(this.cart, this.address);
    }
    public Order deliverAt(String location){
        this.address = location;
        System.out.println("The Delivery Address set by you is " + location);
        return new Order(this.cart, this.address);
    }
    public static void place(Function<Order, Order> function){
        Order order = new Order();
        order = function.apply(order);
        System.out.println("Order placed !");
        System.out.println(order.cart.size() + " items ordered by you will be delivered at" + order.address + " by tomorrow");
    }

}

