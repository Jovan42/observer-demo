package com.example.demo.test.messages;

import com.example.demo.test.model.Sale;
import rs.xfinity.observer.interfaces.Message;

public class SaleAddedMessage extends Message {

    private Sale addedSale;

    public SaleAddedMessage(Sale addedSale) {
        this.addedSale = addedSale;
    }

    public Sale getAddedSale() {
        return addedSale;
    }
}
