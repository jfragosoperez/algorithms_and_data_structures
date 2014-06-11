package com.jfragoso.datastructures.hashtable;

import java.util.LinkedList;

/**
 * Created by jonathanfragoso on 11/06/14.
 * <p/>
 * Implementation of a hash table using a non dynamic array in order to save the elements and
 * using a linked list in the positions of that table in order to save the elements which are
 * {@link com.jfragoso.datastructures.hashtable.HashTableNode}.
 */
public final class HashTableArrayImpl<K, V> implements HashTableBaseOperations<K, V> {

    public static final int UNDEFINED_TABLE_SIZE = 10;

    private int tableSize;
    private Object[] table;
    private int keysSize = 0;

    public HashTableArrayImpl() {
        this(UNDEFINED_TABLE_SIZE);
    }

    public HashTableArrayImpl(int tableSize) {
        this.tableSize = tableSize;
        table = new Object[tableSize];
    }

    @Override
    public V put(K key, V value) throws NullPointerException {

        if (value == null || key == null) {
            throw new NullPointerException("Neither the key nor the value can be null");
        }

        //case we've to update the value
        if (this.contains(key)) {
            int hash = this.hash(key);
            HashTableNode node = new HashTableNode();
            node.setKey(key);
            int nodePosition = ((LinkedList) this.table[hash]).indexOf(node);
            V oldValue = ((LinkedList<HashTableNode<K, V>>) this.table[hash]).get(nodePosition).getValue();
            ((LinkedList<HashTableNode>) this.table[hash]).get(nodePosition).setValue(value);
            return oldValue;

        } else { //case we've to create a new linked list for that key or in case that chaining happens and we need to add a new node in the linked list that just exists
            //for that position (retrieved by hashing for that key).

            int hash = this.hash(key); // Find out where in our array should the item go

            //case we've not a linked list in that position of the table yet.
            if (this.table[hash] == null) {
                this.table[hash] = new LinkedList();
            }

            //Add to the linked list in the appropriate position
            ((LinkedList) this.table[hash]).add(new HashTableNode(key, value));
            keysSize++;

            return null;
        }

    }

    @Override
    public boolean contains(K key) throws NullPointerException{
        if(key == null){
            throw new NullPointerException();
        }
        int hash = this.hash(key);

        if (this.table[hash] != null) {
            HashTableNode node = new HashTableNode();
            node.setKey(key);
            //because indexOf takes into account the equals method and equals of a HashTableNode consists of
            //looking if the key is the same for both nodes, we can do this
            if (((LinkedList) this.table[hash]).indexOf(node) > -1) {
                return true;
            }
        }

        return false;
    }


    @Override
    public V remove(K key) throws NullPointerException{
        if(key == null){
            throw new NullPointerException();
        }
        int hash = this.hash(key);

        if (this.table[hash] != null) {
            HashTableNode node = new HashTableNode();
            node.setKey(key);
            int foundPosition = ((LinkedList) this.table[hash]).indexOf(node);
            if (foundPosition > -1) {
                V removedValue = ((LinkedList<HashTableNode<K, V>>) this.table[hash]).remove(foundPosition).getValue();
                keysSize--;

                //case this position contains no elements in the linked list, we remove the linkedList
                if (((LinkedList) this.table[hash]).size() == 0) {
                    this.table[hash] = null;
                }

                return removedValue;
            }
        }
        return null;
    }

    @Override
    public V get(K key) throws NullPointerException{
        if(key == null){
            throw new NullPointerException();
        }
        int hash = this.hash(key);

        if (this.table[hash] != null) {
            HashTableNode node = new HashTableNode();
            node.setKey(key);

            int foundPosition = ((LinkedList) this.table[hash]).indexOf(node);
            return (foundPosition != -1) ? ((LinkedList<HashTableNode<K, V>>) this.table[hash]).get(foundPosition).getValue() : null;

        }
        return null;
    }

    @Override
    public int size() {
        return keysSize;
    }

    @Override
    public boolean isEmpty() {
        return keysSize == 0;
    }

    @Override
    public int hash(K key) {
        return Math.abs(key.toString().hashCode() % tableSize);
    }
}
