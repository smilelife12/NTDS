package com.ntds;

import com.ntds.jpa.dao.NtdsUserRepository;
import com.ntds.jpa.entity.NtdsUser;
import com.ntds.notion.NotionService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@SpringBootTest
@Slf4j
@Service
@Transactional
class NtdsApplicationTests {
    @Autowired
    NotionService notionService;

    @Autowired
    NtdsUserRepository ntdsUserRepository;

    @Test
    void contextLoads() {
        Map<String, Object> response = notionService.RetriveNotionPage("939adbdacfbf427898b7af3aa241a966");
        log.info(response.get("last_edited_time").toString());
    }

    @Test
    void setNtdsUser() {
//        NtdsUser ntdsUser = new NtdsUser();
//        ntdsUser.setUserCode(UUID.randomUUID().toString().replace("-",""));
//        ntdsUser.setUserId("jh2");
//        ntdsUser.setUserName("PJH2");
//
//        ZonedDateTime startOfToday = LocalDate.now().atStartOfDay(ZoneId.systemDefault());
//        long todayMillis1 = startOfToday.toEpochSecond() * 1000;
//        ntdsUser.setCreateTime(todayMillis1);
//        log.info(String.valueOf(ntdsUserRepository.saveAndFlush(ntdsUser)));
//        log.info("test end");

        NtdsUser temp = ntdsUserRepository.findByUserId("jhpark");
        log.info(temp.getUserId());
        log.info(temp.getUserName());
    }

}
