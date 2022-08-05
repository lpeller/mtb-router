package com.mtb.router;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MtbRouterApplication{
    public static void main(String[] args) throws Exception {
       // new MtbRouterApplication().run(args);
        SpringApplication.run(MtbRouterApplication.class, args);
    }

//
//    @Override
//    public void initialize(Bootstrap<GraphHopperServerConfiguration> bootstrap) {
//        bootstrap.addBundle(new GraphHopperBundle());
//        bootstrap.addBundle(new RealtimeBundle());
//        bootstrap.addCommand(new ImportCommand());
//        bootstrap.addCommand(new MatchCommand());
//        bootstrap.addBundle(new AssetsBundle("/com/graphhopper/maps/", "/maps/", "index.html"));
//        // see this link even though its outdated?! // https://www.webjars.org/documentation#dropwizard
//        bootstrap.addBundle(new AssetsBundle("/META-INF/resources/webjars", "/webjars/", null, "webjars"));
//    }
//
//    @Override
//    public void run(GraphHopperServerConfiguration configuration, Environment environment) {
//        environment.jersey().register(new RootResource());
//        environment.jersey().register(NavigateResource.class);
//        environment.servlets().addFilter("cors", CORSFilter.class).addMappingForUrlPatterns(EnumSet.allOf(DispatcherType.class), false, "*");
//    }
}
