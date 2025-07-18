package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pui implements qsx {
    private static final tvn a = tvn.n("GnpSdk");
    private final qte b;
    private final String c;

    public pui(qte qteVar) {
        qteVar.getClass();
        this.b = qteVar;
        this.c = "restart_job_handler_key";
    }

    @Override // defpackage.qsx
    public final /* synthetic */ long a() {
        return 0L;
    }

    @Override // defpackage.qsx
    public final /* synthetic */ psy b(Bundle bundle) {
        return qtl.d(this, bundle);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.qsx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(android.os.Bundle r4, defpackage.yih r5) {
        /*
            r3 = this;
            boolean r4 = r5 instanceof defpackage.puh
            if (r4 == 0) goto L13
            r4 = r5
            puh r4 = (defpackage.puh) r4
            int r0 = r4.c
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r4.c = r0
            goto L18
        L13:
            puh r4 = new puh
            r4.<init>(r3, r5)
        L18:
            java.lang.Object r5 = r4.a
            yio r0 = defpackage.yio.a
            int r1 = r4.c
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            defpackage.ybn.f(r5)
            goto L4c
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            defpackage.ybn.f(r5)
            tvn r5 = defpackage.pui.a
            tuv r5 = r5.l()
            java.lang.String r1 = "Executing RefreshNotificationsChimeTask"
            r5.s(r1)
            qte r5 = r3.b
            qdo r1 = defpackage.qdo.c()
            r4.c = r2
            java.lang.Object r4 = r5.a(r1, r4)
            if (r4 != r0) goto L4c
            return r0
        L4c:
            psy r4 = defpackage.psy.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pui.c(android.os.Bundle, yih):java.lang.Object");
    }

    @Override // defpackage.qsx
    public final String d() {
        return this.c;
    }

    @Override // defpackage.qsx
    public final /* synthetic */ boolean e() {
        return false;
    }
}
