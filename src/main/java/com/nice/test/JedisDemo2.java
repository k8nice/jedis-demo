package com.nice.test;

import redis.clients.jedis.Jedis;

public class JedisDemo2 {
    public static void main(String[] args) {
     //   pingPong();
//        lpushDemo();
        incrDemo();
//        demo3();
    }

    public static void incrDemo() {
        Jedis jedis = new Jedis("127.0.0.1",6379);
        jedis.set("age","18");
        System.out.println(jedis.incr("age"));
    }

    public static void demo3() {
        Jedis jedis = new Jedis("127.0.0.1",6379);
        //System.out.println(jedis.decr("name"));
//        jedis.blpop("nice");
        System.out.println(jedis.bgsave());
    }

    public static void lpushDemo() {
        Jedis jedis = new Jedis("127.0.0.1",6379);
        jedis.lpush("name","nice");
        jedis.lpush("name","bug");
        jedis.lpush("name","18");
        System.out.println(jedis.lpop("name"));
//        System.out.println(jedis.lrange("name",0,-1));
     //   System.out.println(jedis.lrange("name",0,1));
    }

    public static void pingPong() {
        Jedis jedis = new Jedis("127.0.0.1",6379);
        System.out.println(jedis.ping());
    }
}
