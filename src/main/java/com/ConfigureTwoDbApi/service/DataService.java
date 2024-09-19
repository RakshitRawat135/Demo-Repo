package com.ConfigureTwoDbApi.service;

import com.ConfigureTwoDbApi.entity.DataEntity;
import java.util.List;
import java.util.Optional;

public interface DataService {
    DataEntity createEntry(DataEntity entity);

    List<DataEntity> showALlEntries();

    Optional<DataEntity> findById(Long id);

}
