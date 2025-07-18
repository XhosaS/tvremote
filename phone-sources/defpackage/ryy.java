package defpackage;

import java.util.HashMap;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ryy {
    public static final /* synthetic */ int a = 0;
    private static final ulp d = new ulp(rxx.a, (byte[]) null);
    private static final Object b = new Object();
    private static volatile unc c = null;

    /* JADX WARN: Removed duplicated region for block: B:17:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a(java.io.File r6) {
        /*
            boolean r0 = r6.isDirectory()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L25
            java.io.File[] r0 = r6.listFiles()
            if (r0 == 0) goto L25
            r4 = r1
            r3 = r2
        L10:
            int r5 = r0.length
            if (r3 >= r5) goto L23
            r5 = r0[r3]
            if (r4 == 0) goto L1f
            boolean r4 = a(r5)
            if (r4 == 0) goto L1f
            r4 = r1
            goto L20
        L1f:
            r4 = r2
        L20:
            int r3 = r3 + 1
            goto L10
        L23:
            if (r4 == 0) goto L2c
        L25:
            boolean r6 = r6.delete()
            if (r6 == 0) goto L2c
            return r1
        L2c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ryy.a(java.io.File):boolean");
    }

    public static smc b(rwv rwvVar) {
        sln slnVarA = slo.a();
        Pattern pattern = sjt.a;
        sjs sjsVar = new sjs(rwvVar.c);
        sjsVar.d("phenotype");
        sjsVar.e("all_accounts.pb");
        slnVarA.d(sjsVar.a());
        slnVarA.c(rxx.a);
        slnVarA.a = tst.i(d);
        slnVarA.b();
        slo sloVarA = slnVarA.a();
        unc uncVar = c;
        if (uncVar == null) {
            synchronized (b) {
                uncVar = c;
                if (uncVar == null) {
                    smf smfVar = smf.a;
                    HashMap map = new HashMap();
                    uht uhtVarB = rwvVar.b();
                    aafi aafiVarE = rwvVar.e();
                    sik.b(sly.a, map);
                    unc uncVar2 = new unc(uhtVarB, aafiVarE, smfVar, map);
                    c = uncVar2;
                    uncVar = uncVar2;
                }
            }
        }
        return uncVar.c(sloVarA);
    }
}
