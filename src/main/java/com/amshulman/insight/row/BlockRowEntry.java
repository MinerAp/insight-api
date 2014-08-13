package com.amshulman.insight.row;

import javax.annotation.Nonnegative;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

import org.bukkit.block.Block;
import org.bukkit.block.BlockState;

import com.amshulman.insight.action.BlockAction;
import com.amshulman.insight.serialization.MetadataEntry;

@FieldDefaults(level = AccessLevel.PROTECTED, makeFinal = true)
public final class BlockRowEntry extends RowEntry {

    BlockState block;
    BlockState previousBlock;
    MetadataEntry metadata;

    public BlockRowEntry(@Nonnegative long datetime, @Nonnull String actor, @Nonnull BlockAction action, @Nonnull Block block) {
        this(datetime, actor, action, block.getState(), null);
    }

    public BlockRowEntry(@Nonnegative long datetime, @Nonnull String actor, @Nonnull BlockAction action, @Nonnull Block block, @Nullable MetadataEntry metadata) {
        this(datetime, actor, action, block.getState(), metadata);
    }

    public BlockRowEntry(@Nonnegative long datetime, @Nonnull String actor, @Nonnull BlockAction action, @Nonnull BlockState blockState) {
        this(datetime, actor, action, blockState, null);
    }

    public BlockRowEntry(@Nonnegative long datetime, @Nonnull String actor, @Nonnull BlockAction action, @Nonnull BlockState blockState, @Nullable MetadataEntry metadata) {
        super(datetime, actor, action, blockState.getX(), blockState.getY(), blockState.getZ());

        this.block = blockState;
        this.previousBlock = null;
        this.metadata = metadata;
    }
}
