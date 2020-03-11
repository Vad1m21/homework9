package myHashMap;

import java.util.HashMap;

public class MyHashMap<K,V> {
    private int size = 0;
    private Entry<K, V> bucket[];
    private int pointer;

    public MyHashMap(int size) {
        this.bucket = new Entry[size];
    }

    public void put(K key, V value) {

        Entry<K, V> entry = new Entry<K, V>(key, value, null);
       // int buckets = key.hashCode() % (size+1);
        int buckets = key.hashCode()/100;
        Entry<K, V> existing = bucket[buckets];

        if (existing == null) {

            bucket[buckets] = entry;

            size++;

        } else {

            // compare the keys see if key already exists

            while (existing.next != null) {

                if (existing.key.equals(key)) {

                    existing.value = value;

                    return;

                }

                existing = existing.next;

            }

            if (existing.key.equals(key)) {

                existing.value = value;

            } else {

                existing.next = entry;

                size++;

            }

        }

    }



    public V get(K key) {

        Entry<K, V> buckets = bucket[0];

        while (bucket != null) {

            if (buckets.key.equals(key)) {

                return buckets.value;

            }

            buckets = buckets.next;

        }

        return null;

    }


    public int size() {
        return size;
    }

    public void clear() {
        pointer = size;
        for (int i = 0; i < pointer; i++) {
            bucket[i] = null;
        }
    }

    public void remove(K key) {
        Entry<K, V> buckets = bucket[0];
        Entry<K,V> temp = new Entry<>(null,null,null);
        while (bucket != null) {

            if (buckets.key.equals(key)) {
                if(buckets.next != null)
                    temp = buckets.next;
                    buckets = null;
                    buckets = temp;
                    return;
            }
        }


    }
}
