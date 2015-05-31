package com.amshulman.insight.action;

import com.amshulman.insight.results.InsightRecord;

public abstract class InsightAction {

    public abstract String getName();

    public abstract  String getFriendlyDescription();

    public abstract <T extends InsightAction> RollbackAction<T> getRollbackAction();

    public static abstract class RollbackAction<T extends InsightAction> {
        public abstract RollbackActionStatus rollback(InsightRecord<T> rowEntry, boolean force);
    }

    public enum RollbackActionStatus {
        OK,
        SKIPPED,
        NO_ACTION_AVAILABLE,
        FAILED,
    }
}
