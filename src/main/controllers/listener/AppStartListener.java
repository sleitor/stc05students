package main.controllers.listener;

import org.apache.log4j.PropertyConfigurator;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Created by Троицкий Дмитрий on 20.04.2017.
 */
public class AppStartListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
 //       PropertyConfigurator.configure(  );
//        PropertyConfigurator.configure(AppStartListener.class.getClassLoader().getResource(""));
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
