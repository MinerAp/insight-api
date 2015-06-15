package com.amshulman.insight.action;

import com.amshulman.insight.results.InsightRecord;

public abstract class InsightAction {

    public abstract String getName();

    public abstract String getFriendlyDescription();

    public abstract <T extends InsightAction> RollbackAction<T> getRollbackAction();

    public static abstract class RollbackAction<T extends InsightAction> {
        public abstract RollbackActionStatus rollback(InsightRecord<T> rowEntry, boolean force);
    }

    public enum RollbackActionStatus {
        /*
         * If the rollback operation succeeded
         */
        OK,

        /*
         * If the rollback is unnecessary
         */
        SKIPPED,

        /*
         * If the rollback operation was impossible
         */
        FAILED,

        /*
         * If the plugin that registered the action is not available. Plugins should not return this status.
         */
        NO_ACTION_AVAILABLE,
    }
}
