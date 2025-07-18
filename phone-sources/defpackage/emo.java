package defpackage;

import android.os.Build;

/* compiled from: PG */
/* loaded from: classes.dex */
final class emo implements elw {
    final /* synthetic */ emp a;

    public emo(emp empVar) {
        this.a = empVar;
    }

    @Override // defpackage.elw
    public final void a() {
        this.a.z();
    }

    @Override // defpackage.elw
    public final void b(int i) {
        ghc ghcVar;
        if (Build.VERSION.SDK_INT >= 35 && (ghcVar = this.a.h) != null) {
            ghcVar.g(i);
        }
        this.a.i.d(i);
    }

    @Override // defpackage.elw
    public final void c(Exception exc) {
        edb.d("MediaCodecAudioRenderer", "Audio sink error", exc);
        this.a.i.e(exc);
    }

    @Override // defpackage.elw
    public final void d(elt eltVar) {
        this.a.i.f(eltVar);
    }

    @Override // defpackage.elw
    public final void e(elt eltVar) {
        this.a.i.g(eltVar);
    }

    @Override // defpackage.elw
    public final void f() {
        pku pkuVar = this.a.w;
        if (pkuVar != null) {
            pkuVar.r();
        }
    }

    @Override // defpackage.elw
    public final void g() {
        pku pkuVar = this.a.w;
        if (pkuVar != null) {
            ((eje) pkuVar.a).j = true;
        }
    }

    @Override // defpackage.elw
    public final void h(long j) {
        this.a.i.m(j);
    }

    @Override // defpackage.elw
    public final void i() {
        this.a.f = true;
    }

    @Override // defpackage.elw
    public final void j() {
        this.a.g = true;
    }

    @Override // defpackage.elw
    public final void k(boolean z) {
        this.a.i.n(z);
    }

    @Override // defpackage.elw
    public final void l(int i, long j, long j2) {
        this.a.i.o(i, j, j2);
    }
}
