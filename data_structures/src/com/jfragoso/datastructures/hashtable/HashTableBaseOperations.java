package com.jfragoso.datastructures.hashtable;

/**
 * Created by jonathanfragoso on 11/06/14.
 */
public interface HashTableBaseOperations<K, V> {

    /**
     * Adds a new element with the specified key into the hash table
     *
     * @param key   is the key of the value we want to insert
     * @param value is the new value we want to insert into the table.
     * @return the value that was previously linked to that key if existed, null otherwise.
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
     *
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

    /**
     * Returns a hash code for the given key.
     *
     * @param key is the key we want that we want to hash.
     * @return is the hash after applying the hashing algorithm to that key.
     */
    public int hash(K key);

    /**
     * Looks for the given key into the table and returns true if it has been found. Otherwise, returns false.
     *
     * @param key searches in the table the given key.
     * @return true if the keys is just into the table, false otherwise.
     */
    public boolean contains(K key);
}
