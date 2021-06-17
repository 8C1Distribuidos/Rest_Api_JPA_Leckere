package com.weine.entities;

import javax.persistence.*;

/**
 * Entity to have the field of the table <b>"producto_por_compra"</b> as the:</br>
 * {@link #id} to keep the id of the purchase item.<br>
 * {@link #amount} to keep the amount paid for the item.<br>
 * {@link #product} to keep the relation of the product.<br>
 * {@link #ticket} to keep the relation of the ticket.<br>
 * @author Luis
 */
@Entity
@Table(name = "producto_por_compra")
public class PurchaseItem {
    @EmbeddedId
    private PurchaseItemId id;
    @Column(name = "cantidad", nullable = false)
    private Integer amount;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_producto", nullable = false, insertable = false, updatable = false)
    private Product product;
    @MapsId("idTicket")
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "id_ticket", nullable = false, insertable = false, updatable = false)
    private Ticket ticket;

    public PurchaseItem(PurchaseItemId id, Integer amount, Product product, Ticket ticket) {
        this.id = id;
        this.amount = amount;
        this.product = product;
        this.ticket = ticket;
    }

    public PurchaseItem() {
    }

    public PurchaseItemId getId() {
        return id;
    }

    public void setId(PurchaseItemId id) {
        this.id = id;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    @Override
    public String toString() {
        return "PurchaseItem{" +
                "id=" + id +
                ", amount=" + amount +
                '}';
    }

}
