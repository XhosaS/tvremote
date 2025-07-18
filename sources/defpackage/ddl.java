package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ddl extends czr {
    public boolean a;
    private ddf b;
    private boolean c;
    private boolean d;
    private boolean e;
    private dag f;
    private dbd g;

    private ddl(dag dagVar) {
        this.f = dagVar;
        for (int i = 0; i != dagVar.b(); i++) {
            dal dalVarM = dal.m(dagVar.h(i));
            int i2 = dalVarM.c;
            if (i2 == 0) {
                this.b = ddf.a(dalVarM);
            } else if (i2 == 1) {
                this.c = cyz.i(dalVarM).h();
            } else if (i2 == 2) {
                this.d = cyz.i(dalVarM).h();
            } else if (i2 == 3) {
                this.g = new dbd(cyw.o(dalVarM));
            } else if (i2 == 4) {
                this.a = cyz.i(dalVarM).h();
            } else {
                if (i2 != 5) {
                    throw new IllegalArgumentException("unknown tag in IssuingDistributionPoint");
                }
                this.e = cyz.i(dalVarM).h();
            }
        }
    }

    public static ddl a(Object obj) {
        if (obj instanceof ddl) {
            return (ddl) obj;
        }
        if (obj != null) {
            return new ddl(dag.j(obj));
        }
        return null;
    }

    @Override // defpackage.czr, defpackage.czb
    public final dab p() {
        return this.f;
    }

    public final String toString() {
        String str = doj.a;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("IssuingDistributionPoint: [");
        stringBuffer.append(str);
        ddf ddfVar = this.b;
        if (ddfVar != null) {
            dnx.Y(stringBuffer, str, "distributionPoint", ddfVar.toString());
        }
        if (this.c) {
            dnx.Y(stringBuffer, str, "onlyContainsUserCerts", "true");
        }
        if (this.d) {
            dnx.Y(stringBuffer, str, "onlyContainsCACerts", "true");
        }
        dbd dbdVar = this.g;
        if (dbdVar != null) {
            dnx.Y(stringBuffer, str, "onlySomeReasons", dbdVar.b());
        }
        if (this.e) {
            dnx.Y(stringBuffer, str, "onlyContainsAttributeCerts", "true");
        }
        if (this.a) {
            dnx.Y(stringBuffer, str, "indirectCRL", "true");
        }
        stringBuffer.append("]");
        stringBuffer.append(str);
        return stringBuffer.toString();
    }
}
