package defpackage;

import android.media.MediaFormat;
import android.view.Surface;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fbd implements fcj {
    public final Queue a;
    public Surface b;
    public fch c;
    public Executor d;
    public fbu e;
    private final fbx f;
    private final fcc g;
    private dze h;
    private long i;

    public fbd(fbx fbxVar, ecn ecnVar) {
        this.f = fbxVar;
        fbxVar.a = ecnVar;
        this.g = new fcc(new fbc(this), fbxVar);
        this.a = new ArrayDeque();
        this.h = new dze(new dzd());
        this.i = -9223372036854775807L;
        this.c = fch.b;
        this.d = new fba(0);
        this.e = new fbu() { // from class: fbb
            @Override // defpackage.fbu
            public final void c(long j, long j2, dze dzeVar, MediaFormat mediaFormat) {
            }
        };
    }

    @Override // defpackage.fcj
    public final Surface a() {
        Surface surface = this.b;
        eci.e(surface);
        return surface;
    }

    @Override // defpackage.fcj
    public final void b() {
        this.f.b();
    }

    @Override // defpackage.fcj
    public final void c() {
        this.b = null;
        this.f.j(null);
    }

    @Override // defpackage.fcj
    public final void d(boolean z) {
        if (z) {
            this.f.g();
        }
        fcc fccVar = this.g;
        edc edcVar = fccVar.e;
        edcVar.a = 0;
        edcVar.b = -1;
        edcVar.c = 0;
        fccVar.f = -9223372036854775807L;
        fccVar.g = -9223372036854775807L;
        fccVar.h = -9223372036854775807L;
        edn ednVar = fccVar.d;
        if (ednVar.a() > 0) {
            fccVar.j = ((Long) fcc.a(ednVar)).longValue();
        }
        edn ednVar2 = fccVar.c;
        if (ednVar2.a() > 0) {
            ednVar2.e(0L, (ebo) fcc.a(ednVar2));
        }
        this.a.clear();
    }

    @Override // defpackage.fcj
    public final void e(boolean z) {
        this.f.c(z);
    }

    @Override // defpackage.fcj
    public final void f() {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0143, code lost:
    
        throw new java.util.NoSuchElementException();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v21, types: [esp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6, types: [esp, java.lang.Object] */
    @Override // defpackage.fcj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(long r20, long r22) throws defpackage.fci {
        /*
            Method dump skipped, instructions count: 334
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fbd.h(long, long):void");
    }

    @Override // defpackage.fcj
    public final void i(long j) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.fcj
    public final void j(int i) {
        this.f.h(i);
    }

    @Override // defpackage.fcj
    public final void k(fch fchVar, Executor executor) {
        this.c = fchVar;
        this.d = executor;
    }

    @Override // defpackage.fcj
    public final void l(Surface surface, edk edkVar) {
        this.b = surface;
        this.f.j(surface);
    }

    @Override // defpackage.fcj
    public final void m(float f) {
        this.f.k(f);
    }

    @Override // defpackage.fcj
    public final void n(List list) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.fcj
    public final void o(fbu fbuVar) {
        this.e = fbuVar;
    }

    @Override // defpackage.fcj
    public final void p() {
        fcc fccVar = this.g;
        long j = fccVar.f;
        if (j == -9223372036854775807L) {
            j = Long.MIN_VALUE;
            fccVar.f = Long.MIN_VALUE;
            fccVar.g = Long.MIN_VALUE;
        }
        fccVar.h = j;
    }

    @Override // defpackage.fcj
    public final void q() {
        this.f.d();
    }

    @Override // defpackage.fcj
    public final void r() {
        this.f.e();
    }

    @Override // defpackage.fcj
    public final boolean s() {
        fcc fccVar = this.g;
        long j = fccVar.h;
        return j != -9223372036854775807L && fccVar.g == j;
    }

    @Override // defpackage.fcj
    public final boolean t() {
        return true;
    }

    @Override // defpackage.fcj
    public final boolean u(boolean z) {
        return this.f.l(z);
    }

    @Override // defpackage.fcj
    public final void v(dze dzeVar, long j, int i, List list) {
        a.ab(list.isEmpty());
        dze dzeVar2 = this.h;
        int i2 = dzeVar2.af;
        int i3 = dzeVar.af;
        if (i3 != i2 || dzeVar.ag != dzeVar2.ag) {
            fcc fccVar = this.g;
            int i4 = dzeVar.ag;
            long j2 = fccVar.f;
            fccVar.c.e(j2 == -9223372036854775807L ? 0L : j2 + 1, new ebo(i3, i4));
        }
        float f = dzeVar.aj;
        if (f != this.h.aj) {
            this.f.i(f);
        }
        this.h = dzeVar;
        if (j != this.i) {
            fcc fccVar2 = this.g;
            if (fccVar2.e.b()) {
                fccVar2.a.f(i);
                fccVar2.j = j;
            } else {
                edn ednVar = fccVar2.d;
                long j3 = fccVar2.f;
                ednVar.e(j3 == -9223372036854775807L ? -4611686018427387904L : j3 + 1, Long.valueOf(j));
            }
            this.i = j;
        }
    }

    @Override // defpackage.fcj
    public final boolean x(long j, uru uruVar) {
        this.a.add(uruVar);
        fcc fccVar = this.g;
        edc edcVar = fccVar.e;
        int i = edcVar.c;
        Object obj = edcVar.e;
        int length = ((long[]) obj).length;
        if (i == length) {
            int i2 = length + length;
            if (i2 < 0) {
                throw new IllegalStateException();
            }
            long[] jArr = new long[i2];
            int i3 = edcVar.a;
            int i4 = length - i3;
            System.arraycopy(obj, i3, jArr, 0, i4);
            System.arraycopy(edcVar.e, 0, jArr, i4, i3);
            edcVar.a = 0;
            edcVar.b = edcVar.c - 1;
            edcVar.e = jArr;
            obj = edcVar.e;
            edcVar.d = ((long[]) obj).length - 1;
        }
        int i5 = (edcVar.b + 1) & edcVar.d;
        edcVar.b = i5;
        ((long[]) obj)[i5] = j;
        edcVar.c++;
        fccVar.f = j;
        fccVar.h = -9223372036854775807L;
        this.d.execute(new emy(this, 14));
        return true;
    }

    @Override // defpackage.fcj
    public final void g() {
    }

    @Override // defpackage.fcj
    public final void w(dze dzeVar) {
    }
}
