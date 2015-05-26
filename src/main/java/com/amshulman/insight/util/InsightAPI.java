package com.amshulman.insight.util;

import javax.annotation.Nonnull;

import org.bukkit.plugin.Plugin;

import com.amshulman.insight.action.InsightAction;
import com.amshulman.insight.row.RowEntry;

public interface InsightAPI extends Plugin {

    public void logEvent(@Nonnull RowEntry row);

    public void registerAction(@Nonnull InsightAction action);
}
