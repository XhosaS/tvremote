package com.google.common.collect;

import com.google.common.collect.CollectCollectors;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class CollectCollectors$$ExternalSyntheticLambda49 implements Function {
    @Override // java.util.function.Function
    /* renamed from: andThen */
    public /* synthetic */ Function mo439andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return ((CollectCollectors.EnumMapAccumulator) obj).toImmutableMap();
    }

    public /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
