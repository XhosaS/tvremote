package defpackage;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import com.google.android.exoplayer2.ext.widevine.WVMediaCrypto;
import java.math.BigInteger;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nnw {
    private static final nsf a = new nsf("ApplicationAnalyticsUtils");
    private static final String b = "22.1.1";
    private final String c;
    private final Map d;
    private final Map e;

    public nnw(Bundle bundle, String str) {
        this.c = str;
        this.d = npj.r(bundle, "com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_ERROR");
        this.e = npj.r(bundle, "com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_CHANGE_REASON");
    }

    public static void d(vtw vtwVar, boolean z) {
        ucn ucnVar = ((uco) vtwVar.b).k;
        if (ucnVar == null) {
            ucnVar = ucn.a;
        }
        vtw vtwVarN = ucn.a.n(ucnVar);
        if (!vtwVarN.b.A()) {
            vtwVarN.u();
        }
        ucn ucnVar2 = (ucn) vtwVarN.b;
        ucnVar2.b |= 2;
        ucnVar2.d = z;
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        uco ucoVar = (uco) vtwVar.b;
        ucn ucnVar3 = (ucn) vtwVarN.r();
        ucnVar3.getClass();
        ucoVar.k = ucnVar3;
        ucoVar.c |= 2;
    }

    private static int e(int i) {
        return i + WVMediaCrypto.TYPE;
    }

    public final uco a(nnv nnvVar) {
        return (uco) c(nnvVar).r();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.uco b(defpackage.nnv r5, int r6) {
        /*
            r4 = this;
            vtw r5 = r4.c(r5)
            vuc r0 = r5.b
            uco r0 = (defpackage.uco) r0
            ucn r0 = r0.k
            if (r0 != 0) goto Le
            ucn r0 = defpackage.ucn.a
        Le:
            ucn r1 = defpackage.ucn.a
            vtw r0 = r1.n(r0)
            java.util.Map r1 = r4.e
            if (r1 == 0) goto L31
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
            boolean r3 = r1.containsKey(r2)
            if (r3 != 0) goto L23
            goto L31
        L23:
            java.lang.Object r1 = r1.get(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            defpackage.ocv.aF(r1)
            int r1 = r1.intValue()
            goto L35
        L31:
            int r1 = e(r6)
        L35:
            vuc r2 = r0.b
            boolean r2 = r2.A()
            if (r2 != 0) goto L40
            r0.u()
        L40:
            vuc r2 = r0.b
            ucn r2 = (defpackage.ucn) r2
            int r3 = r2.b
            r3 = r3 | 64
            r2.b = r3
            r2.f = r1
            java.util.Map r1 = r4.d
            if (r1 == 0) goto L69
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
            boolean r3 = r1.containsKey(r2)
            if (r3 != 0) goto L5b
            goto L69
        L5b:
            java.lang.Object r6 = r1.get(r2)
            java.lang.Integer r6 = (java.lang.Integer) r6
            defpackage.ocv.aF(r6)
            int r6 = r6.intValue()
            goto L6d
        L69:
            int r6 = e(r6)
        L6d:
            vuc r1 = r0.b
            boolean r1 = r1.A()
            if (r1 != 0) goto L78
            r0.u()
        L78:
            vuc r1 = r0.b
            ucn r1 = (defpackage.ucn) r1
            int r2 = r1.b
            r2 = r2 | 128(0x80, float:1.8E-43)
            r1.b = r2
            r1.g = r6
            vuc r6 = r0.r()
            ucn r6 = (defpackage.ucn) r6
            vuc r0 = r5.b
            boolean r0 = r0.A()
            if (r0 != 0) goto L95
            r5.u()
        L95:
            vuc r0 = r5.b
            uco r0 = (defpackage.uco) r0
            r6.getClass()
            r0.k = r6
            int r6 = r0.c
            r6 = r6 | 2
            r0.c = r6
            vuc r5 = r5.r()
            uco r5 = (defpackage.uco) r5
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nnw.b(nnv, int):uco");
    }

    public final vtw c(nnv nnvVar) {
        long jLongValue;
        vtw vtwVarM = uco.a.m();
        long j = nnvVar.e;
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        vuc vucVar = vtwVarM.b;
        uco ucoVar = (uco) vucVar;
        ucoVar.b |= 2;
        ucoVar.d = j;
        int i = nnvVar.f;
        nnvVar.f = i + 1;
        if (!vucVar.A()) {
            vtwVarM.u();
        }
        vuc vucVar2 = vtwVarM.b;
        uco ucoVar2 = (uco) vucVar2;
        ucoVar2.b |= Integer.MIN_VALUE;
        ucoVar2.j = i;
        String str = nnvVar.d;
        if (str != null) {
            if (!vucVar2.A()) {
                vtwVarM.u();
            }
            uco ucoVar3 = (uco) vtwVarM.b;
            ucoVar3.b |= 262144;
            ucoVar3.i = str;
        }
        vtw vtwVarM2 = ucx.a.m();
        if (!TextUtils.isEmpty(nnvVar.i)) {
            String str2 = nnvVar.i;
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            uco ucoVar4 = (uco) vtwVarM.b;
            str2.getClass();
            ucoVar4.b |= RecyclerView.ItemAnimator.FLAG_MOVED;
            ucoVar4.e = str2;
            String str3 = nnvVar.i;
            if (!vtwVarM2.b.A()) {
                vtwVarM2.u();
            }
            ucx ucxVar = (ucx) vtwVarM2.b;
            str3.getClass();
            ucxVar.b |= 1;
            ucxVar.c = str3;
        }
        if (!TextUtils.isEmpty(nnvVar.j)) {
            String str4 = nnvVar.j;
            if (!vtwVarM2.b.A()) {
                vtwVarM2.u();
            }
            ucx ucxVar2 = (ucx) vtwVarM2.b;
            str4.getClass();
            ucxVar2.b |= 2;
            ucxVar2.d = str4;
        }
        if (!TextUtils.isEmpty(nnvVar.k)) {
            String str5 = nnvVar.k;
            if (!vtwVarM2.b.A()) {
                vtwVarM2.u();
            }
            ucx ucxVar3 = (ucx) vtwVarM2.b;
            str5.getClass();
            ucxVar3.b |= 4;
            ucxVar3.e = str5;
        }
        if (!TextUtils.isEmpty(nnvVar.l)) {
            String str6 = nnvVar.l;
            if (!vtwVarM2.b.A()) {
                vtwVarM2.u();
            }
            ucx ucxVar4 = (ucx) vtwVarM2.b;
            str6.getClass();
            ucxVar4.b |= 8;
            ucxVar4.f = str6;
        }
        if (!TextUtils.isEmpty(nnvVar.m)) {
            String str7 = nnvVar.m;
            if (!vtwVarM2.b.A()) {
                vtwVarM2.u();
            }
            ucx ucxVar5 = (ucx) vtwVarM2.b;
            str7.getClass();
            ucxVar5.b |= 16;
            ucxVar5.g = str7;
        }
        if (!TextUtils.isEmpty(nnvVar.n)) {
            String str8 = nnvVar.n;
            if (!vtwVarM2.b.A()) {
                vtwVarM2.u();
            }
            ucx ucxVar6 = (ucx) vtwVarM2.b;
            str8.getClass();
            ucxVar6.b |= 32;
            ucxVar6.h = str8;
        }
        int iQ = npj.q(nnvVar.o);
        if (!vtwVarM2.b.A()) {
            vtwVarM2.u();
        }
        ucx ucxVar7 = (ucx) vtwVarM2.b;
        ucxVar7.i = iQ - 1;
        ucxVar7.b |= 128;
        ucx ucxVar8 = (ucx) vtwVarM2.r();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        uco ucoVar5 = (uco) vtwVarM.b;
        ucxVar8.getClass();
        ucoVar5.o = ucxVar8;
        ucoVar5.c |= 33554432;
        vtw vtwVarM3 = ucm.a.m();
        String str9 = b;
        if (!vtwVarM3.b.A()) {
            vtwVarM3.u();
        }
        vuc vucVar3 = vtwVarM3.b;
        ucm ucmVar = (ucm) vucVar3;
        str9.getClass();
        ucmVar.b |= 2;
        ucmVar.d = str9;
        String str10 = this.c;
        if (!vucVar3.A()) {
            vtwVarM3.u();
        }
        ucm ucmVar2 = (ucm) vtwVarM3.b;
        str10.getClass();
        ucmVar2.b |= 1;
        ucmVar2.c = str10;
        vtwVarM.ao((ucm) vtwVarM3.r());
        vtw vtwVarM4 = ucn.a.m();
        if (nnvVar.c != null) {
            vtw vtwVarM5 = ucv.a.m();
            String str11 = nnvVar.c;
            if (!vtwVarM5.b.A()) {
                vtwVarM5.u();
            }
            ucv ucvVar = (ucv) vtwVarM5.b;
            str11.getClass();
            ucvVar.b |= 1;
            ucvVar.c = str11;
            ucv ucvVar2 = (ucv) vtwVarM5.r();
            if (!vtwVarM4.b.A()) {
                vtwVarM4.u();
            }
            ucn ucnVar = (ucn) vtwVarM4.b;
            ucvVar2.getClass();
            ucnVar.c = ucvVar2;
            ucnVar.b |= 1;
        }
        if (!vtwVarM4.b.A()) {
            vtwVarM4.u();
        }
        ucn ucnVar2 = (ucn) vtwVarM4.b;
        ucnVar2.b |= 2;
        ucnVar2.d = false;
        String str12 = nnvVar.g;
        if (str12 != null) {
            try {
                String strReplace = str12.replace("-", "");
                jLongValue = new BigInteger(strReplace.substring(0, Math.min(16, strReplace.length())), 16).longValue();
            } catch (NumberFormatException e) {
                a.f(e, str12);
                jLongValue = 0;
            }
            if (!vtwVarM4.b.A()) {
                vtwVarM4.u();
            }
            ucn ucnVar3 = (ucn) vtwVarM4.b;
            ucnVar3.b |= 4;
            ucnVar3.e = jLongValue;
        }
        int i2 = nnvVar.h;
        if (!vtwVarM4.b.A()) {
            vtwVarM4.u();
        }
        vuc vucVar4 = vtwVarM4.b;
        ucn ucnVar4 = (ucn) vucVar4;
        ucnVar4.b |= 1024;
        ucnVar4.h = i2;
        boolean zE = nnvVar.b.e();
        if (!vucVar4.A()) {
            vtwVarM4.u();
        }
        vuc vucVar5 = vtwVarM4.b;
        ucn ucnVar5 = (ucn) vucVar5;
        ucnVar5.b |= RecyclerView.ItemAnimator.FLAG_MOVED;
        ucnVar5.i = zE;
        boolean z = nnvVar.p;
        if (!vucVar5.A()) {
            vtwVarM4.u();
        }
        ucn ucnVar6 = (ucn) vtwVarM4.b;
        ucnVar6.b |= 16384;
        ucnVar6.l = z;
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        uco ucoVar6 = (uco) vtwVarM.b;
        ucn ucnVar7 = (ucn) vtwVarM4.r();
        ucnVar7.getClass();
        ucoVar6.k = ucnVar7;
        ucoVar6.c |= 2;
        return vtwVarM;
    }
}
