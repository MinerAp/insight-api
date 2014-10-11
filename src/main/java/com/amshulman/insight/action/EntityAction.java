package com.amshulman.insight.action;

public interface EntityAction extends InsightAction {

    public static abstract class EntityRollbackAction extends RollbackAction<EntityAction> {}
}
