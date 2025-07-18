package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ddf extends czr implements cza {
    final czb a;
    final int b;

    public ddf(dal dalVar) {
        int i = dalVar.c;
        this.b = i;
        if (i == 0) {
            this.a = ddk.c(dalVar);
        } else {
            this.a = dai.h(dalVar);
        }
    }

    public static ddf a(dal dalVar) {
        if (dalVar == null) {
            throw new NullPointerException("'taggedObject' cannot be null");
        }
        dnx.an(dalVar);
        if (!dalVar.n()) {
            throw new IllegalStateException("object implicit - explicit expected.");
        }
        dab dabVarP = dalVar.d.p();
        if (!(dabVarP instanceof dal)) {
            throw new IllegalStateException("unexpected object: ".concat(String.valueOf(dabVarP.getClass().getName())));
        }
        dal dalVar2 = (dal) dabVarP;
        if (dalVar2 != null) {
            return new ddf(dalVar2);
        }
        return null;
    }

    @Override // defpackage.czr, defpackage.czb
    public final dab p() {
        return new dbm(false, this.b, this.a);
    }

    public final String toString() {
        String str = doj.a;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("DistributionPointName: [");
        stringBuffer.append(str);
        if (this.b == 0) {
            dnx.Y(stringBuffer, str, "fullName", this.a.toString());
        } else {
            dnx.Y(stringBuffer, str, "nameRelativeToCRLIssuer", this.a.toString());
        }
        stringBuffer.append("]");
        stringBuffer.append(str);
        return stringBuffer.toString();
    }
}
