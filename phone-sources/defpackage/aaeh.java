package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class aaeh extends aadt {
    public aaeh(aabm aabmVar, aabo aaboVar) {
        super(aabmVar, aaboVar);
    }

    @Override // defpackage.aadt, defpackage.aadr, defpackage.aabm
    public final int a(long j) {
        int iA = this.b.a(j);
        return iA == 0 ? c() : iA;
    }

    @Override // defpackage.aadt, defpackage.aadr, defpackage.aabm
    public final int c() {
        return this.b.c() + 1;
    }

    @Override // defpackage.aadt, defpackage.aabm
    public final int d() {
        return 1;
    }

    @Override // defpackage.aadr, defpackage.aabm
    public final long e(long j, int i) {
        return this.b.e(j, i);
    }

    @Override // defpackage.aadr, defpackage.aabm
    public final long f(long j) {
        return this.b.f(j);
    }

    @Override // defpackage.aadt, defpackage.aadr, defpackage.aabm
    public final long g(long j) {
        return this.b.g(j);
    }

    @Override // defpackage.aadt, defpackage.aadr, defpackage.aabm
    public final long h(long j, int i) {
        int iC = c();
        vxr.ay(this, i, 1, iC);
        if (i == iC) {
            i = 0;
        }
        return this.b.h(j, i);
    }

    @Override // defpackage.aadr, defpackage.aabm
    public final aabu t() {
        return this.b.t();
    }

    @Override // defpackage.aadr, defpackage.aabm
    public final boolean v(long j) {
        return this.b.v(j);
    }
}
