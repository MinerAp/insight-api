package com.amshulman.insight.event;

import javax.annotation.Nonnull;

import org.bukkit.event.Event;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import com.amshulman.insight.row.RowEntry;
import com.amshulman.insight.util.InsightPlugin;

public abstract class BaseEventHandler<T extends Event> implements Listener {

    private final InsightPlugin pluginInstance;

    protected BaseEventHandler() {
        pluginInstance = (InsightPlugin) JavaPlugin.getProvidingPlugin(InsightPlugin.class);
    }

    /**
     * For internal use only
     */
    BaseEventHandler(@Nonnull InsightPlugin pluginInstance) {
        assert (pluginInstance != null);
        this.pluginInstance = pluginInstance;
    }

    public abstract void listen(T event);

    protected final void add(@Nonnull RowEntry e) {
        pluginInstance.logEvent(e);
    }
}
