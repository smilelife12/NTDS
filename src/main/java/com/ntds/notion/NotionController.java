package com.ntds.notion;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;

import java.util.Map;

@FeignClient(name="NotionAPI", url="https://api.notion.com/v1")
public interface NotionController {

    @GetMapping("/pages/{id}")
    ResponseEntity<Map<String, Object>> retrivePage(@RequestHeader("Authorization") String bearerToken,
                                                        @RequestHeader("Notion-Version") String notionVersion, @PathVariable String id);
}
