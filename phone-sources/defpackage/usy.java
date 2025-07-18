package defpackage;

import java.util.ArrayDeque;
import java.util.Queue;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class usy extends xqb {
    public final Object a = new Object();
    public final Queue b = new ArrayDeque();
    public xqb c;
    final /* synthetic */ xpz d;
    final /* synthetic */ xsq e;
    final /* synthetic */ xpy f;

    public usy(xpz xpzVar, xsq xsqVar, xpy xpyVar) {
        this.d = xpzVar;
        this.e = xsqVar;
        this.f = xpyVar;
        this.c = xpzVar.a(xsqVar, xpyVar);
    }

    @Override // defpackage.xqb
    public final void a(wbb wbbVar, xsm xsmVar) {
        synchronized (this.a) {
            xsm xsmVar2 = new xsm();
            xsmVar2.g(xsmVar);
            this.b.add(new rvp(this, wbbVar, xsmVar2, 9));
            b().a(new usx(this, wbbVar), xsmVar);
        }
    }

    public final xqb b() {
        xqb xqbVar;
        synchronized (this.a) {
            xqbVar = this.c;
        }
        return xqbVar;
    }

    @Override // defpackage.xqb
    public final void c(String str, Throwable th) {
        synchronized (this.a) {
            this.b.add(new rvp(this, str, th, 8));
            b().c(str, th);
        }
    }

    @Override // defpackage.xqb
    public final void d() {
        synchronized (this.a) {
            this.b.add(new ufx(this, 11));
            b().d();
        }
    }

    @Override // defpackage.xqb
    public final void e(int i) {
        synchronized (this.a) {
            this.b.add(new csl(this, i, 20));
            b().e(i);
        }
    }

    @Override // defpackage.xqb
    public final void f(Object obj) {
        synchronized (this.a) {
            this.b.add(new ukm(this, obj, 14));
            b().f(obj);
        }
    }
}
