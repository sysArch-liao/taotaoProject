package com.taotao.rest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

/**
 * @Auther: Albert
 * @Date: 2019/6/8 19:13
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-jedis.xml");
        JedisPool pool = (JedisPool) applicationContext.getBean("redisClient");
        Jedis jedis = pool.getResource();
        jedis.set("aaa", "成功了");
        String string = jedis.get("aaa");
        System.out.println(string);
        jedis.close();
        pool.close();
    }


}
