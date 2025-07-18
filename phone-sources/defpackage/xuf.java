package defpackage;

import java.net.InetSocketAddress;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xuf implements xvv {
    public final String a;
    public xzd b;
    public final Object c = new Object();
    public final Set d = Collections.newSetFromMap(new IdentityHashMap());
    public final Executor e;
    public final int f;
    public final ybx g;
    public xpv h;
    public final xtx i;
    public boolean j;
    public xtk k;
    public boolean l;
    private final xre m;
    private final InetSocketAddress n;
    private final String o;
    private boolean p;
    private boolean q;

    public xuf(xtx xtxVar, InetSocketAddress inetSocketAddress, String str, String str2, xpv xpvVar, Executor executor, int i, ybx ybxVar) {
        inetSocketAddress.getClass();
        this.n = inetSocketAddress;
        this.m = xre.a(getClass(), inetSocketAddress.toString());
        this.o = str;
        this.a = xxc.e("cronet", str2);
        this.f = i;
        this.e = executor;
        this.i = xtxVar;
        this.g = ybxVar;
        xpv xpvVar2 = xpv.a;
        zlx zlxVar = new zlx(xpv.a);
        zlxVar.b(xwy.a, xtf.PRIVACY_AND_INTEGRITY);
        zlxVar.b(xwy.b, xpvVar);
        this.h = zlxVar.a();
    }

    @Override // defpackage.xvn
    public final /* bridge */ /* synthetic */ xvk a(xsq xsqVar, xsm xsmVar, xpy xpyVar, xqe[] xqeVarArr) {
        return new xue(this, "https://" + this.o + "/".concat(xsqVar.b), xsmVar, xsqVar, ybs.d(xqeVarArr, this.h), xpyVar).a;
    }

    @Override // defpackage.xze
    public final Runnable b(xzd xzdVar) {
        this.b = xzdVar;
        synchronized (this.c) {
            this.l = true;
        }
        return new ufx(this, 17, null);
    }

    @Override // defpackage.xri
    public final xre c() {
        return this.m;
    }

    final void d(xud xudVar, xtk xtkVar) {
        synchronized (this.c) {
            if (this.d.remove(xudVar)) {
                xth xthVar = xtkVar.n;
                boolean z = true;
                if (xthVar != xth.CANCELLED && xthVar != xth.DEADLINE_EXCEEDED) {
                    z = false;
                }
                xudVar.o.k(xtkVar, z, new xsm());
                g();
            }
        }
    }

    @Override // defpackage.xze
    public final void e(xtk xtkVar) {
        synchronized (this.c) {
            if (this.j) {
                return;
            }
            synchronized (this.c) {
                if (this.p) {
                    return;
                }
                this.p = true;
                this.b.c(xtkVar);
                synchronized (this.c) {
                    this.j = true;
                    this.k = xtkVar;
                }
                g();
            }
        }
    }

    @Override // defpackage.xze
    public final void f(xtk xtkVar) {
        throw null;
    }

    final void g() {
        synchronized (this.c) {
            if (this.j && !this.q && this.d.isEmpty()) {
                this.q = true;
                this.b.d();
            }
        }
    }

    public final String toString() {
        InetSocketAddress inetSocketAddress = this.n;
        return super.toString() + "(" + inetSocketAddress.toString() + ")";
    }
}
