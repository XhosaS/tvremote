package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class st implements coa {
    private final yjk a;

    public st(yjk yjkVar) {
        this.a = yjkVar;
    }

    @Override // defpackage.coa
    public final long a(cmg cmgVar, long j, cmi cmiVar, long j2) {
        long j3 = ((cmf) this.a.a()).a;
        boolean z = cmiVar == cmi.a;
        int iA = cmf.a(j3);
        return (kv.v(cmgVar.c + cmf.b(j3), (int) (j2 & 4294967295L), (int) (j & 4294967295L), true) & 4294967295L) | (kv.v(cmgVar.b + iA, (int) (j2 >> 32), (int) (j >> 32), z) << 32);
    }
}
