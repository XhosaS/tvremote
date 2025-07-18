package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akn implements amf {
    public final yjk a;
    public int b = -1;
    public long c = 9205357640488583168L;
    public final /* synthetic */ alg d;

    public akn(alg algVar, yjk yjkVar) {
        this.d = algVar;
        this.a = yjkVar;
    }

    public final long a(long j, ams amsVar, cgz cgzVar, boolean z) {
        int iA = cgzVar.a.a.a();
        int iG = this.b;
        if (iG < 0 || iG > iA) {
            alg algVar = this.d;
            iG = algVar.m.g(this.c, false);
        }
        alg algVar2 = this.d;
        int iG2 = algVar2.m.g(j, false);
        akb akbVar = algVar2.a;
        long jL = algVar2.L(akbVar.e(), iG, iG2, false, amsVar, z);
        if (this.b == -1 && !chb.g(jL)) {
            this.b = chb.e(jL);
        }
        if (chb.h(jL)) {
            jL = hv.i(jL);
        }
        akbVar.j(jL);
        algVar2.E(alh.c);
        return jL;
    }

    @Override // defpackage.amf
    public final void b() {
        this.d.z(akm.a);
    }
}
