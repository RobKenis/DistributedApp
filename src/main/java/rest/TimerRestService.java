package rest;

import service.TimerService;

import javax.ejb.Schedule;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * Created by Rob on 20/01/2017.
 */
@Named
@RequestScoped
public class TimerRestService {

    @Inject
    TimerService timerService;

    @GET
    public String getTime(){
       return timerService.sayTime();
    }

    @Schedule(second="*/1", minute="*",hour="*", persistent=false)
    public void printTime(){
        System.out.println(timerService.sayTime());
    }
}
