package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agll extends agoe {
    final agfr a;
    final AtomicReference b;
    final agfr c;

    public agll(agfr agfrVar, agfr agfrVar2, AtomicReference atomicReference) {
        this.c = agfrVar;
        this.a = agfrVar2;
        this.b = atomicReference;
    }

    public final void a(aggi aggiVar) {
        aglc.a(this.b, (agli) aggiVar, null);
    }

    @Override // defpackage.agfo
    protected final void n(agfs agfsVar) {
        this.c.m(agfsVar);
    }
}
