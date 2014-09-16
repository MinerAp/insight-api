package com.amshulman.insight.row;

import javax.annotation.Nonnegative;
import javax.annotation.Nonnull;

import lombok.AccessLevel;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

import com.amshulman.insight.action.InsightAction;

@ToString
@FieldDefaults(level = AccessLevel.PROTECTED, makeFinal = true)
public abstract class RowEntry {

    long datetime;
    String actor;
    String action;
    String world;
    int x;
    int y;
    int z;

    public RowEntry(@Nonnegative long datetime, @Nonnull String actor, @Nonnull InsightAction action, String world, int x, int y, int z) {
        this.datetime = datetime;
        this.actor = actor;
        this.action = action.getName();
        this.world = world;
        this.x = x;
        this.y = y;
        this.z = z;
    }
}
