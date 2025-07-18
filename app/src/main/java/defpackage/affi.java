package defpackage;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class affi extends affp implements Closeable {
    public final afft a;
    public ScheduledFuture b;
    private final affp h;
    private ArrayList i;
    private affj j;
    private Throwable k;
    private boolean l;

    public affi(affp affpVar) {
        super(affpVar, affpVar.f);
        this.a = affpVar.b();
        this.h = new affp(this, this.f);
    }

    @Override // defpackage.affp
    public final affp a() {
        return this.h.a();
    }

    @Override // defpackage.affp
    public final afft b() {
        return this.a;
    }

    @Override // defpackage.affp
    public final Throwable c() {
        if (i()) {
            return this.k;
        }
        return null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        j(null);
    }

    @Override // defpackage.affp
    public final void d(affj affjVar, Executor executor) {
        l(executor, "executor");
        e(new affl(executor, affjVar, this));
    }

    public final void e(affl afflVar) {
        synchronized (this) {
            if (i()) {
                afflVar.a();
            } else {
                ArrayList arrayList = this.i;
                if (arrayList == null) {
                    ArrayList arrayList2 = new ArrayList();
                    this.i = arrayList2;
                    arrayList2.add(afflVar);
                    affi affiVar = this.e;
                    if (affiVar != null) {
                        this.j = new affg(this);
                        affiVar.e(new affl(affk.a, this.j, this));
                    }
                } else {
                    arrayList.add(afflVar);
                }
            }
        }
    }

    @Override // defpackage.affp
    public final void f(affp affpVar) {
        this.h.f(affpVar);
    }

    @Override // defpackage.affp
    public final void g(affj affjVar) {
        h(affjVar, this);
    }

    public final void h(affj affjVar, affp affpVar) {
        synchronized (this) {
            ArrayList arrayList = this.i;
            if (arrayList != null) {
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    affl afflVar = (affl) this.i.get(size);
                    if (afflVar.a == affjVar && afflVar.b == affpVar) {
                        this.i.remove(size);
                        break;
                    }
                }
                if (this.i.isEmpty()) {
                    affi affiVar = this.e;
                    if (affiVar != null) {
                        affiVar.h(this.j, affiVar);
                    }
                    this.j = null;
                    this.i = null;
                }
            }
        }
    }

    @Override // defpackage.affp
    public final boolean i() {
        synchronized (this) {
            if (this.l) {
                return true;
            }
            if (!super.i()) {
                return false;
            }
            j(super.c());
            return true;
        }
    }

    public final void j(Throwable th) {
        int i;
        boolean z;
        ScheduledFuture scheduledFuture;
        synchronized (this) {
            if (this.l) {
                z = false;
                scheduledFuture = null;
            } else {
                z = true;
                this.l = true;
                scheduledFuture = this.b;
                if (scheduledFuture != null) {
                    this.b = null;
                } else {
                    scheduledFuture = null;
                }
                this.k = th;
            }
        }
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        if (z) {
            synchronized (this) {
                ArrayList arrayList = this.i;
                if (arrayList == null) {
                    return;
                }
                affj affjVar = this.j;
                this.j = null;
                this.i = null;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    affl afflVar = (affl) arrayList.get(i2);
                    if (afflVar.b == this) {
                        afflVar.a();
                    }
                }
                int size2 = arrayList.size();
                for (i = 0; i < size2; i++) {
                    affl afflVar2 = (affl) arrayList.get(i);
                    if (afflVar2.b != this) {
                        afflVar2.a();
                    }
                }
                affi affiVar = this.e;
                if (affiVar != null) {
                    affiVar.h(affjVar, affiVar);
                }
            }
        }
    }

    public affi(affp affpVar, afft afftVar) {
        super(affpVar, affpVar.f);
        this.a = afftVar;
        this.h = new affp(this, this.f);
    }
}
