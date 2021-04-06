package com.arp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.arp.entity.*;
@Repository
public interface MarksRepository extends JpaRepository<Marks, Long>{

}
