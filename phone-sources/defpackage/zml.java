package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zml extends zix {
    zmm a;
    zmr b;
    zkj c;

    public zml(zjm zjmVar) {
        for (int i = 0; i != zjmVar.b(); i++) {
            zjr zjrVarM = zjr.m(zjmVar.h(i));
            int i2 = zjrVarM.c;
            if (i2 == 0) {
                this.a = zmm.a(zjrVarM);
            } else if (i2 == 1) {
                this.c = new zkj(zic.o(zjrVarM));
            } else {
                if (i2 != 2) {
                    throw new IllegalArgumentException(a.cf(i2, "Unknown tag encountered in structure: "));
                }
                this.b = zmr.c(zjrVarM);
            }
        }
    }

    @Override // defpackage.zix, defpackage.zih
    public final zjh p() {
        zii ziiVar = new zii(3);
        zmm zmmVar = this.a;
        if (zmmVar != null) {
            ziiVar.b(new zks(zmmVar));
        }
        zkj zkjVar = this.c;
        if (zkjVar != null) {
            ziiVar.b(new zks(false, 1, zkjVar));
        }
        zmr zmrVar = this.b;
        if (zmrVar != null) {
            ziiVar.b(new zks(false, 2, zmrVar));
        }
        return new zkq(ziiVar);
    }

    public final String toString() {
        String str = zxr.a;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("DistributionPoint: [");
        stringBuffer.append(str);
        zmm zmmVar = this.a;
        if (zmmVar != null) {
            wef.aa(stringBuffer, str, "distributionPoint", zmmVar.toString());
        }
        zkj zkjVar = this.c;
        if (zkjVar != null) {
            wef.aa(stringBuffer, str, "reasons", zkjVar.b());
        }
        zmr zmrVar = this.b;
        if (zmrVar != null) {
            wef.aa(stringBuffer, str, "cRLIssuer", zmrVar.toString());
        }
        stringBuffer.append("]");
        stringBuffer.append(str);
        return stringBuffer.toString();
    }
}
