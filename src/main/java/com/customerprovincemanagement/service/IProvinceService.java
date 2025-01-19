package com.customerprovincemanagement.service;

import com.customerprovincemanagement.model.Province;

import java.util.Optional;

public interface IProvinceService extends IGenerateService<Province> {
    Iterable<Province> findAll();

    void save(Province province);

    Optional<Province> findById(Long id);

    void remove(Long id);
}
