package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item findById(int id) {
        for (int i = 0; i < size; i++) {
            if (items[i] != null && id == items[i].getId()) {
                return items[i];
            }
        }
        return null;
    }

    public Item[] findAll() {
        Item[] rsl = new Item[this.size];
        int size = 0;
        for (int i = 0; i < this.size; i++) {
            if (items[i] != null) {
                rsl[size++] = items[i];
            }
        }
        return Arrays.copyOf(rsl, size);
    }

    public Item[] findByName(String key) {
        Item[] rsl = new Item[this.size];
        int size = 0;
        for (int i = 0; i < this.size; i++) {
            if (items[i] != null && key.equals(items[i].getName())) {
                rsl[size++] = items[i];
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}