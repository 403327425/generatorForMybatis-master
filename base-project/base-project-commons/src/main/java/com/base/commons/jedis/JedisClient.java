package com.base.commons.jedis;

import java.util.List;
import java.util.Map;

/**
 * @author Exrickx
 */
public interface JedisClient {

	String set(String key, String value);

	String get(String key);

	Boolean exists(String key);

	//设置key生存时间，当key过期时，它会被自动删除。 
	Long expire(String key, int seconds);

	//检查key是否过期当 key
	/**
	 * 不存在时，返回 -2 。
	 * 当 key 存在但没有设置剩余生存时间时，返回 -1 。
	 * 否则，以秒为单位，返回 key 的剩余生存时间。
	 */
	Long ttl(String key);

	Long incr(String key);

	Long hset(String key, String field, String value);

	String hget(String key, String field);

	Long hdel(String key, String... field);
	
	Map<String, String> hgetAll(String key);

	Boolean hexists(String key, String field);

	List<String> hvals(String key);

	Long del(String key);
	
	//存入list类型的Key-Value
	Long lpush(String key,String... strs);
	
	String rpop(String key);
	
	//返回指定长度的list
	List<String> lrange(String key,int start,int stop);
	
	//返回list元素长度
	Long llen(String key);
	
	//设定过期时间
	String setex(String key,int seconds,String value);
	
	Long setRange(String key,long offset,String value);

}
