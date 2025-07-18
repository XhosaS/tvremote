package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
class yzz extends yxo {
    final /* synthetic */ Iterable a;
    final /* synthetic */ yqx b;

    public yzz(Iterable iterable, yqx yqxVar) {
        this.a = iterable;
        this.b = yqxVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return zar.c(this.a.iterator(), this.b);
    }
}
