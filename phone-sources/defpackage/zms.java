package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zms extends zix {
    public boolean a;
    private zmm b;
    private boolean c;
    private boolean d;
    private boolean e;
    private zjm f;
    private zkj g;

    private zms(zjm zjmVar) {
        this.f = zjmVar;
        for (int i = 0; i != zjmVar.b(); i++) {
            zjr zjrVarM = zjr.m(zjmVar.h(i));
            int i2 = zjrVarM.c;
            if (i2 == 0) {
                this.b = zmm.a(zjrVarM);
            } else if (i2 == 1) {
                this.c = zif.i(zjrVarM).h();
            } else if (i2 == 2) {
                this.d = zif.i(zjrVarM).h();
            } else if (i2 == 3) {
                this.g = new zkj(zic.o(zjrVarM));
            } else if (i2 == 4) {
                this.a = zif.i(zjrVarM).h();
            } else {
                if (i2 != 5) {
                    throw new IllegalArgumentException("unknown tag in IssuingDistributionPoint");
                }
                this.e = zif.i(zjrVarM).h();
            }
        }
    }

    public static zms a(Object obj) {
        if (obj instanceof zms) {
            return (zms) obj;
        }
        if (obj != null) {
            return new zms(zjm.j(obj));
        }
        return null;
    }

    @Override // defpackage.zix, defpackage.zih
    public final zjh p() {
        return this.f;
    }

    public final String toString() {
        String str = zxr.a;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("IssuingDistributionPoint: [");
        stringBuffer.append(str);
        zmm zmmVar = this.b;
        if (zmmVar != null) {
            wef.aa(stringBuffer, str, "distributionPoint", zmmVar.toString());
        }
        if (this.c) {
            wef.aa(stringBuffer, str, "onlyContainsUserCerts", "true");
        }
        if (this.d) {
            wef.aa(stringBuffer, str, "onlyContainsCACerts", "true");
        }
        zkj zkjVar = this.g;
        if (zkjVar != null) {
            wef.aa(stringBuffer, str, "onlySomeReasons", zkjVar.b());
        }
        if (this.e) {
            wef.aa(stringBuffer, str, "onlyContainsAttributeCerts", "true");
        }
        if (this.a) {
            wef.aa(stringBuffer, str, "indirectCRL", "true");
        }
        stringBuffer.append("]");
        stringBuffer.append(str);
        return stringBuffer.toString();
    }
}
