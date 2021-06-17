package com.weine.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class PurchaseItemId implements Serializable {
    @Column(name = "id_ticket",nullable = false)
    private Integer idTicket;
    @Column(name = "id_producto",nullable = false)
    private Integer idProduct;

    public PurchaseItemId(Integer idTicket, Integer idProduct) {
        this.idTicket = idTicket;
        this.idProduct = idProduct;
    }

    public PurchaseItemId() {
    }

    public Integer getIdTicket() {
        return idTicket;
    }

    public void setIdTicket(Integer idTicket) {
        this.idTicket = idTicket;
    }

    public Integer getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Integer idProduct) {
        this.idProduct = idProduct;
    }

    @Override
    public String toString() {
        return "PurchaseItemId{" +
                "idTicket=" + idTicket +
                ", idProduct=" + idProduct +
                '}';
    }
}
