package com.test.repository;

import com.test.entity.BankCreationEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankCreationRepository extends JpaRepository<BankCreationEntity, Integer> 
{

}
