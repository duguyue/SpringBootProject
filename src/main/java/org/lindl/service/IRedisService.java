package org.lindl.service;

import redis.clients.jedis.Jedis;

import java.util.List;

/**
 * Created by lin on 2017/2/3.
 */
public interface IRedisService {
    public Jedis getResource();

    public void returnResource(Jedis jedis);

    public void set(String key, String value);

    public String get(String key);
}
