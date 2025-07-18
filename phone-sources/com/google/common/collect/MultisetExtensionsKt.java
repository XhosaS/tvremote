package com.google.common.collect;

import defpackage.yfp;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class MultisetExtensionsKt {
    public static final /* synthetic */ int get(Multiset multiset, Object obj) {
        multiset.getClass();
        return multiset.count(obj);
    }

    @yfp
    public static final /* synthetic */ int getAny(Multiset multiset, Object obj) {
        multiset.getClass();
        return multiset.count(obj);
    }

    public static final /* synthetic */ void set(Multiset multiset, Object obj, int i) {
        multiset.getClass();
        multiset.setCount(obj, i);
    }
}
