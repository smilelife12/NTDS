package com.ntds.jpa.dao;

import com.ntds.jpa.entity.NtdsPageData;
import com.ntds.jpa.entity.NtdsUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NtdsPageDataRepository extends JpaRepository<NtdsPageData, String> {
    NtdsPageData findByPageCode(String pageCode);
    NtdsPageData findByUserCode(NtdsUser userCode);
}