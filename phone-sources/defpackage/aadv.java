package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class aadv extends aadt {
    final int a;
    final aabu c;
    final aabu d;
    private final int e;
    private final int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aadv(aabm aabmVar, aabo aaboVar) {
        super(aabmVar, aaboVar);
        aabu aabuVarU = aabmVar.u();
        aabu aabuVarS = aabmVar.s();
        if (aabuVarS == null) {
            this.c = null;
        } else {
            this.c = new aaee(aabuVarS, ((aabn) aaboVar).a);
        }
        this.d = aabuVarU;
        this.a = 100;
        int iD = aabmVar.d();
        int i = iD >= 0 ? iD / 100 : ((iD + 1) / 100) - 1;
        int iC = aabmVar.c();
        int i2 = iC >= 0 ? iC / 100 : ((iC + 1) / 100) - 1;
        this.e = i;
        this.f = i2;
    }

    @Override // defpackage.aadt, defpackage.aadr, defpackage.aabm
    public final int a(long j) {
        int iA = this.b.a(j);
        return iA >= 0 ? iA / 100 : ((iA + 1) / 100) - 1;
    }

    @Override // defpackage.aadt, defpackage.aadr, defpackage.aabm
    public final int c() {
        return this.f;
    }

    @Override // defpackage.aadt, defpackage.aabm
    public final int d() {
        return this.e;
    }

    @Override // defpackage.aadr, defpackage.aabm
    public final long e(long j, int i) {
        return this.b.e(j, i * 100);
    }

    @Override // defpackage.aadr, defpackage.aabm
    public final long f(long j) {
        return h(j, a(this.b.f(j)));
    }

    @Override // defpackage.aadt, defpackage.aadr, defpackage.aabm
    public final long g(long j) {
        int iA = a(j) * 100;
        aabm aabmVar = this.b;
        return aabmVar.g(aabmVar.h(j, iA));
    }

    @Override // defpackage.aadt, defpackage.aadr, defpackage.aabm
    public final long h(long j, int i) {
        vxr.ay(this, i, this.e, this.f);
        aabm aabmVar = this.b;
        int iA = aabmVar.a(j);
        return aabmVar.h(j, (i * 100) + (iA >= 0 ? iA % 100 : ((iA + 1) % 100) + 99));
    }

    @Override // defpackage.aadt, defpackage.aadr, defpackage.aabm
    public final aabu s() {
        return this.c;
    }

    @Override // defpackage.aadt, defpackage.aabm
    public final aabu u() {
        aabu aabuVar = this.d;
        return aabuVar != null ? aabuVar : super.u();
    }
}
