package defpackage;

import defpackage.ehi;
import defpackage.ehk;
import defpackage.ehm;
import java.util.ArrayDeque;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class eho<I extends ehk, O extends ehm, E extends ehi> implements ehh<I, O, E> {
    private final Thread a;
    private final ehk[] e;
    private final ehm[] f;
    private int g;
    private int h;
    private ehk i;
    private ehi j;
    private boolean k;
    private boolean l;
    private int m;
    private final Object b = new Object();
    private long n = -9223372036854775807L;
    private final ArrayDeque c = new ArrayDeque();
    private final ArrayDeque d = new ArrayDeque();

    protected eho(ehk[] ehkVarArr, ehm[] ehmVarArr) {
        this.e = ehkVarArr;
        this.g = ehkVarArr.length;
        for (int i = 0; i < this.g; i++) {
            this.e[i] = j();
        }
        this.f = ehmVarArr;
        this.h = ehmVarArr.length;
        for (int i2 = 0; i2 < this.h; i2++) {
            this.f[i2] = l();
        }
        ehn ehnVar = new ehn(this);
        this.a = ehnVar;
        ehnVar.start();
    }

    private final void s() {
        if (v()) {
            this.b.notify();
        }
    }

    private final void t() throws ehi {
        ehi ehiVar = this.j;
        if (ehiVar != null) {
            throw ehiVar;
        }
    }

    private final void u(ehk ehkVar) {
        ehkVar.clear();
        int i = this.g;
        this.g = i + 1;
        this.e[i] = ehkVar;
    }

    private final boolean v() {
        return !this.c.isEmpty() && this.h > 0;
    }

    @Override // defpackage.ehh
    public final void d() {
        synchronized (this.b) {
            this.k = true;
            this.m = 0;
            ehk ehkVar = this.i;
            if (ehkVar != null) {
                u(ehkVar);
                this.i = null;
            }
            while (true) {
                ArrayDeque arrayDeque = this.c;
                if (arrayDeque.isEmpty()) {
                    break;
                } else {
                    u((ehk) arrayDeque.removeFirst());
                }
            }
            while (true) {
                ArrayDeque arrayDeque2 = this.d;
                if (!arrayDeque2.isEmpty()) {
                    ((ehm) arrayDeque2.removeFirst()).release();
                }
            }
        }
    }

    @Override // defpackage.ehh
    public void f() throws InterruptedException {
        Object obj = this.b;
        synchronized (obj) {
            this.l = true;
            obj.notify();
        }
        try {
            this.a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // defpackage.ehh
    public final void g(long j) {
        synchronized (this.b) {
            boolean z = true;
            if (this.g != this.e.length && !this.k) {
                z = false;
            }
            a.ab(z);
            this.n = j;
        }
    }

    protected abstract ehi h(Throwable th);

    protected abstract ehi i(ehk ehkVar, ehm ehmVar, boolean z);

    protected abstract ehk j();

    @Override // defpackage.ehh
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final ehk a() {
        ehk ehkVar;
        synchronized (this.b) {
            t();
            a.ab(this.i == null);
            int i = this.g;
            if (i == 0) {
                ehkVar = null;
            } else {
                ehk[] ehkVarArr = this.e;
                int i2 = i - 1;
                this.g = i2;
                ehkVar = ehkVarArr[i2];
            }
            this.i = ehkVar;
        }
        return ehkVar;
    }

    protected abstract ehm l();

    @Override // defpackage.ehh
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final ehm b() {
        synchronized (this.b) {
            t();
            ArrayDeque arrayDeque = this.d;
            if (arrayDeque.isEmpty()) {
                return null;
            }
            return (ehm) arrayDeque.removeFirst();
        }
    }

    @Override // defpackage.ehh
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public final void e(ehk ehkVar) {
        synchronized (this.b) {
            t();
            a.H(ehkVar == this.i);
            this.c.addLast(ehkVar);
            s();
            this.i = null;
        }
    }

    public final void o(ehm ehmVar) {
        synchronized (this.b) {
            ehmVar.clear();
            ehm[] ehmVarArr = this.f;
            int i = this.h;
            this.h = i + 1;
            ehmVarArr[i] = ehmVar;
            s();
        }
    }

    protected final void p(int i) {
        int i2 = this.g;
        ehk[] ehkVarArr = this.e;
        a.ab(i2 == ehkVarArr.length);
        for (ehk ehkVar : ehkVarArr) {
            ehkVar.a(i);
        }
    }

    public final boolean q() {
        ehi ehiVarH;
        Object obj = this.b;
        synchronized (obj) {
            while (!this.l && !v()) {
                obj.wait();
            }
            if (this.l) {
                return false;
            }
            ehk ehkVar = (ehk) this.c.removeFirst();
            ehm[] ehmVarArr = this.f;
            int i = this.h - 1;
            this.h = i;
            ehm ehmVar = ehmVarArr[i];
            boolean z = this.k;
            this.k = false;
            if (ehkVar.isEndOfStream()) {
                ehmVar.addFlag(4);
            } else {
                ehmVar.timeUs = ehkVar.e;
                if (ehkVar.isFirstSample()) {
                    ehmVar.addFlag(134217728);
                }
                if (!r(ehkVar.e)) {
                    ehmVar.shouldBeSkipped = true;
                }
                try {
                    ehiVarH = i(ehkVar, ehmVar, z);
                } catch (OutOfMemoryError e) {
                    ehiVarH = h(e);
                } catch (RuntimeException e2) {
                    ehiVarH = h(e2);
                }
                if (ehiVarH != null) {
                    synchronized (this.b) {
                        this.j = ehiVarH;
                    }
                    return false;
                }
            }
            synchronized (this.b) {
                if (this.k) {
                    ehmVar.release();
                } else if (ehmVar.shouldBeSkipped) {
                    this.m++;
                    ehmVar.release();
                } else {
                    ehmVar.skippedOutputBufferCount = this.m;
                    this.m = 0;
                    this.d.addLast(ehmVar);
                }
                u(ehkVar);
            }
            return true;
        }
    }

    protected final boolean r(long j) {
        boolean z;
        synchronized (this.b) {
            long j2 = this.n;
            z = true;
            if (j2 != -9223372036854775807L && j < j2) {
                z = false;
            }
        }
        return z;
    }
}
