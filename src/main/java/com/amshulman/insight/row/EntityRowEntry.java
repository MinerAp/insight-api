package com.amshulman.insight.row;

import javax.annotation.Nonnegative;
import javax.annotation.Nonnull;

import lombok.AccessLevel;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

import org.bukkit.Location;

import com.amshulman.insight.action.EntityAction;

@ToString(callSuper = true)
@FieldDefaults(level = AccessLevel.PROTECTED, makeFinal = true)
public final class EntityRowEntry extends RowEntry {

    String actee;

    public EntityRowEntry(@Nonnegative long datetime, @Nonnull String actor, @Nonnull EntityAction action, @Nonnull Location loc, @Nonnull String actee) {
        super(datetime, actor, action, loc.getWorld().getName(), (int) loc.getX(), (int) loc.getY(), (int) loc.getZ());

        this.actee = actee;
    }
}
