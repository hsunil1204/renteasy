package com.renteasy.service;

import com.renteasy.entity.Owner;

import java.util.List;

public interface OwnerService {

    public Owner insertOwner(Owner owner);
    public Owner updateOwner(Integer id);
    public boolean deleteOwner(Integer id);
    public List<Owner> getOwnerList();
    public Owner findByOwnerId(Integer id);
}
