package defpackage;

import android.content.res.Resources;
import android.os.Handler;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class mjw {
    public boolean d;
    public mjy e;
    private mke i;
    private final idf j;
    protected final Handler a = new mjv(this);
    protected final ArrayList b = new ArrayList();
    public int c = 0;
    private int f = -1;
    private List g = Collections.EMPTY_LIST;
    private List h = Collections.EMPTY_LIST;

    public mjw(Resources resources) {
        this.j = new llu(resources);
    }

    private final synchronized void A(mjy mjyVar) {
        this.e = mjyVar;
        if (mjyVar != null && u()) {
            mjyVar.c = this.f;
        }
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((mjx) arrayList.get(size)).g(mjyVar);
            }
        }
    }

    private final void z(boolean z) {
        Handler handler = this.a;
        synchronized (handler) {
            if (z == this.d) {
                return;
            }
            if (z) {
                handler.sendMessage(handler.obtainMessage(1));
            } else {
                handler.removeMessages(1);
            }
            this.d = z;
        }
    }

    public int a() {
        throw null;
    }

    public final ieg b() {
        int i;
        int i2 = this.c;
        if (i2 == 0) {
            return ieg.a;
        }
        switch (i2) {
            case -1003:
                i = 54;
                break;
            case -1002:
                i = 59;
                break;
            case -1001:
                i = 58;
                break;
            case -1000:
                i = 57;
                break;
            default:
                i = 63;
                break;
        }
        return ieg.f(new llt(i, -1, new llp(f()), false, false, trk.a));
    }

    public final synchronized mjy c() {
        return this.e;
    }

    public final synchronized mke d() {
        return this.i;
    }

    public final String e() {
        return (String) b().e(this.j).c;
    }

    public abstract String f();

    public final synchronized List g() {
        return this.h;
    }

    public final synchronized List h() {
        return this.g;
    }

    public final void i(mjx mjxVar) {
        this.b.add(mjxVar);
    }

    public final void j() {
        this.c = 0;
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((mjx) arrayList.get(size)).i();
            }
        }
    }

    public final void k(int i) {
        a.H(i >= 0);
        this.f = i;
        A(this.e);
    }

    public final void l(int i, boolean z) {
        a.H(true);
        this.a.post(new mju(this, i, z, 0));
    }

    public final void m(mjx mjxVar) {
        this.b.remove(mjxVar);
    }

    public abstract void n();

    public final void o() {
        this.f = -1;
    }

    public final synchronized void p(List list, int i) {
        if (this.h != list) {
            this.h = list;
            ArrayList arrayList = this.b;
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else {
                    ((mjx) arrayList.get(size)).d(list, i);
                }
            }
        }
    }

    protected final synchronized void q(mjy mjyVar) {
        SystemClock.elapsedRealtime();
        if (mjyVar != null) {
            A(new mjy(mjyVar.a, mjyVar.b, mjyVar.c, mjyVar.d));
            z(this.e.b == 2);
        } else {
            A(null);
            z(false);
        }
    }

    protected final synchronized void r(List list) {
        if (this.g != list) {
            this.g = list;
            ArrayList arrayList = this.b;
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else {
                    ((mjx) arrayList.get(size)).l(this.g);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001d A[Catch: all -> 0x0029, LOOP:0: B:11:0x0019->B:13:0x001d, LOOP_END, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0003, B:10:0x0011, B:11:0x0019, B:13:0x001d, B:7:0x000c), top: B:20:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0027 A[EDGE_INSN: B:22:0x0027->B:15:0x0027 BREAK  A[LOOP:0: B:11:0x0019->B:13:0x001d], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final synchronized void s(defpackage.mke r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            if (r4 == 0) goto Lc
            mke r0 = r3.i     // Catch: java.lang.Throwable -> L29
            boolean r0 = r4.equals(r0)     // Catch: java.lang.Throwable -> L29
            if (r0 != 0) goto L27
            goto L11
        Lc:
            mke r0 = r3.i     // Catch: java.lang.Throwable -> L29
            if (r0 != 0) goto L11
            goto L27
        L11:
            r3.i = r4     // Catch: java.lang.Throwable -> L29
            java.util.ArrayList r0 = r3.b     // Catch: java.lang.Throwable -> L29
            int r1 = r0.size()     // Catch: java.lang.Throwable -> L29
        L19:
            int r1 = r1 + (-1)
            if (r1 < 0) goto L27
            java.lang.Object r2 = r0.get(r1)     // Catch: java.lang.Throwable -> L29
            mjx r2 = (defpackage.mjx) r2     // Catch: java.lang.Throwable -> L29
            r2.m(r4)     // Catch: java.lang.Throwable -> L29
            goto L19
        L27:
            monitor-exit(r3)
            return
        L29:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L29
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mjw.s(mke):void");
    }

    public final synchronized void t() {
        if (!u()) {
            int iA = a();
            mjy mjyVar = this.e;
            if (iA != mjyVar.c) {
                mjyVar.c = iA;
                A(mjyVar);
            }
        }
    }

    public final boolean u() {
        return this.f != -1;
    }

    public abstract boolean v(kwx kwxVar);

    public abstract boolean w();

    public abstract boolean x();

    public abstract boolean y(int i);
}
