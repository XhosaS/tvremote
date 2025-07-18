package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import j$.util.DesugarCollections;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.Lock;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nyb implements nzn {
    public final nza a;
    public final nza b;
    public Bundle c;
    public final Lock g;
    private final Context h;
    private final nyw i;
    private final Looper j;
    private final Map k;
    private final nwj m;
    private final Set l = Collections.newSetFromMap(new WeakHashMap());
    public nve d = null;
    public nve e = null;
    public boolean f = false;
    private int n = 0;

    public nyb(Context context, nyw nywVar, Lock lock, Looper looper, nvk nvkVar, Map map, Map map2, oav oavVar, ocv ocvVar, nwj nwjVar, ArrayList arrayList, ArrayList arrayList2, Map map3, Map map4) {
        this.h = context;
        this.i = nywVar;
        this.g = lock;
        this.j = looper;
        this.m = nwjVar;
        this.a = new nza(context, nywVar, lock, looper, nvkVar, map2, null, map4, null, arrayList2, new nya(this, 1));
        this.b = new nza(context, nywVar, lock, looper, nvkVar, map, oavVar, map3, ocvVar, arrayList, new nya(this, 0));
        ir irVar = new ir();
        Iterator it = map2.keySet().iterator();
        while (it.hasNext()) {
            irVar.put((npj) it.next(), this.a);
        }
        Iterator it2 = map.keySet().iterator();
        while (it2.hasNext()) {
            irVar.put((npj) it2.next(), this.b);
        }
        this.k = DesugarCollections.unmodifiableMap(irVar);
    }

    private final PendingIntent m() {
        nwj nwjVar = this.m;
        if (nwjVar == null) {
            return null;
        }
        return PendingIntent.getActivity(this.h, System.identityHashCode(this.i), nwjVar.j(), ogf.a | 134217728);
    }

    private final void n(nve nveVar) {
        int i = this.n;
        if (i == 1) {
            o();
        } else if (i != 2) {
            Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
        } else {
            this.i.r(nveVar);
            o();
        }
        this.n = 0;
    }

    private final void o() {
        Set set = this.l;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((njg) it.next()).i.release();
        }
        set.clear();
    }

    private final boolean p() {
        nve nveVar = this.e;
        return nveVar != null && nveVar.c == 4;
    }

    private final boolean q(nxr nxrVar) {
        nza nzaVar = (nza) this.k.get(nxrVar.g);
        ocv.aG(nzaVar, "GoogleApiClient is not configured to use the API required for this call.");
        return nzaVar.equals(this.b);
    }

    private static boolean r(nve nveVar) {
        return nveVar != null && nveVar.c();
    }

    @Override // defpackage.nzn
    public final nxr a(nxr nxrVar) {
        if (!q(nxrVar)) {
            this.a.a(nxrVar);
            return nxrVar;
        }
        if (p()) {
            nxrVar.m(new Status(4, null, m()));
            return nxrVar;
        }
        this.b.a(nxrVar);
        return nxrVar;
    }

    @Override // defpackage.nzn
    public final nxr b(nxr nxrVar) {
        if (!q(nxrVar)) {
            return this.a.b(nxrVar);
        }
        if (!p()) {
            return this.b.b(nxrVar);
        }
        nxrVar.m(new Status(4, null, m()));
        return nxrVar;
    }

    @Override // defpackage.nzn
    public final void c() {
        this.n = 2;
        this.f = false;
        this.e = null;
        this.d = null;
        this.a.c();
        this.b.c();
    }

    @Override // defpackage.nzn
    public final void d() {
        this.e = null;
        this.d = null;
        this.n = 0;
        this.a.d();
        this.b.d();
        o();
    }

    @Override // defpackage.nzn
    public final void e() {
        this.g.lock();
        try {
            boolean zH = h();
            this.b.d();
            this.e = new nve(4);
            if (zH) {
                new ogh(this.j).post(new nur(this, 4, null));
            } else {
                o();
            }
        } finally {
            this.g.unlock();
        }
    }

    public final void f() {
        nve nveVar;
        nve nveVar2 = this.d;
        if (!r(nveVar2)) {
            if (nveVar2 != null && r(this.e)) {
                this.b.d();
                nve nveVar3 = this.d;
                ocv.aF(nveVar3);
                n(nveVar3);
                return;
            }
            if (nveVar2 == null || (nveVar = this.e) == null) {
                return;
            }
            if (this.b.k < this.a.k) {
                nveVar2 = nveVar;
            }
            n(nveVar2);
            return;
        }
        nve nveVar4 = this.e;
        if (!r(nveVar4) && !p()) {
            if (nveVar4 != null) {
                if (this.n == 1) {
                    o();
                    return;
                } else {
                    n(nveVar4);
                    this.a.d();
                    return;
                }
            }
            return;
        }
        int i = this.n;
        if (i == 1) {
            o();
        } else if (i != 2) {
            Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new AssertionError());
        } else {
            this.i.s(this.c);
            o();
        }
        this.n = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001f  */
    @Override // defpackage.nzn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean g() {
        /*
            r3 = this;
            java.util.concurrent.locks.Lock r0 = r3.g
            r0.lock()
            nza r0 = r3.a     // Catch: java.lang.Throwable -> L26
            boolean r0 = r0.g()     // Catch: java.lang.Throwable -> L26
            r1 = 0
            if (r0 == 0) goto L20
            boolean r0 = r3.i()     // Catch: java.lang.Throwable -> L26
            r2 = 1
            if (r0 != 0) goto L1f
            boolean r0 = r3.p()     // Catch: java.lang.Throwable -> L26
            if (r0 != 0) goto L1f
            int r0 = r3.n     // Catch: java.lang.Throwable -> L26
            if (r0 != r2) goto L20
        L1f:
            r1 = r2
        L20:
            java.util.concurrent.locks.Lock r0 = r3.g
            r0.unlock()
            return r1
        L26:
            r0 = move-exception
            java.util.concurrent.locks.Lock r1 = r3.g
            r1.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nyb.g():boolean");
    }

    @Override // defpackage.nzn
    public final boolean h() {
        this.g.lock();
        try {
            return this.n == 2;
        } finally {
            this.g.unlock();
        }
    }

    public final boolean i() {
        return this.b.g();
    }

    @Override // defpackage.nzn
    public final boolean j(njg njgVar) {
        Lock lock = this.g;
        lock.lock();
        try {
            if ((!h() && !g()) || i()) {
                lock.unlock();
                return false;
            }
            this.l.add(njgVar);
            if (this.n == 0) {
                this.n = 1;
            }
            this.e = null;
            this.b.c();
            return true;
        } finally {
            this.g.unlock();
        }
    }

    public final void k(int i) {
        this.i.c(i);
        this.e = null;
        this.d = null;
    }

    @Override // defpackage.nzn
    public final void l(String str, PrintWriter printWriter) {
        printWriter.append("").append("authClient").println(":");
        this.b.l("".concat("  "), printWriter);
        printWriter.append("").append("anonClient").println(":");
        this.a.l("".concat("  "), printWriter);
    }
}
