package com.ntds.notion;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.xml.ws.Response;
import java.util.Map;

@Service
public class NotionService {
    @Autowired
    NotionController notionController;

    @Value("${notion.api.oauth.accesstoken}")
    private String notionApiOauthAcessToken;

    @Value("${notion.api.version}")
    private String notionApiVersion;

    public Map<String, Object> RetriveNotionPage(String id) {

        ResponseEntity<Map<String, Object>> response = notionController.retrivePage(notionApiOauthAcessToken, notionApiVersion, id);
        return response.getBody();
    }
}
