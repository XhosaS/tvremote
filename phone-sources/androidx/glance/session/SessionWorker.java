package androidx.glance.session;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import defpackage.dso;
import defpackage.dsu;
import defpackage.dte;
import defpackage.dtg;
import defpackage.ykn;
import defpackage.ylh;
import defpackage.ynm;
import defpackage.yno;
import defpackage.yot;
import defpackage.ypk;
import defpackage.yxi;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class SessionWorker extends CoroutineWorker {
    public final WorkerParameters a;
    public final dso b;
    public final dtg c;
    public final String d;
    private final yot h;

    public SessionWorker(Context context, WorkerParameters workerParameters) {
        this(context, workerParameters, dsu.a, null, null, 24, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.yih r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.dsv
            if (r0 == 0) goto L13
            r0 = r7
            dsv r0 = (defpackage.dsv) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dsv r0 = new dsv
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ybn.f(r7)
            goto L46
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L2f:
            defpackage.ybn.f(r7)
            dtg r7 = r6.c
            aki r2 = new aki
            r4 = 0
            r5 = 8
            r2.<init>(r6, r4, r5)
            r0.c = r3
            czt r7 = r7.d
            java.lang.Object r7 = defpackage.czt.g(r7, r2, r0)
            if (r7 == r1) goto L63
        L46:
            gli r7 = (defpackage.gli) r7
            if (r7 != 0) goto L62
            java.util.LinkedHashMap r7 = new java.util.LinkedHashMap
            r7.<init>()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            java.lang.String r1 = "TIMEOUT_EXIT_REASON"
            defpackage.gli.D(r1, r0, r7)
            gox r7 = defpackage.gli.y(r7)
            gpl r0 = new gpl
            r0.<init>(r7)
            return r0
        L62:
            return r7
        L63:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.glance.session.SessionWorker.a(yih):java.lang.Object");
    }

    @Override // androidx.work.CoroutineWorker
    public final yot b() {
        return this.h;
    }

    public SessionWorker(Context context, WorkerParameters workerParameters, dso dsoVar, dtg dtgVar, yot yotVar) {
        super(context, workerParameters);
        this.a = workerParameters;
        this.b = dsoVar;
        this.c = dtgVar;
        this.h = yotVar;
        String strA = g().a(dsoVar.b());
        if (strA == null) {
            throw new IllegalStateException("SessionWorker must be started with a key");
        }
        this.d = strA;
    }

    public /* synthetic */ SessionWorker(Context context, WorkerParameters workerParameters, dso dsoVar, dtg dtgVar, yot yotVar, int i, ykn yknVar) {
        dtg dtgVar2;
        yot yotVar2;
        dso dsoVar2 = (i & 4) != 0 ? dsu.a : dsoVar;
        if ((i & 8) != 0) {
            long j = ynm.a;
            yno ynoVar = yno.d;
            dtgVar2 = new dtg(ylh.o(45, ynoVar), ylh.o(5, ynoVar), ylh.o(5, ynoVar), dte.a);
        } else {
            dtgVar2 = dtgVar;
        }
        if ((i & 16) != 0) {
            yot yotVar3 = ypk.a;
            yotVar2 = yxi.a;
        } else {
            yotVar2 = yotVar;
        }
        this(context, workerParameters, dsoVar2, dtgVar2, yotVar2);
    }
}
