package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ida extends icu implements Runnable, iea, iej {
    public boolean h;
    public Object i;
    public Object j;
    private final ids k;
    private final Object[] l;
    private Thread o;
    public int g = 0;
    private int n = -1;
    private final iek m = iek.a();

    public ida(Object obj, ids idsVar, Object[] objArr) {
        this.i = obj;
        this.j = obj;
        this.k = idsVar;
        this.l = objArr;
    }

    public static void b(ieh iehVar, List list) {
        list.add(1);
        list.add(iehVar);
    }

    private final void e() {
        if (this.h) {
            this.m.obtainMessage(4, this).sendToTarget();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0019 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void f(int r8, boolean r9) {
        /*
            Method dump skipped, instructions count: 338
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ida.f(int, boolean):void");
    }

    private final void g(Object obj, idf idfVar) {
        if (idfVar == null) {
            n();
            return;
        }
        Object objB = idfVar.b(obj);
        objB.getClass();
        m(objB);
    }

    private final synchronized void m(Object obj) {
        synchronized (this) {
            int i = this.g;
            this.g = 0;
            if (this.j != obj) {
                this.j = obj;
            }
            if (i == 5) {
                this.i = obj;
            } else {
                boolean zBooleanValue = idq.a(this.i, obj).booleanValue();
                this.i = obj;
                if (zBooleanValue) {
                    eb();
                }
            }
            e();
        }
    }

    private final void n() {
        synchronized (this) {
            this.g = 0;
            Object obj = this.j;
            Object obj2 = this.i;
            if (obj != obj2) {
                this.j = obj2;
            }
            e();
        }
    }

    private final boolean o() {
        if (this.g != 2) {
            return false;
        }
        this.m.obtainMessage(5, this).sendToTarget();
        return true;
    }

    private final void p(boolean z) {
        synchronized (this) {
            int i = this.g;
            if (i != 1 && i != 3) {
                return;
            }
            this.h = z;
        }
    }

    @Override // defpackage.ieh
    public final synchronized Object a() {
        if (this.g == 4) {
            int i = this.n;
            this.g = 5;
            a.ah(this.l[i].equals(6), "Inconsistent directive state for goLazy");
            f(i + 1, false);
        }
        return this.i;
    }

    final void c() {
        synchronized (this) {
            int i = this.g;
            if (i != 0 && i != 4) {
                if (i == 2) {
                    this.h = true;
                }
                return;
            }
            this.g = 1;
            this.n = -1;
            this.h = false;
            this.j = this.i;
            f(0, false);
        }
    }

    @Override // defpackage.iej
    public final void dM() {
        p(true);
        c();
    }

    @Override // defpackage.icu
    protected final void ec() {
        this.k.ea(this);
        c();
    }

    @Override // defpackage.icu
    protected final void ed() {
        this.k.ee(this);
        p(false);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread threadCurrentThread = Thread.currentThread();
        synchronized (this) {
            int i = this.n;
            int i2 = this.g;
            a.ah(i2 == 3 || i2 == 2, "Illegal call of Runnable.run()");
            this.n = -1;
            if (o()) {
                return;
            }
            this.g = 1;
            this.o = threadCurrentThread;
            a.ah(this.l[i].equals(5), "Inconsistent directive state for goTo");
            f(i + 2, true);
            Thread.interrupted();
            synchronized (this) {
                if (this.o == threadCurrentThread) {
                    this.o = null;
                }
            }
        }
    }
}
