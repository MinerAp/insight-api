package com.amshulman.insight.row;

import javax.annotation.Nonnegative;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import lombok.AccessLevel;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

import org.bukkit.block.Block;
import org.bukkit.block.BlockState;

import com.amshulman.insight.action.BlockAction;
import com.amshulman.insight.serialization.MetadataEntry;

@ToString(callSuper = true)
@FieldDefaults(level = AccessLevel.PROTECTED, makeFinal = true)
public final class BlockRowEntry extends RowEntry {

    BlockState block;
    BlockState previousBlock;
    MetadataEntry metadata;

    public BlockRowEntry(@Nonnegative long datetime, @Nonnull String actor, @Nonnull BlockAction action, @Nonnull Block block) {
        this(datetime, actor, action, block.getState(), null, null);
    }

    public BlockRowEntry(@Nonnegative long datetime, @Nonnull String actor, @Nonnull BlockAction action, @Nonnull Block block, @Nullable BlockState previousBlock) {
        this(datetime, actor, action, block.getState(), previousBlock, null);
    }

    public BlockRowEntry(@Nonnegative long datetime, @Nonnull String actor, @Nonnull BlockAction action, @Nonnull Block block, @Nullable MetadataEntry metadata) {
        this(datetime, actor, action, block.getState(), null, metadata);
    }

    public BlockRowEntry(@Nonnegative long datetime, @Nonnull String actor, @Nonnull BlockAction action, @Nonnull Block block, @Nullable BlockState previousBlock, @Nullable MetadataEntry metadata) {
        this(datetime, actor, action, block.getState(), previousBlock, metadata);
    }

    public BlockRowEntry(@Nonnegative long datetime, @Nonnull String actor, @Nonnull BlockAction action, @Nonnull BlockState blockState) {
        this(datetime, actor, action, blockState, null, null);
    }

    public BlockRowEntry(@Nonnegative long datetime, @Nonnull String actor, @Nonnull BlockAction action, @Nonnull BlockState blockState, @Nullable BlockState previousBlock) {
        this(datetime, actor, action, blockState, previousBlock, null);
    }

    public BlockRowEntry(@Nonnegative long datetime, @Nonnull String actor, @Nonnull BlockAction action, @Nonnull BlockState blockState, @Nullable MetadataEntry metadata) {
        this(datetime, actor, action, blockState, null, metadata);
    }

    public BlockRowEntry(@Nonnegative long datetime, @Nonnull String actor, @Nonnull BlockAction action, @Nonnull BlockState blockState, @Nullable BlockState previousBlock, @Nullable MetadataEntry metadata) {
        super(datetime, actor, action, blockState.getWorld().getName(), blockState.getX(), blockState.getY(), blockState.getZ());

        this.block = blockState;
        this.previousBlock = previousBlock;
        this.metadata = metadata;
    }
}
