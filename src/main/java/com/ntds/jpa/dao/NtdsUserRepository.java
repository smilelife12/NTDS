package com.ntds.jpa.dao;

import com.ntds.jpa.entity.NtdsUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NtdsUserRepository extends JpaRepository<NtdsUser, String> {
    NtdsUser findByUserCode(String userCode);
    NtdsUser findByUserId(String userId);
}