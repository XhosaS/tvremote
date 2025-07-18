package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bvr implements bvc {
    private final bza a;

    public bvr(bza bzaVar) {
        this.a = bzaVar;
    }

    private final long b() {
        bza bzaVarAa = fh.aa(this.a);
        return a.at(t(bzaVarAa.o, 0L), a().t(bzaVarAa.g, 0L));
    }

    public final bzq a() {
        return this.a.g;
    }

    @Override // defpackage.bvc
    public final bvc ct() {
        bza bzaVarB;
        if (!s()) {
            bty.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        bzq bzqVar = a().s.o().w;
        if (bzqVar == null || (bzaVarB = bzqVar.B()) == null) {
            return null;
        }
        return bzaVarB.o;
    }

    @Override // defpackage.bvc
    public final long h() {
        bza bzaVar = this.a;
        return (bzaVar.a << 32) | (bzaVar.b & 4294967295L);
    }

    @Override // defpackage.bvc
    public final long i(bvc bvcVar, long j) {
        return t(bvcVar, j);
    }

    @Override // defpackage.bvc
    public final long j(long j) {
        return a().j(a.D(j, b()));
    }

    @Override // defpackage.bvc
    public final long k(long j) {
        throw null;
    }

    @Override // defpackage.bvc
    public final long l(long j) {
        return a().l(a.D(j, b()));
    }

    @Override // defpackage.bvc
    public final long m(long j) {
        return a.D(a().m(j), b());
    }

    @Override // defpackage.bvc
    public final long o(long j) {
        return a.D(a().o(j), b());
    }

    @Override // defpackage.bvc
    public final bmy p(bvc bvcVar, boolean z) {
        return a().p(bvcVar, z);
    }

    @Override // defpackage.bvc
    public final void r(float[] fArr) {
        a().r(fArr);
    }

    @Override // defpackage.bvc
    public final boolean s() {
        return a().s();
    }

    @Override // defpackage.bvc
    public final long t(bvc bvcVar, long j) {
        if (!(bvcVar instanceof bvr)) {
            bza bzaVarAa = fh.aa(this.a);
            long jT = t(bzaVarAa.o, j);
            long j2 = bzaVarAa.h;
            int iA = cmf.a(j2);
            int iB = cmf.b(j2);
            long jAt = a.at(jT, (4294967295L & Float.floatToRawIntBits(iB)) | (Float.floatToRawIntBits(iA) << 32));
            bzq bzqVar = bzaVarAa.g;
            if (!bzqVar.s()) {
                bty.c("LayoutCoordinate operations are only valid when isAttached is true");
            }
            bzqVar.ag();
            bzq bzqVar2 = bzqVar.w;
            if (bzqVar2 != null) {
                bzqVar = bzqVar2;
            }
            return a.D(jAt, bzqVar.t(bvcVar, 0L));
        }
        bza bzaVar = ((bvr) bvcVar).a;
        bzq bzqVar3 = bzaVar.g;
        bzqVar3.ag();
        bza bzaVarB = a().aa(bzqVar3).B();
        if (bzaVarB != null) {
            long jC = cmf.c(cmf.d(bzaVar.C(bzaVarB), cme.d(j)), this.a.C(bzaVarB));
            return (Float.floatToRawIntBits(cmf.b(jC)) & 4294967295L) | (Float.floatToRawIntBits(cmf.a(jC)) << 32);
        }
        bza bzaVarAa2 = fh.aa(bzaVar);
        long jD = cmf.d(cmf.d(bzaVar.C(bzaVarAa2), bzaVarAa2.h), cme.d(j));
        bza bzaVar2 = this.a;
        bza bzaVarAa3 = fh.aa(bzaVar2);
        long jC2 = cmf.c(jD, cmf.d(bzaVar2.C(bzaVarAa3), bzaVarAa3.h));
        long jFloatToRawIntBits = Float.floatToRawIntBits(cmf.a(jC2));
        long jFloatToRawIntBits2 = Float.floatToRawIntBits(cmf.b(jC2)) & 4294967295L;
        bzq bzqVar4 = bzaVarAa3.g.w;
        bzqVar4.getClass();
        bzq bzqVar5 = bzaVarAa2.g.w;
        bzqVar5.getClass();
        return bzqVar4.t(bzqVar5, jFloatToRawIntBits2 | (jFloatToRawIntBits << 32));
    }
}
