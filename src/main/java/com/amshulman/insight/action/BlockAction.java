package com.amshulman.insight.action;

public abstract class BlockAction extends InsightAction {

    public static abstract class BlockRollbackAction extends RollbackAction<BlockAction> {}
}
