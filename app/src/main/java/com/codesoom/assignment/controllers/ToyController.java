package com.codesoom.assignment.controllers;

import com.codesoom.assignment.domain.Toy;

import java.util.ArrayList;
import java.util.List;

public class ToyController {
    private List<Toy> toys = new ArrayList<>();

    public List<Toy> products() {
        return toys;
    }
}
