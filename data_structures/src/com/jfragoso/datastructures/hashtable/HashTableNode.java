package com.jfragoso.datastructures.hashtable;

/**
 * Created by jonathanfragoso on 11/06/14.
 *
 * The nodes contained into the {@link com.jfragoso.datastructures.hashtable.HashTableArrayImpl}
 * that will store the information we want to save in the table.
 */
public final class HashTableNode<K,V>{

    private K key;
    private V value;

    public HashTableNode(){
        this.key = null;
        this.value = value;
    }

    public HashTableNode(K key, V value){
        this.key = key;
        this.value =  value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        HashTableNode that = (HashTableNode) o;

        if (this.key != null ? !this.key.equals(that.key) : that.key != null) return false;

        return true;
    }

    @Override
    public String toString() {
        return "HashTableNode{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}
