package com.test.repository;

import com.test.entity.AccountCreationEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<AccountCreationEntity, Integer>
{


}
