package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bub {
    public final yjz a;

    public bub(yjz yjzVar) {
        this.a = yjzVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [bko] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9, types: [bko] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [bfz] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [bfz] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public static /* synthetic */ Object a(Object obj, Object obj2) {
        bko bkoVarA;
        float fFloatValue = ((Number) obj2).floatValue();
        bvc bvcVarN = ((bwi) obj).n();
        String str = bux.a;
        bvc bvcVarW = bvcVarN != null ? bty.w(bvcVarN) : null;
        for (bzq bzqVar = bvcVarW instanceof bzq ? (bzq) bvcVarW : null; bzqVar != null; bzqVar = bzqVar.v) {
            boolean zH = bzr.h(262144);
            if (zH) {
                bkoVarA = bzqVar.A();
            } else {
                bkoVarA = bzqVar.A().t;
                if (bkoVarA == null) {
                    continue;
                }
            }
            for (bko bkoVarX = bzqVar.X(zH); bkoVarX != null && (bkoVarX.s & 262144) != 0; bkoVarX = bkoVarX.u) {
                if ((bkoVarX.r & 262144) != 0) {
                    ?? bfzVar = 0;
                    bxw bxwVarF = bkoVarX;
                    while (bxwVarF != 0) {
                        if (bxwVarF instanceof cak) {
                            cak cakVar = (cak) bxwVarF;
                            if (cakVar.ci() == bux.a) {
                                throw null;
                            }
                        } else if ((bxwVarF.r & 262144) != 0 && (bxwVarF instanceof bxw)) {
                            bko bkoVar = bxwVarF.C;
                            int i = 0;
                            bxwVarF = bxwVarF;
                            bfzVar = bfzVar;
                            while (bkoVar != null) {
                                if ((bkoVar.r & 262144) != 0) {
                                    i++;
                                    bfzVar = bfzVar;
                                    if (i == 1) {
                                        bxwVarF = bkoVar;
                                    } else {
                                        if (bfzVar == 0) {
                                            bfzVar = new bfz(new bko[16], 0);
                                        }
                                        if (bxwVarF != 0) {
                                            bfzVar.o(bxwVarF);
                                        }
                                        bfzVar.o(bkoVar);
                                        bxwVarF = 0;
                                    }
                                }
                                bkoVar = bkoVar.u;
                                bxwVarF = bxwVarF;
                                bfzVar = bfzVar;
                            }
                            if (i != 1) {
                            }
                        }
                        bxwVarF = fh.F(bfzVar);
                    }
                }
                if (bkoVarX != bkoVarA) {
                }
            }
        }
        return Float.valueOf(fFloatValue);
    }
}
