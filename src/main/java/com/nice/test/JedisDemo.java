package com.nice.test;

import redis.clients.jedis.Jedis;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ningh
 */
public class JedisDemo {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("127.0.0.1",6379);
        Map map = new HashMap();
        map.put("name","nice");
        jedis.hmset("map",map);
        System.out.println(jedis.hkeys("map"));
        System.out.println(jedis.hmget("map","name"));
    }
}
