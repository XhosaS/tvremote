package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zmg extends zix {
    final zjm a;

    private zmg(zjm zjmVar) {
        this.a = zjmVar;
    }

    public static zmg a(Object obj) {
        if (obj != null) {
            return new zmg(zjm.j(obj));
        }
        return null;
    }

    @Override // defpackage.zix, defpackage.zih
    public final zjh p() {
        return this.a;
    }

    public final String toString() {
        zml zmlVar;
        StringBuffer stringBuffer = new StringBuffer("CRLDistPoint:");
        String str = zxr.a;
        stringBuffer.append(str);
        zjm zjmVar = this.a;
        int iB = zjmVar.b();
        zml[] zmlVarArr = new zml[iB];
        for (int i = 0; i != zjmVar.b(); i++) {
            zih zihVarH = zjmVar.h(i);
            if (zihVarH == null || (zihVarH instanceof zml)) {
                zmlVar = (zml) zihVarH;
            } else {
                if (!(zihVarH instanceof zjm)) {
                    throw new IllegalArgumentException("Invalid DistributionPoint: ".concat(String.valueOf(zihVarH.getClass().getName())));
                }
                zmlVar = new zml((zjm) zihVarH);
            }
            zmlVarArr[i] = zmlVar;
        }
        for (int i2 = 0; i2 != iB; i2++) {
            stringBuffer.append("    ");
            stringBuffer.append(zmlVarArr[i2]);
            stringBuffer.append(str);
        }
        return stringBuffer.toString();
    }
}
