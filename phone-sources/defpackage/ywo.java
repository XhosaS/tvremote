package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ywo {
    public static final yxo a = new yxo("CLOSED");

    public static final Object a(ywp ywpVar, long j, yjz yjzVar) {
        while (true) {
            long j2 = ywpVar.b;
            if (j2 >= j && !ywpVar.u()) {
                return ywpVar;
            }
            Object objM = ywpVar.m();
            yxo yxoVar = a;
            if (objM == yxoVar) {
                return yxoVar;
            }
            ywp ywpVar2 = (ywp) objM;
            if (ywpVar2 != null) {
                ywpVar = ywpVar2;
            } else {
                ywp ywpVar3 = (ywp) yjzVar.a(Long.valueOf(j2 + 1), ywpVar);
                if (ywpVar.a.d(null, ywpVar3)) {
                    if (ywpVar.u()) {
                        ywpVar.q();
                    }
                    ywpVar = ywpVar3;
                }
            }
        }
    }
}
