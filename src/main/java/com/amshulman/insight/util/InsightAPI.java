package com.amshulman.insight.util;

import javax.annotation.Nonnull;

import com.amshulman.insight.row.RowEntry;

public interface InsightAPI {

    public void logEvent(@Nonnull RowEntry row);
}