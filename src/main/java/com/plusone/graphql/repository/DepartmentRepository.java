package com.plusone.graphql.repository;

import com.cosium.spring.data.jpa.entity.graph.repository.EntityGraphJpaRepository;
import com.cosium.spring.data.jpa.entity.graph.repository.EntityGraphJpaSpecificationExecutor;
import com.plusone.graphql.entity.DepartmentEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends EntityGraphJpaRepository<DepartmentEntity, Long>, EntityGraphJpaSpecificationExecutor<DepartmentEntity> {

}
