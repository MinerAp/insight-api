package com.amshulman.insight.action;

public abstract class ItemAction extends InsightAction {

    @Override
    @SuppressWarnings("unchecked")
    public abstract ItemRollbackAction getRollbackAction();

    public static abstract class ItemRollbackAction extends RollbackAction<ItemAction> {}
}
