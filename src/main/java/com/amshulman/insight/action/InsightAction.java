package com.amshulman.insight.action;

import com.amshulman.insight.results.InsightRecord;

public interface InsightAction {

    String getName();

    String getFriendlyDescription();

    <T extends InsightAction> RollbackAction<T> getRollbackAction();

    public static abstract class RollbackAction<T extends InsightAction> {
        public abstract boolean rollback(InsightRecord<T> rowEntry, boolean force);
    }
}
