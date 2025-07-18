package defpackage;

import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zxi implements Runnable {
    zyd a;
    Future b;

    public zxi(zyd zydVar, Future future) {
        this.a = zydVar;
        this.b = future;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zxn.q(this.a, this.b);
        this.a = null;
        this.b = null;
    }
}
