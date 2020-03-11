package myHashMap;

import java.util.Objects;

public class Entry<K,V> {
    public K key;
    public V value;
    public Entry next;

    public Entry(K key,V value,Entry<K,V> next){
        this.key = key;
        this.value = value;
        this.next = next;
    }


    @Override
    public String toString() {
        return "Entry{" +
                "key=" + key +
                ", value=" + value +
                ", next=" + next +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Entry<?, ?> entry = (Entry<?, ?>) o;
        return Objects.equals(key, entry.key) &&
                Objects.equals(value, entry.value) &&
                Objects.equals(next, entry.next);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, value, next);
    }
}
