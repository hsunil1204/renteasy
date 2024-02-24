package com.renteasy.service;

import com.renteasy.entity.Owner;
import com.renteasy.repository.OwnerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OwnerServiceImpl implements OwnerService {

    private OwnerRepository ownerRepository;

    public OwnerServiceImpl(OwnerRepository ownerRepository) {
        this.ownerRepository = ownerRepository;
    }

    @Override
    public Owner insertOwner(Owner owner) {
        return ownerRepository.save(owner);
    }

    @Override
    public Owner updateOwner(Integer id) {
        Owner owner = ownerRepository.findById(id).orElseThrow(() -> new RuntimeException("Owner Not Found"));
        owner.s
        return null;
    }

    @Override
    public boolean deleteOwner(Integer id) {
        return false;
    }

    @Override
    public List<Owner> getOwnerList() {
        return ownerRepository.findAll();
    }

    @Override
    public Owner findByOwnerId(Integer id) {
        return ownerRepository.findById(id).orElseThrow(() -> new RuntimeException("No Owner Found"));
    }
}
