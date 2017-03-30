package com.lkl.framework.jmx;


/**
 * MBean必须是面向接口，接口名称需要以MBean结尾,实现类名称必须为MBean前面的字符串
 */
public interface HelloMBean {

    /**
     * get，set 方法对应属性值
     * @return
     */
    String getName();

    void setName(String name);

    String getAge();

    void setAge(String age);


    /**
     * 普通的操作，可以触发对应方法
     */
    void sayHello();

    void sayHello(String content);

    void getPersonInfo();

}