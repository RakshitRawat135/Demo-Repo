package com.ConfigureTwoDbApi.repo.write;

import com.ConfigureTwoDbApi.entity.DataEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WriteRepository extends JpaRepository<DataEntity, Long>{
}





