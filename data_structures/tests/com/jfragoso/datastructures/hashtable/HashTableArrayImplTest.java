package com.jfragoso.datastructures.hashtable;

import org.junit.Before;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

public class HashTableArrayImplTest {

    private HashTableArrayImpl<String, String> phoneBook;

    @Before
    public void setUp() throws Exception {
        phoneBook = new HashTableArrayImpl<String, String>();
    }

    @Test(expected = NullPointerException.class)
    public void testNullKeysAndValuesOnOperations() {
        phoneBook.put(null, "a");
        phoneBook.put("a", null);
        phoneBook.put(null, null);
        phoneBook.get(null);
        phoneBook.contains(null);
        phoneBook.remove(null);
    }

    @Test
    public void testPut() throws Exception {
        assertNull(phoneBook.put("Any value", "432423432"));
        assertEquals(phoneBook.put("Any value", "111111111"), "432423432");
        assertTrue(phoneBook.size() == 1);
        assertNull(phoneBook.put("HEYYYY", "111111111"));
        assertTrue(phoneBook.size() == 2);
    }

    @Test
    public void testContains() throws Exception {
        assertFalse(phoneBook.contains("Any value"));
        phoneBook.put("Any value", "444444444");
        assertTrue(phoneBook.contains("Any value"));
        assertNull(phoneBook.get("Anyone"));
    }

    @Test
    public void testRemove() throws Exception {
        phoneBook.put("EOOO", "212");
        assertTrue(phoneBook.size() == 1);
        assertEquals(phoneBook.remove("EOOO"), "212");
        assertTrue(phoneBook.size() == 0);
        assertNull(phoneBook.get("Anyone"));
    }

    @Test
    public void testGet() throws Exception {
        phoneBook.put("Chewbacca", "123456789");
        assertEquals(phoneBook.get("Chewbacca"), "123456789");
        assertNull(phoneBook.get("Anyone"));
    }

    @Test
    public void testSize() throws Exception {
        assertTrue(phoneBook.size() == 0);
        phoneBook.put("John", "555555555");
        phoneBook.put("John", "666666666");
        phoneBook.put("Peter", "666666666");
        assertTrue(phoneBook.size() == 2);
        phoneBook.remove("John");
        assertTrue(phoneBook.size() == 1);
        phoneBook.remove("Peter");
        assertTrue(phoneBook.size() == 0);
        phoneBook.remove("Anyone");
        assertTrue(phoneBook.size() == 0);
    }

    @Test
    public void testIsEmpty() throws Exception {
        assertTrue(phoneBook.isEmpty());
        phoneBook.put("Ariadna", "999999999");
        assertFalse(phoneBook.isEmpty());
    }

    @Test
    public void testHash() throws Exception {
        String chars = "abcdefghijklmnopqrstuvwxyz";
        Random rand = new Random();
        String randomString = new String();
        for (int i = 0; i < 100; i++) {
            testHashWithRandomStrings(15, randomString, rand, chars);
        }
        for (int i = 0; i < 100; i++) {
            testHashWithRandomStrings(2, randomString, rand, chars);
        }
        for (int i = 0; i < 100; i++) {
            testHashWithRandomStrings(25, randomString, rand, chars);
        }
    }

    private void testHashWithRandomStrings(int stringSize, String randomString, Random rand, String chars) {
        randomString = generateRandomString(rand, chars, stringSize);
        assertTrue(phoneBook.hash(randomString) > -1 && phoneBook.hash(randomString) < phoneBook.UNDEFINED_TABLE_SIZE);
    }

    public String generateRandomString(Random rng, String characters, int length) {
        char[] text = new char[length];
        for (int i = 0; i < length; i++) {
            text[i] = characters.charAt(rng.nextInt(characters.length()));
        }
        return new String(text);
    }
}