package tp.ws.amoa.services;

import tp.ws.amoa.model.Item;
import java.util.ArrayList;
import java.util.List;

public class ItemsManager {
    private static List<Item> items = new ArrayList<>();

    public static long addItem(Item item) {
        long id = items.size() + 1;
        item.setId(id);
        items.add(item);
        return id;
    }

    public static Item getItem(long id) {
        for (Item item : items) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }

    public static void updateItem(Item item) {
        int index = items.indexOf(getItem(item.getId()));
        if (index >= 0) {
            items.set(index, item);
        }
    }

    public static void deleteItem(long id) {
        Item item = getItem(id);
        if (item != null) {
            items.remove(item);
        }
    }

    public static List<Item> getAll() {
        return items;
    }
}
