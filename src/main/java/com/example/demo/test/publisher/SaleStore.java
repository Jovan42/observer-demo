package com.example.demo.test.publisher;

import com.example.demo.test.messages.SaleAddedMessage;
import com.example.demo.test.model.Sale;
import org.springframework.stereotype.Component;
import rs.xfinity.observer.anotations.Topic;
import rs.xfinity.observer.interfaces.Publisher;

import java.util.ArrayList;
import java.util.List;

@Topic(name = {"sale"})
@Component
public class SaleStore extends Publisher<SaleAddedMessage> {

    private List<Sale> sales = new ArrayList<>();

    public void addSale(Sale sale) {
        sales.add(sale);
        publish(new SaleAddedMessage(sale));
    }
}
