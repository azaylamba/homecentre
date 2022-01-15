package com.relevel.homecentre.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Order {

    @Id
    private long order_id;
}
