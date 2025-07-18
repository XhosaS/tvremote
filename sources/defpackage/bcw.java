package defpackage;

import java.util.HashMap;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bcw {
    public static final /* synthetic */ int a = 0;
    private static final att d = new att(bbz.a);
    private static final Object b = new Object();
    private static volatile bfv c = null;

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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bcw.a(java.io.File):boolean");
    }

    public static bgc b(bav bavVar) {
        bfs bfsVarA = bft.a();
        Pattern pattern = beq.a;
        bep bepVar = new bep(bavVar.d);
        bepVar.c("phenotype");
        bepVar.d("all_accounts.pb");
        bfsVarA.d(bepVar.a());
        bfsVarA.c(bbz.a);
        bfsVarA.a = byg.h(d);
        bfsVarA.b();
        bft bftVarA = bfsVarA.a();
        bfv bfvVar = c;
        if (bfvVar == null) {
            synchronized (b) {
                bfvVar = c;
                if (bfvVar == null) {
                    HashMap map = new HashMap();
                    cjd cjdVarB = bavVar.b();
                    bzt bztVarE = bavVar.e();
                    wz.e(bfy.a, map);
                    bfv bfvVar2 = new bfv(cjdVarB, bztVarE, map);
                    c = bfvVar2;
                    bfvVar = bfvVar2;
                }
            }
        }
        return bfvVar.a(bftVarA);
    }
}
