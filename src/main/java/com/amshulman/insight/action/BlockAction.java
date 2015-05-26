package com.amshulman.insight.action;

public abstract class BlockAction extends InsightAction {

    @Override
    @SuppressWarnings("unchecked")
    public abstract BlockRollbackAction getRollbackAction();

    public static abstract class BlockRollbackAction extends RollbackAction<BlockAction> {}
}
