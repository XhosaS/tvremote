package com.google.common.collect;

import defpackage.yih;
import defpackage.yiv;
import java.lang.Comparable;

/* compiled from: PG */
/* loaded from: classes.dex */
final class RangeMapExtensionsKt$toImmutableRangeMapAcceptingOverlap$2<K extends Comparable<? super K>, V> extends yiv {
    int label;
    /* synthetic */ Object result;

    public RangeMapExtensionsKt$toImmutableRangeMapAcceptingOverlap$2(yih<? super RangeMapExtensionsKt$toImmutableRangeMapAcceptingOverlap$2> yihVar) {
        super(yihVar);
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return RangeMapExtensionsKt.flowOfEntriesToImmutableRangeMapAcceptingOverlap(null, this);
    }
}
