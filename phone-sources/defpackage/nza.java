package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nza implements nzn, nxz {
    public final Lock a;
    public final Condition b;
    public final Context c;
    public final nvk d;
    public final nyz e;
    final Map f;
    final Map g = new HashMap();
    final oav h;
    final Map i;
    public volatile nyx j;
    int k;
    final nyw l;
    final nzm m;
    final ocv n;

    public nza(Context context, nyw nywVar, Lock lock, Looper looper, nvk nvkVar, Map map, oav oavVar, Map map2, ocv ocvVar, ArrayList arrayList, nzm nzmVar) {
        this.c = context;
        this.a = lock;
        this.d = nvkVar;
        this.f = map;
        this.h = oavVar;
        this.i = map2;
        this.n = ocvVar;
        this.l = nywVar;
        this.m = nzmVar;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((nxy) arrayList.get(i)).a = this;
        }
        this.e = new nyz(this, looper);
        this.b = lock.newCondition();
        this.j = new nys(this);
    }

    @Override // defpackage.nzn
    public final nxr a(nxr nxrVar) {
        nxrVar.o();
        this.j.f(nxrVar);
        return nxrVar;
    }

    @Override // defpackage.nyc
    public final void aD(Bundle bundle) {
        this.a.lock();
        try {
            this.j.d(bundle);
        } finally {
            this.a.unlock();
        }
    }

    @Override // defpackage.nyc
    public final void aE(int i) {
        this.a.lock();
        try {
            this.j.e(i);
        } finally {
            this.a.unlock();
        }
    }

    @Override // defpackage.nzn
    public final nxr b(nxr nxrVar) {
        nxrVar.o();
        return this.j.a(nxrVar);
    }

    @Override // defpackage.nzn
    public final void c() {
        this.j.c();
    }

    @Override // defpackage.nzn
    public final void d() {
        this.j.g();
        this.g.clear();
    }

    final void f(nyy nyyVar) {
        nyz nyzVar = this.e;
        nyzVar.sendMessage(nyzVar.obtainMessage(1, nyyVar));
    }

    @Override // defpackage.nzn
    public final boolean g() {
        return this.j instanceof nyh;
    }

    @Override // defpackage.nzn
    public final boolean h() {
        return this.j instanceof nyr;
    }

    final void i() {
        this.a.lock();
        try {
            this.j = new nys(this);
            this.j.b();
            this.b.signalAll();
        } finally {
            this.a.unlock();
        }
    }

    @Override // defpackage.nzn
    public final boolean j(njg njgVar) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.CharSequence, java.lang.Object] */
    @Override // defpackage.nzn
    public final void l(String str, PrintWriter printWriter) {
        printWriter.append((CharSequence) str).append("mState=").println(this.j);
        for (jzs jzsVar : this.i.keySet()) {
            printWriter.append((CharSequence) str).append((CharSequence) jzsVar.a).println(":");
            nwj nwjVar = (nwj) this.f.get(jzsVar.b);
            ocv.aF(nwjVar);
            nwjVar.H(str.concat("  "), printWriter);
        }
    }

    @Override // defpackage.nzn
    public final void e() {
    }
}
