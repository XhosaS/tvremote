package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qbh implements pzr {
    private static final tvn a = tvn.n("GnpSdk");
    private final pxf b;
    private final qnr c;
    private final pwp d;
    private final pvg e;
    private final Set f;
    private final yfo g;
    private final ntp h;

    public qbh(pxf pxfVar, qnr qnrVar, ntp ntpVar, pwp pwpVar, pvg pvgVar, Set set, osk oskVar, yfo yfoVar) {
        pxfVar.getClass();
        ntpVar.getClass();
        pwpVar.getClass();
        pvgVar.getClass();
        oskVar.getClass();
        yfoVar.getClass();
        this.b = pxfVar;
        this.c = qnrVar;
        this.h = ntpVar;
        this.d = pwpVar;
        this.e = pvgVar;
        this.f = set;
        this.g = yfoVar;
    }

    @Override // defpackage.pzr
    public final Object a(qen qenVar, vvj vvjVar, Throwable th, yih yihVar) {
        String strM;
        String str;
        tvk tvkVar = (tvk) a.l().i(th);
        if (qenVar == null || (str = qenVar.b) == null || (strM = qtl.M(str)) == null) {
            strM = "";
        }
        tvkVar.v("Fetched latest threads for account: %s (FAILURE)", strM);
        return ygi.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x02f7, code lost:
    
        if (r1.a(r5, r2, r8, r8, r12, false, r10) == r3) goto L101;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0271  */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object, qen, short[]] */
    /* JADX WARN: Type inference failed for: r11v5 */
    @Override // defpackage.pzr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.qen r23, defpackage.vvj r24, defpackage.vvj r25, defpackage.yih r26) {
        /*
            Method dump skipped, instructions count: 765
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qbh.b(qen, vvj, vvj, yih):java.lang.Object");
    }
}
