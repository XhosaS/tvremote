package com.google.common.collect;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class CollectCollectors$$ExternalSyntheticLambda45 implements Consumer {
    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        obj.getClass();
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
