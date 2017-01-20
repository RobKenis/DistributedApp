package service;

import javax.ejb.Stateless;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Default;
import javax.inject.Named;
import java.util.Date;

/**
 * Created by Rob on 20/01/2017.
 */
@Named
@RequestScoped
@Default
public class TimerService {
    public String sayTime(){
        Date now = new Date();
        return now.toString();
    }
}
