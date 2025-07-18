package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agjw extends agfo {
    final Callable a;

    public agjw(Callable callable) {
        this.a = callable;
    }

    @Override // defpackage.agfo
    public final void n(agfs agfsVar) {
        try {
            agfr agfrVar = (agfr) this.a.call();
            aghn.b(agfrVar, "null ObservableSource supplied");
            agfrVar.m(agfsVar);
        } catch (Throwable th) {
            aggq.a(th);
            aghe.e(th, agfsVar);
        }
    }
}
