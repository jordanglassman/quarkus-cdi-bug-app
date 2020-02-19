package org.acme.quickstart;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@ApplicationScoped
public class MyService extends MyBaseService {
    private static final Logger LOGGER = LoggerFactory.getLogger(MyService.class);


    private static final String JIRA_CLOUD_KEY_PREFIX = "jiraCloud";

    @Override
    String getKeyPrefix() {
        return "lol";
    }

    @PostConstruct
    public void init2() {
        LOGGER.info("init");
    }
}
