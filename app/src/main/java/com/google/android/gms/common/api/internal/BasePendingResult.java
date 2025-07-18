package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import defpackage.kev;
import defpackage.kex;
import defpackage.key;
import defpackage.kez;
import defpackage.kfc;
import defpackage.kfd;
import defpackage.kga;
import defpackage.kgb;
import defpackage.kgc;
import defpackage.kgv;
import defpackage.kie;
import defpackage.kif;
import defpackage.kjx;
import defpackage.kkk;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class BasePendingResult extends key {
    public static final ThreadLocal b = new kga();
    private final ArrayList a;
    public final Object c;
    protected final kgb d;
    public final CountDownLatch e;
    public kfc f;
    public volatile boolean g;
    public volatile kie h;
    public boolean i;
    public kjx j;
    private kfd k;
    private final AtomicReference l;
    private Status m;
    private boolean n;
    private boolean o;
    private kgc resultGuardian;

    @Deprecated
    BasePendingResult() {
        this.c = new Object();
        this.e = new CountDownLatch(1);
        this.a = new ArrayList();
        this.l = new AtomicReference();
        this.i = false;
        this.d = new kgb(Looper.getMainLooper());
        new WeakReference(null);
    }

    private final void b(kfc kfcVar) {
        this.f = kfcVar;
        this.m = kfcVar.b();
        this.j = null;
        this.e.countDown();
        if (this.n) {
            this.k = null;
        } else {
            kfd kfdVar = this.k;
            if (kfdVar != null) {
                kgb kgbVar = this.d;
                kgbVar.removeMessages(2);
                kgbVar.a(kfdVar, j());
            } else if (this.f instanceof kez) {
                this.resultGuardian = new kgc(this);
            }
        }
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((kex) arrayList.get(i)).a(this.m);
        }
        arrayList.clear();
    }

    public static void l(kfc kfcVar) {
        if (kfcVar instanceof kez) {
            try {
                ((kez) kfcVar).a();
            } catch (RuntimeException e) {
                Log.w("BasePendingResult", "Unable to release ".concat(String.valueOf(String.valueOf(kfcVar))), e);
            }
        }
    }

    protected abstract kfc a(Status status);

    @Override // defpackage.key
    public final void d(kex kexVar) {
        synchronized (this.c) {
            if (n()) {
                kexVar.a(this.m);
            } else {
                this.a.add(kexVar);
            }
        }
    }

    @Override // defpackage.key
    public final void e() {
        synchronized (this.c) {
            if (!this.n && !this.g) {
                kjx kjxVar = this.j;
                if (kjxVar != null) {
                    try {
                        kjxVar.K(2, kjxVar.a());
                    } catch (RemoteException unused) {
                    }
                }
                l(this.f);
                this.n = true;
                b(a(Status.e));
            }
        }
    }

    @Override // defpackage.key
    public final void f(kfd kfdVar, TimeUnit timeUnit) {
        boolean z;
        Object obj = this.c;
        synchronized (obj) {
            kkk.g(!this.g, "Result has already been consumed.");
            synchronized (obj) {
                z = this.n;
            }
        }
        if (z) {
            return;
        }
        if (n()) {
            this.d.a(kfdVar, j());
        } else {
            this.k = kfdVar;
            kgb kgbVar = this.d;
            kgbVar.sendMessageDelayed(kgbVar.obtainMessage(2, this), timeUnit.toMillis(3L));
        }
    }

    public final kfc j() {
        kfc kfcVar;
        synchronized (this.c) {
            kkk.g(!this.g, "Result has already been consumed.");
            kkk.g(n(), "Result is not ready.");
            kfcVar = this.f;
            this.f = null;
            this.k = null;
            this.g = true;
        }
        kif kifVar = (kif) this.l.getAndSet(null);
        if (kifVar != null) {
            kifVar.a();
        }
        kkk.k(kfcVar);
        return kfcVar;
    }

    @Deprecated
    public final void k(Status status) {
        synchronized (this.c) {
            if (!n()) {
                m(a(status));
                this.o = true;
            }
        }
    }

    public final void m(kfc kfcVar) {
        synchronized (this.c) {
            if (this.o || this.n) {
                l(kfcVar);
                return;
            }
            n();
            kkk.g(!n(), "Results have already been set");
            kkk.g(!this.g, "Result has already been consumed");
            b(kfcVar);
        }
    }

    public final boolean n() {
        return this.e.getCount() == 0;
    }

    protected BasePendingResult(kev kevVar) {
        this.c = new Object();
        this.e = new CountDownLatch(1);
        this.a = new ArrayList();
        this.l = new AtomicReference();
        this.i = false;
        this.d = new kgb(((kgv) kevVar).a.h);
        new WeakReference(kevVar);
    }
}
