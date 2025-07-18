package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dcz extends czr {
    final dag a;

    private dcz(dag dagVar) {
        this.a = dagVar;
    }

    public static dcz a(Object obj) {
        if (obj != null) {
            return new dcz(dag.j(obj));
        }
        return null;
    }

    @Override // defpackage.czr, defpackage.czb
    public final dab p() {
        return this.a;
    }

    public final String toString() {
        dde ddeVar;
        StringBuffer stringBuffer = new StringBuffer("CRLDistPoint:");
        String str = doj.a;
        stringBuffer.append(str);
        dag dagVar = this.a;
        int iB = dagVar.b();
        dde[] ddeVarArr = new dde[iB];
        for (int i = 0; i != dagVar.b(); i++) {
            czb czbVarH = dagVar.h(i);
            if (czbVarH == null || (czbVarH instanceof dde)) {
                ddeVar = (dde) czbVarH;
            } else {
                if (!(czbVarH instanceof dag)) {
                    throw new IllegalArgumentException("Invalid DistributionPoint: ".concat(String.valueOf(czbVarH.getClass().getName())));
                }
                ddeVar = new dde((dag) czbVarH);
            }
            ddeVarArr[i] = ddeVar;
        }
        for (int i2 = 0; i2 != iB; i2++) {
            stringBuffer.append("    ");
            stringBuffer.append(ddeVarArr[i2]);
            stringBuffer.append(str);
        }
        return stringBuffer.toString();
    }
}
