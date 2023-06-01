package com.cloudwise.syslog4j.handler;

import org.graylog2.syslog4j.server.SyslogServerEventHandlerIF;
import org.graylog2.syslog4j.server.SyslogServerSessionlessEventHandlerIF;
import org.springframework.context.ApplicationContext;

public interface SyslogServerhandler extends SyslogServerSessionlessEventHandlerIF {
    /**
     * init method
     * @param applicationContext
     */
    default void init(ApplicationContext applicationContext){

    }

}
