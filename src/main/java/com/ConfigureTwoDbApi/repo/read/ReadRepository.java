package com.ConfigureTwoDbApi.repo.read;

import com.ConfigureTwoDbApi.entity.DataEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReadRepository extends JpaRepository<DataEntity, Long>{
}




