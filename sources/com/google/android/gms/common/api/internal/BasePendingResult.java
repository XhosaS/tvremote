package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import defpackage.age;
import defpackage.agf;
import defpackage.agg;
import defpackage.agi;
import defpackage.agv;
import defpackage.agw;
import defpackage.agz;
import defpackage.qn;
import defpackage.qp;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class BasePendingResult extends qn {
    public static final ThreadLocal b = new agv();
    public agi f;
    public volatile boolean g;
    public volatile qn i;
    private Status j;
    private boolean k;
    public final Object c = new Object();
    public final CountDownLatch d = new CountDownLatch(1);
    private final ArrayList a = new ArrayList();
    public final AtomicReference e = new AtomicReference();
    public boolean h = false;

    @Deprecated
    BasePendingResult() {
        new agw(Looper.getMainLooper());
        new WeakReference(null);
    }

    public static void n(agi agiVar) {
        if (agiVar instanceof agg) {
            try {
                ((agg) agiVar).a();
            } catch (RuntimeException e) {
                Log.w("BasePendingResult", "Unable to release ".concat(String.valueOf(String.valueOf(agiVar))), e);
            }
        }
    }

    @Override // defpackage.qn
    public final void e(agf agfVar) {
        qp.k(true, "Callback cannot be null.");
        synchronized (this.c) {
            if (p()) {
                agfVar.a(this.j);
            } else {
                this.a.add(agfVar);
            }
        }
    }

    @Deprecated
    public final void m(Status status) {
        synchronized (this.c) {
            if (!p()) {
                o(status);
                this.k = true;
            }
        }
    }

    public final void o(agi agiVar) {
        synchronized (this.c) {
            if (this.k) {
                n(agiVar);
                return;
            }
            p();
            qp.n(!p(), "Results have already been set");
            qp.n(!this.g, "Result has already been consumed");
            this.f = agiVar;
            this.j = (Status) agiVar;
            this.d.countDown();
            ArrayList arrayList = this.a;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((agf) arrayList.get(i)).a(this.j);
            }
            arrayList.clear();
        }
    }

    public final boolean p() {
        return this.d.getCount() == 0;
    }

    protected BasePendingResult(age ageVar) {
        new agw(((agz) ageVar).a.f);
        new WeakReference(ageVar);
    }
}
