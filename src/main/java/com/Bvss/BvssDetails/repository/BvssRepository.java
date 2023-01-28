package com.Bvss.BvssDetails.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Bvss.BvssDetails.entity.Bvss;

@Repository
public interface BvssRepository extends JpaRepository<Bvss, Integer> {

    Bvss findByName(String name);
}
