package defpackage;

import android.os.SystemClock;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ejx {
    public static final evz a = new evz(new Object());
    public final eay b;
    public final evz c;
    public final long d;
    public final long e;
    public final int f;
    public final eii g;
    public final boolean h;
    public final exi i;
    public final List j;
    public final evz k;
    public final boolean l;
    public final int m;
    public final int n;
    public final eai o;
    public final boolean p;
    public volatile long q;
    public volatile long r;
    public volatile long s;
    public volatile long t;
    public final sro u;

    public ejx(eay eayVar, evz evzVar, long j, long j2, int i, eii eiiVar, boolean z, exi exiVar, sro sroVar, List list, evz evzVar2, boolean z2, int i2, int i3, eai eaiVar, long j3, long j4, long j5, long j6, boolean z3) {
        this.b = eayVar;
        this.c = evzVar;
        this.d = j;
        this.e = j2;
        this.f = i;
        this.g = eiiVar;
        this.h = z;
        this.i = exiVar;
        this.u = sroVar;
        this.j = list;
        this.k = evzVar2;
        this.l = z2;
        this.m = i2;
        this.n = i3;
        this.o = eaiVar;
        this.q = j3;
        this.r = j4;
        this.s = j5;
        this.t = j6;
        this.p = z3;
    }

    public static ejx l(sro sroVar) {
        eay eayVar = eay.a;
        evz evzVar = a;
        return new ejx(eayVar, evzVar, -9223372036854775807L, 0L, 1, null, false, exi.a, sroVar, ImmutableList.of(), evzVar, false, 1, 0, eai.a, 0L, 0L, 0L, 0L, false);
    }

    public final long a() {
        long j;
        long j2;
        if (!j()) {
            return this.s;
        }
        do {
            j = this.t;
            j2 = this.s;
        } while (j != this.t);
        return edt.y(edt.F(j2) + ((long) ((SystemClock.elapsedRealtime() - j) * this.o.d)));
    }

    public final ejx b() {
        return new ejx(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.u, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, a(), SystemClock.elapsedRealtime(), this.p);
    }

    public final ejx c(boolean z) {
        return new ejx(this.b, this.c, this.d, this.e, this.f, this.g, z, this.i, this.u, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final ejx d(evz evzVar) {
        return new ejx(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.u, this.j, evzVar, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final ejx e(boolean z, int i, int i2) {
        return new ejx(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.u, this.j, this.k, z, i, i2, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final ejx f(eii eiiVar) {
        return new ejx(this.b, this.c, this.d, this.e, this.f, eiiVar, this.h, this.i, this.u, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final ejx g(eai eaiVar) {
        return new ejx(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.u, this.j, this.k, this.l, this.m, this.n, eaiVar, this.q, this.r, this.s, this.t, this.p);
    }

    public final ejx h(int i) {
        return new ejx(this.b, this.c, this.d, this.e, i, this.g, this.h, this.i, this.u, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final ejx i(eay eayVar) {
        return new ejx(eayVar, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.u, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final boolean j() {
        return this.f == 3 && this.l && this.n == 0;
    }

    public final ejx k(evz evzVar, long j, long j2, long j3, long j4, exi exiVar, sro sroVar, List list) {
        evz evzVar2 = this.k;
        boolean z = this.l;
        int i = this.m;
        int i2 = this.n;
        eai eaiVar = this.o;
        long j5 = this.q;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z2 = this.p;
        return new ejx(this.b, evzVar, j2, j3, this.f, this.g, this.h, exiVar, sroVar, list, evzVar2, z, i, i2, eaiVar, j5, j4, j, jElapsedRealtime, z2);
    }
}
