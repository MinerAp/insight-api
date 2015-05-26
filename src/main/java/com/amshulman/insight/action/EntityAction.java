package com.amshulman.insight.action;

public abstract class EntityAction extends InsightAction {

    @Override
    @SuppressWarnings("unchecked")
    public abstract EntityRollbackAction getRollbackAction();

    public static abstract class EntityRollbackAction extends RollbackAction<EntityAction> {}
}
