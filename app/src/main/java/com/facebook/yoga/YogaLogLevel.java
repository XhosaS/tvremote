package com.facebook.yoga;

import defpackage.a;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum YogaLogLevel {
    ERROR,
    WARN,
    INFO,
    DEBUG,
    VERBOSE,
    FATAL;

    public static YogaLogLevel fromInt(int i) {
        if (i == 0) {
            return ERROR;
        }
        if (i == 1) {
            return WARN;
        }
        if (i == 2) {
            return INFO;
        }
        if (i == 3) {
            return DEBUG;
        }
        if (i == 4) {
            return VERBOSE;
        }
        if (i == 5) {
            return FATAL;
        }
        throw new IllegalArgumentException(a.b(i, "Unknown enum value: "));
    }
}
