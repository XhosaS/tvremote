package defpackage;

import android.os.Trace;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cfg {
    private static final bmy a = new bmy(0.0f, 0.0f, 10.0f, 10.0f);

    public static final boolean a(cff cffVar) {
        bzq bzqVarE = cffVar.e();
        if (bzqVarE != null && bzqVarE.as()) {
            return true;
        }
        cfc cfcVar = cffVar.c;
        return cfcVar.f(cfi.p) || cfcVar.f(cfi.o);
    }

    public static final boolean b(cff cffVar) {
        if (a(cffVar)) {
            return false;
        }
        cfc cfcVar = cffVar.c;
        if (cfcVar.a) {
            return true;
        }
        ki kiVar = cfcVar.c;
        Object[] objArr = kiVar.b;
        Object[] objArr2 = kiVar.c;
        long[] jArr = kiVar.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = i - length;
                    int i3 = 0;
                    while (true) {
                        int i4 = 8 - ((~i2) >>> 31);
                        if (i3 < i4) {
                            if ((255 & j) < 128) {
                                int i5 = (i << 3) + i3;
                                Object obj = objArr[i5];
                                Object obj2 = objArr2[i5];
                                if (((cfm) obj).c) {
                                    return true;
                                }
                            }
                            j >>= 8;
                            i3++;
                        } else if (i4 != 8) {
                            return false;
                        }
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return false;
    }

    public static final jc c(dfb dfbVar) {
        Trace.beginSection("getAllUncoveredSemanticsNodesToIntObjectMap");
        try {
            cff cffVarE = dfbVar.e();
            bys bysVar = cffVarE.b;
            if (bysVar.ag() && bysVar.af()) {
                jc jcVar = new jc(48);
                cxe cxeVar = new cxe((byte[]) null, (byte[]) null, (byte[]) null);
                cxeVar.K(clw.A(cffVarE.c()));
                d(cxeVar, cffVarE, jcVar, cffVarE, new cxe((byte[]) null, (byte[]) null, (byte[]) null));
                return jcVar;
            }
            jc jcVar2 = jd.a;
            jcVar2.getClass();
            return jcVar2;
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void d(defpackage.cxe r16, defpackage.cff r17, defpackage.jc r18, defpackage.cff r19, defpackage.cxe r20) {
        /*
            Method dump skipped, instructions count: 465
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cfg.d(cxe, cff, jc, cff, cxe):void");
    }
}
