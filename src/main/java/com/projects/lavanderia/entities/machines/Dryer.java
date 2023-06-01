package com.projects.lavanderia.entities.machines;

import com.projects.lavanderia.entities.Laundry;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("Secadora")
public class Dryer extends Machine {

    private Integer dryingCapacity;

    public Dryer() {
        super();
    }

    public Dryer(Long id, Laundry laundry, Boolean locked, Integer dryingCapacity) {
        super(id, laundry, locked);
        this.dryingCapacity = dryingCapacity;
    }

    public Integer getDryingCapacity() {
        return dryingCapacity;
    }

    public void setDryingCapacity(Integer dryingCapacity) {
        this.dryingCapacity = dryingCapacity;
    }
}
