package com.amshulman.insight.serialization;

import org.bukkit.block.BlockState;

import lombok.Value;

@Value
public class BlockMetadata implements StorageMetadata {

    private static final long serialVersionUID = -5864280904332125831L;

    MetadataEntry meta;
    Block rollbackMetadata;

    public BlockMetadata(MetadataEntry metadata, BlockState previousBlock) {
        meta = metadata;
        this.rollbackMetadata = previousBlock == null ? null : new Block(previousBlock.getType(), previousBlock.getRawData());
    }
}
