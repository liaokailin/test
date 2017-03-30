package com.lkl.framework.jmx;

import javax.management.*;
import java.lang.management.ManagementFactory;
import java.util.concurrent.TimeUnit;

/**
 * Created by liaokailin on 17/3/30.
 */
public class HelloAgent {

    public static void main(String[] args) throws MalformedObjectNameException, NotCompliantMBeanException, InstanceAlreadyExistsException, MBeanRegistrationException, InterruptedException {
        MBeanServer server = ManagementFactory.getPlatformMBeanServer();
        ObjectName helloName = new ObjectName("test-jmx:name=hello"); //ObjectName 格式 域名：name=MBean名称
        server.registerMBean(new Hello(), helloName);
        TimeUnit.HOURS.sleep(1);
    }
}
