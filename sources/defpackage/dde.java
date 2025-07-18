package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dde extends czr {
    ddf a;
    ddk b;
    dbd c;

    public dde(dag dagVar) {
        for (int i = 0; i != dagVar.b(); i++) {
            dal dalVarM = dal.m(dagVar.h(i));
            int i2 = dalVarM.c;
            if (i2 == 0) {
                this.a = ddf.a(dalVarM);
            } else if (i2 == 1) {
                this.c = new dbd(cyw.o(dalVarM));
            } else {
                if (i2 != 2) {
                    throw new IllegalArgumentException(b.e(i2, "Unknown tag encountered in structure: "));
                }
                this.b = ddk.c(dalVarM);
            }
        }
    }

    @Override // defpackage.czr, defpackage.czb
    public final dab p() {
        czc czcVar = new czc(3);
        ddf ddfVar = this.a;
        if (ddfVar != null) {
            czcVar.b(new dbm(ddfVar));
        }
        dbd dbdVar = this.c;
        if (dbdVar != null) {
            czcVar.b(new dbm(false, 1, dbdVar));
        }
        ddk ddkVar = this.b;
        if (ddkVar != null) {
            czcVar.b(new dbm(false, 2, ddkVar));
        }
        return new dbk(czcVar);
    }

    public final String toString() {
        String str = doj.a;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("DistributionPoint: [");
        stringBuffer.append(str);
        ddf ddfVar = this.a;
        if (ddfVar != null) {
            dnx.Y(stringBuffer, str, "distributionPoint", ddfVar.toString());
        }
        dbd dbdVar = this.c;
        if (dbdVar != null) {
            dnx.Y(stringBuffer, str, "reasons", dbdVar.b());
        }
        ddk ddkVar = this.b;
        if (ddkVar != null) {
            dnx.Y(stringBuffer, str, "cRLIssuer", ddkVar.toString());
        }
        stringBuffer.append("]");
        stringBuffer.append(str);
        return stringBuffer.toString();
    }
}
