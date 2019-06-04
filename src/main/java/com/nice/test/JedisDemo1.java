package com.nice.test;

import redis.clients.jedis.Jedis;

public class JedisDemo1 {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("127.0.0.1",6379);
        jedis.append("name","bug");
        System.out.println(jedis.get("name"));
    }
}
