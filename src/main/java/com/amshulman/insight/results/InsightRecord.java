package com.amshulman.insight.results;

import java.util.Date;

import lombok.Value;

import com.amshulman.insight.action.InsightAction;
import com.amshulman.insight.action.InsightAction.RollbackAction;
import com.amshulman.insight.serialization.StorageMetadata;
import com.amshulman.insight.types.InsightLocation;
import com.amshulman.insight.types.InsightMaterial;

@Value
public class InsightRecord<T extends InsightAction> {
    private final Date datetime;
    private final String actor;
    private final T action;
    private final InsightLocation location;
    private final InsightMaterial material;
    private final String actee;
    private final StorageMetadata metadata;

    public boolean rollback(boolean force) {
        RollbackAction<T> rollbackAction = action.getRollbackAction();

        if (rollbackAction == null) { // DEBUG
            System.out.println(action + " has no defined rollback method. Skipping " + toString());
            return false;
        }

        return rollbackAction.rollback(this, force);
    }
}
