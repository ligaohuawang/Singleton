package com.lgh;
//用来测试是否是同一个实例
public class Test {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        System.out.println("实例一为:"+instance1);
        Singleton instance2 = Singleton.getInstance();
        System.out.println("实例二为:"+instance2);
        System.out.println("是否是一个实例:"+instance1.equals(instance2));
    }
}
