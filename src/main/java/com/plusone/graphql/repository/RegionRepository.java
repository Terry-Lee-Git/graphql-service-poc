package com.plusone.graphql.repository;

import com.plusone.graphql.entity.RegionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RegionRepository extends JpaRepository<RegionEntity,Long> {
    Optional<RegionEntity> findByRegionNameContains(String inputName);
}
