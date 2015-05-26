package com.amshulman.insight.action;

public abstract class ItemAction extends InsightAction {

    public static abstract class ItemRollbackAction extends RollbackAction<ItemAction> {}
}
