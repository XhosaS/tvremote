package defpackage;

import android.content.Context;
import android.os.PowerManager;
import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gsk implements gsx, gvx {
    public final Context a;
    public final int b;
    public final gun c;
    public final gso d;
    public int e;
    public final Executor f;
    public final Executor g;
    public PowerManager.WakeLock h;
    public boolean i;
    public final yot j;
    public volatile yqe k;
    public final cb l;
    public final cb m;
    private final Object n;

    static {
        gpn.a("DelayMetCommandHandler");
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.concurrent.Executor] */
    public gsk(Context context, int i, gso gsoVar, cb cbVar) {
        this.a = context;
        this.b = i;
        this.d = gsoVar;
        this.c = (gun) cbVar.a;
        this.m = cbVar;
        gag gagVar = gsoVar.e.i;
        isy isyVar = gsoVar.k;
        this.f = isyVar.c;
        this.g = isyVar.a;
        this.j = (yot) isyVar.d;
        this.l = new cb(gagVar);
        this.i = false;
        this.e = 0;
        this.n = new Object();
    }

    public final void a() {
        synchronized (this.n) {
            if (this.k != null) {
                this.k.t(null);
            }
            gvy gvyVar = this.d.c;
            gun gunVar = this.c;
            gvyVar.a(gunVar);
            PowerManager.WakeLock wakeLock = this.h;
            if (wakeLock != null && wakeLock.isHeld()) {
                gpn.b();
                Objects.toString(this.h);
                Objects.toString(gunVar);
                this.h.release();
            }
        }
    }

    @Override // defpackage.gvx
    public final void b(gun gunVar) {
        gpn.b();
        Objects.toString(gunVar);
        gunVar.toString();
        this.f.execute(new gfe(this, 9));
    }

    @Override // defpackage.gsx
    public final void e(guw guwVar, fki fkiVar) {
        if (fkiVar instanceof gss) {
            this.f.execute(new gfe(this, 10));
        } else {
            this.f.execute(new gfe(this, 9));
        }
    }
}
