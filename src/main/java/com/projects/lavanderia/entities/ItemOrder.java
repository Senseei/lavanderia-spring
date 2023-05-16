package com.projects.lavanderia.entities;

import java.util.Objects;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_item_orders")
public class ItemOrder {
    @EmbeddedId
    private ItemOrderPK id = new ItemOrderPK();

    public ItemOrder() {}

    public ItemOrder(Order order, Person person, Machine machine, Cycle cycle) {
        id.setOrder(order);
        id.setPerson(person);
        id.setMachine(machine);
        id.setCycle(cycle);
    }

    public Order getOrder() {
        return id.getOrder();
    }

    public void setOrder(Order order) {
        id.setOrder(order);
    }

    public Person getPerson() {
        return id.getPerson();
    }

    public void setPerson(Person person) {
        id.setPerson(person);
    }

    public Machine getMachine() {
        return id.getMachine();
    }

    public void setMachine(Machine machine) {
        id.setMachine(machine);
    }

    public Cycle getCycle() {
        return id.getCycle();
    }

    public void setCycle(Cycle cycle) {
        id.setCycle(cycle);
    }

    @Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ItemOrder other = (ItemOrder) obj;
		return Objects.equals(id, other.id);
	}
}
