package com.org.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.org.entity.Account;
import com.org.entity.CompositeId;

public interface AccountDao extends JpaRepository<Account, CompositeId>{

}
