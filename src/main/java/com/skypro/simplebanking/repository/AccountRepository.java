package com.skypro.simplebanking.repository;

import com.skypro.simplebanking.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Optional;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
  Optional<Account> getAccountByUser_IdAndId(Long userId, Long accountId);

  Collection<Account> findByUserId(long userId);
}
