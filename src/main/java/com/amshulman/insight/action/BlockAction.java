package com.amshulman.insight.action;

public interface BlockAction extends InsightAction {

    public static abstract class BlockRollbackAction extends RollbackAction<BlockAction> {}
}
