package com.amshulman.insight.action;

public interface ItemAction extends InsightAction {

    public static abstract class ItemRollbackAction extends RollbackAction<ItemAction> {}
}
