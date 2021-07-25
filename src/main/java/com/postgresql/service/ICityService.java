package com.postgresql.service;

import com.postgresql.model.City;

import java.util.List;

public interface ICityService {

    List<City> findAll();
}