package com.lgh;
//一个线程安全的单例模式
public class Singleton {

    /* 私有构造方法，防止被实例化 */
    private Singleton() {
    }

    /**
     * 1.使用一个内部类来维护单例:
     *      JVM内部的机制能够保证当一个类被加载的时候，
     *      这个类的加载过程是线程互斥的。这样当我们第一次调用getInstance的时候，
     *      JVM能够帮我们保证instance只被创建一次，并且会保证把赋值给instance的内存初始化完毕
     */
    private static class SingletonFactory{
        private static Singleton singleton = new Singleton();
    }

    /**
     * 获取实例
     * @return
     */
    public static Singleton getInstance(){
        return SingletonFactory.singleton;
    }

    /* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */
    public Object readResolve() {
        return getInstance();
    }


}
