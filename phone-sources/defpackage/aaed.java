package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class aaed extends aadt {
    final aabu a;
    final aabu c;

    public aaed(aabm aabmVar, aabu aabuVar, aabo aaboVar) {
        super(aabmVar, aaboVar);
        this.c = aabuVar;
        this.a = aabmVar.s();
    }

    @Override // defpackage.aadt, defpackage.aadr, defpackage.aabm
    public final int a(long j) {
        int iA = this.b.a(j);
        return iA >= 0 ? iA % 100 : ((iA + 1) % 100) + 99;
    }

    @Override // defpackage.aadt, defpackage.aadr, defpackage.aabm
    public final int c() {
        return 99;
    }

    @Override // defpackage.aadt, defpackage.aabm
    public final int d() {
        return 0;
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
        vxr.ay(this, i, 0, 99);
        aabm aabmVar = this.b;
        int iA = aabmVar.a(j);
        return aabmVar.h(j, ((iA >= 0 ? iA / 100 : ((iA + 1) / 100) - 1) * 100) + i);
    }

    @Override // defpackage.aadt, defpackage.aadr, defpackage.aabm
    public final aabu s() {
        return this.a;
    }

    @Override // defpackage.aadt, defpackage.aabm
    public final aabu u() {
        return this.c;
    }

    public aaed(aadv aadvVar, aabo aaboVar) {
        this(aadvVar, aadvVar.b.s(), aaboVar);
    }

    public aaed(aadv aadvVar, aabu aabuVar, aabo aaboVar) {
        super(aadvVar.b, aaboVar);
        int i = aadvVar.a;
        this.a = aabuVar;
        this.c = aadvVar.c;
    }
}
