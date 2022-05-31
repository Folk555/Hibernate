package org.example;

import java.util.List;

public interface IUserDAO {
    public Owner findById(int id);

    public void save(Owner owner);

    public void update(Owner owner);

    public void delete(Owner owner);

    public Auto findAutoById(int id);

    public List<Owner> findAll();
}
