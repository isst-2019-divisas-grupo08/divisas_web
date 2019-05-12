package es.upm.dit.isst.trips.servlet;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import es.upm.dit.isst.trips.threads.changeThread;

/**
 * Application Lifecycle Listener implementation class Daemon
 *
 */
public class DaemonLauncher implements ServletContextListener  {

    private ScheduledExecutorService scheduler;

    public void contextInitialized(ServletContextEvent sce) {
    	scheduler = Executors.newSingleThreadScheduledExecutor();
    	scheduler.scheduleAtFixedRate(new changeThread(), 0, 15, TimeUnit.SECONDS);
    	 
    }

    public void contextDestroyed(ServletContextEvent sce){
    	scheduler.shutdownNow();
    }
	
}
