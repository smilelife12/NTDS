package com.ntds.jpa.dao;

import com.ntds.jpa.entity.NtdsMsgLog;
import com.ntds.jpa.entity.NtdsPageData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NtdsMsgLogRepository extends JpaRepository<NtdsMsgLog, String> {
    NtdsMsgLog findByMsgCode(String msgCode);
    NtdsMsgLog findByPageCode(NtdsPageData pageCode);
}