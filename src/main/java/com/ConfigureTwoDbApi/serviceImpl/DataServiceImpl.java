package com.ConfigureTwoDbApi.serviceImpl;

import com.ConfigureTwoDbApi.entity.DataEntity;
import com.ConfigureTwoDbApi.repo.read.ReadRepository;
import com.ConfigureTwoDbApi.repo.write.WriteRepository;
import com.ConfigureTwoDbApi.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class DataServiceImpl implements DataService {

    @Autowired
    private ReadRepository readRepository;

    @Autowired
    private WriteRepository writeRepository;

    public DataEntity createEntry(DataEntity entity) {
        DataEntity savedEntity = writeRepository.save(entity);
        readRepository.save(savedEntity);

        return savedEntity;
    }

    @Override
    public List<DataEntity> showALlEntries() {
        return readRepository.findAll();
    }

    @Override
    public Optional<DataEntity> findById(Long id) {
        return readRepository.findById(id);
    }
}


