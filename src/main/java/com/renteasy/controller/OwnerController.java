package com.renteasy.controller;

import com.renteasy.entity.Owner;
import com.renteasy.service.OwnerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/owner")
public class OwnerController {

    private OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @PostMapping("/create")
    public Owner insertOwner(@RequestBody Owner owner) {
        return ownerService.insertOwner(owner);
    }

    @GetMapping("/list")
    public List<Owner> getOwnerList() {
        return ownerService.getOwnerList();
    }

    @GetMapping("{id}")
    public Owner getOwner(@PathVariable Integer id) {
        return ownerService.findByOwnerId(id);
    }

}
