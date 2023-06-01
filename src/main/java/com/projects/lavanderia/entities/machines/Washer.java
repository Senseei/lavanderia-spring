package com.projects.lavanderia.entities.machines;

import com.projects.lavanderia.entities.Laundry;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("Lavadora")
public class Washer extends Machine {

    private Integer washCapacity;

    public Washer() {
        super();
    }

    public Washer(Long id, Laundry laundry, Boolean locked, Integer washCapacity) {
        super(id, laundry, locked);
        this.washCapacity = washCapacity;
    }

    public Integer getWashCapacity() {
        return washCapacity;
    }

    public void setWashCapacity(Integer washCapacity) {
        this.washCapacity = washCapacity;
    }
}
