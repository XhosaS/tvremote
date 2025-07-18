package defpackage;

import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nux {
    private static nux d;
    public final Object a;
    public final Object b;
    public Object c;
    private int e;

    public nux(mem memVar, kwy kwyVar) {
        this.b = memVar;
        this.a = kwyVar;
    }

    public static synchronized nux a(Context context) {
        if (d == null) {
            ocv ocvVar = ogg.a;
            d = new nux(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new ocy("MessengerIpcClient", 0))));
        }
        return d;
    }

    private final synchronized int f() {
        int i;
        i = this.e;
        this.e = i + 1;
        return i;
    }

    private final synchronized onz g(nuu nuuVar) {
        if (!((nus) this.c).e(nuuVar)) {
            nus nusVar = new nus(this);
            this.c = nusVar;
            nusVar.e(nuuVar);
        }
        return (onz) nuuVar.d.a;
    }

    public final onz b(int i, Bundle bundle) {
        return g(new nut(f(), i, bundle));
    }

    public final onz c(int i, Bundle bundle) {
        return g(new nuw(f(), i, bundle));
    }

    public final synchronized void d(int i, llt lltVar) {
        if (i > this.e) {
            this.e = i;
            this.c = lltVar;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, mem] */
    public final synchronized void e(int i, Throwable th) {
        d(i, new llt(!this.b.d() ? 6 : ((kwy) this.a).f(th, true), -1, th, false, false, trk.a));
    }

    public nux(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.c = new nus(this);
        this.e = 1;
        this.b = scheduledExecutorService;
        this.a = context.getApplicationContext();
    }
}
