package config;

import com.sun.jersey.api.core.ResourceConfig;
import rest.MessageRestService;
import service.BasicAuthFilter;

import javax.inject.Named;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Rob on 21/01/2017.
 */
@Named
@ApplicationPath("/api")
public class MyApplication extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        final Set<Class<?>> resources = new HashSet<Class<?>>();

        resources.add(BasicAuthFilter.class);
        resources.add(MessageRestService.class);

        return resources;
    }
}
