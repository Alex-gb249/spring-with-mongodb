package com.alexis.workingmongodb.models;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Data
@AllArgsConstructor
public class Address {
    private String country;
    private String city;
    private String postcode;
}
