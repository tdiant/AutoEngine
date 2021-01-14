package tdiant.bukkit.autoengine.tools.item;

import org.bukkit.inventory.ItemStack;

public class ItemStackBuilder {
    private ItemStack itemStack;

    public ItemStackBuilder(ItemStack srcItem) {
        itemStack = srcItem.clone();
    }

    public ItemStackBuilder() {
    }
}
