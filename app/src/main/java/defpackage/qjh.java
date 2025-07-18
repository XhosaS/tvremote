package defpackage;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
class qjh implements Consumer {
    @Override // java.util.function.Consumer
    public final /* synthetic */ void accept(Object obj) {
        ((qjo) obj).e();
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
