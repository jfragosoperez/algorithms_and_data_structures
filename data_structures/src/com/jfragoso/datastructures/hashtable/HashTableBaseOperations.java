package com.jfragoso.datastructures.hashtable;

/**
 * Created by jonathanfragoso on 11/06/14.
 */
public interface HashTableBaseOperations<K,V> {

    /**
     * Adds a new element with the specified key into the hash table
     *
     * @param key is the key of the value we want to insert
     * @param value is the new value we want to insert into the table.
     * @return the value inserted into the table.
     */
    public V put(K key, V value);

    /**
     * Removes the key and its value of the table.
     *
     * @param key is the key we want to remove from the table.
     * @return the value linked to that key that has been removed from the table.
     */
    public V remove(K key);

    /**
     * Returns the value linked to the requested key in the table.
     * @param key is the key of the value we want to search in the table.
     * @return the value related to that key in the table.
     */
    public V get(K key);

    /**
     * Returns the number of keys in the table.
     *
     * @return the number of keys in the table.
     */
    public int size();

    /**
     * If the table contains no keys.
     *
     * @return if the table contains no keys (in this case there won't be any values too)
     */
    public boolean isEmpty();
}
