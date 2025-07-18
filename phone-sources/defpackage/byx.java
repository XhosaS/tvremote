package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class byx extends bxl {
    public byx(bxm bxmVar) {
        super(bxmVar);
    }

    @Override // defpackage.bxl
    public final int a(bzq bzqVar, bub bubVar) {
        bza bzaVarB = bzqVar.B();
        bzaVarB.getClass();
        return bzaVarB.cs(bubVar);
    }

    @Override // defpackage.bxl
    protected final long b(bzq bzqVar, long j) {
        bza bzaVarB = bzqVar.B();
        bzaVarB.getClass();
        long j2 = bzaVarB.h;
        int iA = cmf.a(j2);
        int iB = cmf.b(j2);
        return a.D((Float.floatToRawIntBits(iA) << 32) | (Float.floatToRawIntBits(iB) & 4294967295L), j);
    }

    @Override // defpackage.bxl
    public final Map c(bzq bzqVar) {
        bza bzaVarB = bzqVar.B();
        bzaVarB.getClass();
        return bzaVarB.J().e();
    }
}
