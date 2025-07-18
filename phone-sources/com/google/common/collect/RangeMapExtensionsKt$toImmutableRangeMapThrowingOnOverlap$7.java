package com.google.common.collect;

import defpackage.yih;
import defpackage.yiv;
import java.lang.Comparable;

/* compiled from: PG */
/* loaded from: classes.dex */
final class RangeMapExtensionsKt$toImmutableRangeMapThrowingOnOverlap$7<K extends Comparable<? super K>, V> extends yiv {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    public RangeMapExtensionsKt$toImmutableRangeMapThrowingOnOverlap$7(yih<? super RangeMapExtensionsKt$toImmutableRangeMapThrowingOnOverlap$7> yihVar) {
        super(yihVar);
    }

    @Override // defpackage.yit
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return RangeMapExtensionsKt.flowOfEntriesToImmutableRangeMapThrowingOnOverlap(null, this);
    }
}
