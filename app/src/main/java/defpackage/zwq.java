package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
class zwq implements zvh {
    final /* synthetic */ Callable a;

    public zwq(Callable callable) {
        this.a = callable;
    }

    @Override // defpackage.zvh
    public final zyd a() {
        return zxn.h(this.a.call());
    }

    public final String toString() {
        return this.a.toString();
    }
}
