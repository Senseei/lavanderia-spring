package com.projects.lavanderia.dto;

import java.util.Objects;

import com.projects.lavanderia.entities.Person;
import com.projects.lavanderia.projections.PersonProjection;

public class PersonDTO {

    private Long id;
    private String username;
    private String name;
    private String password;
    private Double cash;

    public PersonDTO() {}

    public PersonDTO(Person entity) {
        id = entity.getId();
        username = entity.getUsername();
        name = entity.getName();
        password = entity.getPassword();
        cash = entity.getCash();
    }

    public PersonDTO(PersonProjection projection) {
        id = projection.getId();
        username = projection.getUsername();
        name = projection.getName();
        password = projection.getPassword();
        cash = projection.getCash();
    }


    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public Double getCash() {
        return cash;
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
		PersonDTO other = (PersonDTO) obj;
		return Objects.equals(id, other.id);
	}
}