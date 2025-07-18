package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cmr extends cxj {
    final /* synthetic */ cmv a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cmr(cmv cmvVar) {
        super(1);
        this.a = cmvVar;
    }

    @Override // defpackage.cxj
    public final cyh a(cyh cyhVar, List list) {
        return this.a.e(cyhVar);
    }

    @Override // defpackage.cxj
    public final cxi b(nxb nxbVar, cxi cxiVar) {
        bzq bzqVarN = this.a.v.n();
        if (bzqVarN.s()) {
            long jD = cme.d(bty.q(bzqVarN));
            int iA = cmf.a(jD);
            if (iA < 0) {
                iA = 0;
            }
            int iB = cmf.b(jD);
            if (iB < 0) {
                iB = 0;
            }
            long jH = bty.w(bzqVarN).h();
            long j = jH >> 32;
            long j2 = jH & 4294967295L;
            long j3 = bzqVarN.c;
            long jD2 = cme.d(bzqVarN.j((Float.floatToRawIntBits((int) (j3 >> 32)) << 32) | (Float.floatToRawIntBits((int) (j3 & 4294967295L)) & 4294967295L)));
            int iA2 = ((int) j) - cmf.a(jD2);
            if (iA2 < 0) {
                iA2 = 0;
            }
            int iB2 = ((int) j2) - cmf.b(jD2);
            int i = iB2 >= 0 ? iB2 : 0;
            if (iA != 0 || iB != 0 || iA2 != 0 || i != 0) {
                return new cxi(cmv.g(cxiVar.a, iA, iB, iA2, i), cmv.g(cxiVar.b, iA, iB, iA2, i));
            }
        }
        return cxiVar;
    }
}
