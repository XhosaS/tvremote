package defpackage;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class txx implements Consumer {
    public final /* synthetic */ abwk a;
    public final /* synthetic */ Object b;

    public /* synthetic */ txx(abwk abwkVar, Object obj) {
        this.a = abwkVar;
        this.b = obj;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        ((adka) obj).f(this.a, this.b);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
