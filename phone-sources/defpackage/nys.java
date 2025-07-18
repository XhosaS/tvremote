package defpackage;

import android.os.Bundle;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.locks.Lock;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nys implements nyx {
    private final nza a;

    public nys(nza nzaVar) {
        this.a = nzaVar;
    }

    @Override // defpackage.nyx
    public final nxr a(nxr nxrVar) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    @Override // defpackage.nyx
    public final void b() {
        nza nzaVar = this.a;
        Iterator it = nzaVar.f.values().iterator();
        while (it.hasNext()) {
            ((nwj) it.next()).n();
        }
        nzaVar.l.j = Collections.EMPTY_SET;
    }

    @Override // defpackage.nyx
    public final void c() {
        nza nzaVar = this.a;
        Lock lock = nzaVar.a;
        lock.lock();
        try {
            nzaVar.j = new nyr(nzaVar, nzaVar.h, nzaVar.i, nzaVar.d, nzaVar.n, lock, nzaVar.c);
            nzaVar.j.b();
            nzaVar.b.signalAll();
        } finally {
            nzaVar.a.unlock();
        }
    }

    @Override // defpackage.nyx
    public final void f(nxr nxrVar) {
        this.a.l.g.add(nxrVar);
    }

    @Override // defpackage.nyx
    public final void g() {
    }

    @Override // defpackage.nyx
    public final void d(Bundle bundle) {
    }

    @Override // defpackage.nyx
    public final void e(int i) {
    }

    @Override // defpackage.nyx
    public final void h(nve nveVar, jzs jzsVar, boolean z) {
    }
}
