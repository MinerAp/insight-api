package com.amshulman.insight.action;

import com.amshulman.insight.results.InsightRecord;

public abstract class InsightAction {

    public abstract String getName();

    public abstract  String getFriendlyDescription();

    public abstract <T extends InsightAction> RollbackAction<T> getRollbackAction();

    public static abstract class RollbackAction<T extends InsightAction> {
        public abstract boolean rollback(InsightRecord<T> rowEntry, boolean force);
    }
}
