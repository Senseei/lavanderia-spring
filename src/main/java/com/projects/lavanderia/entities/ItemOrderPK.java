package com.projects.lavanderia.entities;

import java.util.Objects;

import com.projects.lavanderia.entities.machines.Machine;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class ItemOrderPK {

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

    @ManyToOne
    @JoinColumn(name = "machine_id")
    private Machine machine;

    @ManyToOne
    @JoinColumn(name = "cycle_id")
    private Cycle cycle;

    public ItemOrderPK() {}

    public ItemOrderPK(Order order, Machine machine, Cycle cycle) {
        this.order = order;
        this.machine = machine;
        this.cycle = cycle;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Machine getMachine() {
        return machine;
    }

    public void setMachine(Machine machine) {
        this.machine = machine;
    }

    public Cycle getCycle() {
        return cycle;
    }

    public void setCycle(Cycle cycle) {
        this.cycle = cycle;
    }

    @Override
	public int hashCode() {
		return Objects.hash(order, machine, cycle);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ItemOrderPK other = (ItemOrderPK) obj;
		return Objects.equals(order, other.order) && Objects.equals(machine, other.machine)
        && Objects.equals(cycle, other.cycle);
	}
}
