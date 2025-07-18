package com.google.common.collect;

import com.google.common.collect.CollectCollectors;
import j$.util.function.BiFunction$CC;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class CollectCollectors$$ExternalSyntheticLambda48 implements BinaryOperator {
    public /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        return ((CollectCollectors.EnumMapAccumulator) obj).combine((CollectCollectors.EnumMapAccumulator) obj2);
    }
}
