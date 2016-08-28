package com.amshulman.insight.row;

import javax.annotation.Nonnegative;
import javax.annotation.Nonnull;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Item;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import com.amshulman.insight.action.ItemAction;

@Getter
@ToString(callSuper = true)
@FieldDefaults(level = AccessLevel.PROTECTED, makeFinal = true)
public final class ItemRowEntry extends RowEntry {

    Material itemType;
    short damage;
    short quantity;
    ItemMeta metadata;

    public ItemRowEntry(@Nonnegative long datetime, @Nonnull String actor, @Nonnull ItemAction action, @Nonnull Item item) {
        this(datetime, actor, action, item.getLocation(), item.getItemStack());
    }

    public ItemRowEntry(@Nonnegative long datetime, @Nonnull String actor, @Nonnull ItemAction action, @Nonnull Location loc, @Nonnull ItemStack stack) {
        super(datetime, actor, action, loc.getWorld().getName(), loc.getBlockX(), loc.getBlockY(), loc.getBlockZ());

        this.itemType = stack.getType();
        this.damage = stack.getDurability();
        this.quantity = (short) stack.getAmount();
        this.metadata = stack.getItemMeta();
    }
}
