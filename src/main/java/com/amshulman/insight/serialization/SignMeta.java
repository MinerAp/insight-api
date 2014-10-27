package com.amshulman.insight.serialization;

import lombok.Value;

@Value
public class SignMeta implements MetadataEntry {

    private static final long serialVersionUID = -8469700940869251354L;

    String[] text;
}
