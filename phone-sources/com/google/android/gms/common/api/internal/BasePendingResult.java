package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import defpackage.nwu;
import defpackage.nww;
import defpackage.nwx;
import defpackage.nwz;
import defpackage.nxc;
import defpackage.nxd;
import defpackage.nxe;
import defpackage.nxv;
import defpackage.nxw;
import defpackage.nxx;
import defpackage.oah;
import defpackage.obn;
import defpackage.ocv;
import defpackage.pku;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class BasePendingResult<R extends nxc> extends nwx<R> {
    static final ThreadLocal i = new nxv();
    public static final /* synthetic */ int p = 0;
    private final CountDownLatch a;
    private final ArrayList b;
    private nxd c;
    private final AtomicReference d;
    private Status e;
    private volatile boolean f;
    private boolean g;
    private boolean h;
    public final Object j;
    protected final nxw k;
    public final WeakReference l;
    public nxc m;
    public boolean n;
    public obn o;
    private volatile nxe q;
    private nxx resultGuardian;

    @Deprecated
    BasePendingResult() {
        this.j = new Object();
        this.a = new CountDownLatch(1);
        this.b = new ArrayList();
        this.d = new AtomicReference();
        this.n = false;
        this.k = new nxw(Looper.getMainLooper());
        this.l = new WeakReference(null);
    }

    private final nxc b() {
        nxc nxcVar;
        synchronized (this.j) {
            ocv.aA(!this.f, "Result has already been consumed.");
            ocv.aA(s(), "Result is not ready.");
            nxcVar = this.m;
            this.m = null;
            this.c = null;
            this.f = true;
        }
        pku pkuVar = (pku) this.d.getAndSet(null);
        if (pkuVar != null) {
            ((oah) pkuVar.a).b.remove(this);
        }
        ocv.aF(nxcVar);
        return nxcVar;
    }

    public static void p(nxc nxcVar) {
        if (nxcVar instanceof nwz) {
            try {
                ((nwz) nxcVar).a();
            } catch (RuntimeException e) {
                Log.w("BasePendingResult", "Unable to release ".concat(String.valueOf(String.valueOf(nxcVar))), e);
            }
        }
    }

    private final void u(nxc nxcVar) {
        this.m = nxcVar;
        this.e = nxcVar.e();
        this.o = null;
        this.a.countDown();
        if (this.g) {
            this.c = null;
        } else {
            nxd nxdVar = this.c;
            if (nxdVar != null) {
                nxw nxwVar = this.k;
                nxwVar.removeMessages(2);
                nxwVar.a(nxdVar, b());
            } else if (this.m instanceof nwz) {
                this.resultGuardian = new nxx(this);
            }
        }
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((nww) arrayList.get(i2)).a(this.e);
        }
        arrayList.clear();
    }

    protected abstract nxc a(Status status);

    @Override // defpackage.nwx
    public final void g(nww nwwVar) {
        ocv.au(true, "Callback cannot be null.");
        synchronized (this.j) {
            if (s()) {
                nwwVar.a(this.e);
            } else {
                this.b.add(nwwVar);
            }
        }
    }

    @Override // defpackage.nwx
    public final void h() {
        synchronized (this.j) {
            if (!this.g && !this.f) {
                obn obnVar = this.o;
                if (obnVar != null) {
                    try {
                        obnVar.n(2, obnVar.k());
                    } catch (RemoteException unused) {
                    }
                }
                p(this.m);
                this.g = true;
                u(a(Status.e));
            }
        }
    }

    @Override // defpackage.nwx
    public final void i(nxd nxdVar) {
        synchronized (this.j) {
            ocv.aA(!this.f, "Result has already been consumed.");
            ocv.aA(true, "Cannot set callbacks if then() has been called.");
            if (r()) {
                return;
            }
            if (s()) {
                this.k.a(nxdVar, b());
            } else {
                this.c = nxdVar;
            }
        }
    }

    @Override // defpackage.nwx
    public final void j(TimeUnit timeUnit) {
        ocv.aA(!this.f, "Result has already been consumed.");
        ocv.aA(true, "Cannot await if then() has been called.");
        try {
            if (!this.a.await(0L, timeUnit)) {
                n(Status.d);
            }
        } catch (InterruptedException unused) {
            n(Status.b);
        }
        ocv.aA(s(), "Result is not ready.");
        b();
    }

    @Override // defpackage.nwx
    public final void k(nxd nxdVar, TimeUnit timeUnit) {
        synchronized (this.j) {
            ocv.aA(!this.f, "Result has already been consumed.");
            ocv.aA(true, "Cannot set callbacks if then() has been called.");
            if (r()) {
                return;
            }
            if (s()) {
                this.k.a(nxdVar, b());
            } else {
                this.c = nxdVar;
                nxw nxwVar = this.k;
                nxwVar.sendMessageDelayed(nxwVar.obtainMessage(2, this), timeUnit.toMillis(3L));
            }
        }
    }

    @Deprecated
    public final void n(Status status) {
        synchronized (this.j) {
            if (!s()) {
                q(a(status));
                this.h = true;
            }
        }
    }

    public final void o() {
        boolean z = true;
        if (!this.n && !((Boolean) i.get()).booleanValue()) {
            z = false;
        }
        this.n = z;
    }

    public final void q(nxc nxcVar) {
        synchronized (this.j) {
            if (this.h || this.g) {
                p(nxcVar);
                return;
            }
            s();
            ocv.aA(!s(), "Results have already been set");
            ocv.aA(!this.f, "Result has already been consumed");
            u(nxcVar);
        }
    }

    public final boolean r() {
        boolean z;
        synchronized (this.j) {
            z = this.g;
        }
        return z;
    }

    public final boolean s() {
        return this.a.getCount() == 0;
    }

    public final void t(pku pkuVar) {
        this.d.set(pkuVar);
    }

    protected BasePendingResult(nwu nwuVar) {
        this.j = new Object();
        this.a = new CountDownLatch(1);
        this.b = new ArrayList();
        this.d = new AtomicReference();
        this.n = false;
        this.k = new nxw(nwuVar != null ? nwuVar.a() : Looper.getMainLooper());
        this.l = new WeakReference(nwuVar);
    }
}
