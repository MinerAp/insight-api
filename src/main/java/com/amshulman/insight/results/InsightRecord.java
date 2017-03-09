package com.amshulman.insight.results;

import java.time.LocalDateTime;

import lombok.Value;

import com.amshulman.insight.action.InsightAction;
import com.amshulman.insight.action.InsightAction.RollbackAction;
import com.amshulman.insight.action.InsightAction.RollbackActionStatus;
import com.amshulman.insight.serialization.StorageMetadata;
import com.amshulman.insight.types.InsightLocation;
import com.amshulman.insight.types.InsightMaterial;

@Value
public class InsightRecord<T extends InsightAction> {
    private final LocalDateTime datetime;
    private final String actor;
    private final T action;
    private final InsightLocation location;
    private final InsightMaterial material;
    private final String actee;
    private final StorageMetadata metadata;

    public RollbackActionStatus rollback(boolean force) {
        RollbackAction<T> rollbackAction = action.getRollbackAction();
        return rollbackAction.rollback(this, force);
    }
}
