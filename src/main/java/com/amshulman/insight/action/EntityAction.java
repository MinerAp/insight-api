package com.amshulman.insight.action;

public abstract class EntityAction extends InsightAction {

    public static abstract class EntityRollbackAction extends RollbackAction<EntityAction> {}
}
