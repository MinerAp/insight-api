package com.amshulman.insight.row;

import javax.annotation.Nonnegative;
import javax.annotation.Nonnull;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

import org.bukkit.Location;

import com.amshulman.insight.action.EntityAction;

@Getter
@ToString(callSuper = true)
@FieldDefaults(level = AccessLevel.PROTECTED, makeFinal = true)
public final class EntityRowEntry extends RowEntry {

    String actee;

    public EntityRowEntry(@Nonnegative long datetime, @Nonnull String actor, @Nonnull EntityAction action, @Nonnull Location loc, @Nonnull String actee) {
        super(datetime, actor, action, loc.getWorld().getName(), loc.getBlockX(), loc.getBlockY(), loc.getBlockZ());

        this.actee = actee;
    }
}
