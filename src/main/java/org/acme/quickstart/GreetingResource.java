package org.acme.quickstart;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Path("/hello")
@ApplicationScoped
public class GreetingResource {
    private static final Logger LOGGER = LoggerFactory.getLogger(GreetingResource.class);

    @Inject
    MyService myService;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        LOGGER.info("hello!");
        myService.getKeyPrefix();
        LOGGER.info(myService.getConfigStoreEndpoint());
        return "hello";
    }

    @PostConstruct
    public void init() {
        LOGGER.info("init");
    }
}