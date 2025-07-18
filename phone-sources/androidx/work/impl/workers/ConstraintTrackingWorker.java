package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import defpackage.gow;
import defpackage.yih;
import defpackage.ykr;
import defpackage.ylh;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ConstraintTrackingWorker extends CoroutineWorker {
    private final WorkerParameters a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        this.a = workerParameters;
    }

    @Override // androidx.work.CoroutineWorker
    public final Object a(yih yihVar) {
        return ykr.l(ylh.ai(i()), new gow(this, (yih) null, 5), yihVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r14v9, types: [java.lang.Object, java.util.concurrent.Executor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object l(defpackage.yih r14) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.workers.ConstraintTrackingWorker.l(yih):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m(defpackage.gpm r5, defpackage.cb r6, defpackage.guw r7, defpackage.yih r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof defpackage.gwa
            if (r0 == 0) goto L13
            r0 = r8
            gwa r0 = (defpackage.gwa) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            gwa r0 = new gwa
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ybn.f(r8)
            goto L41
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.ybn.f(r8)
            gwb r8 = new gwb
            r2 = 0
            r8.<init>(r5, r6, r7, r2)
            r0.c = r3
            java.lang.Object r8 = defpackage.yoz.k(r8, r0)
            if (r8 != r1) goto L41
            return r1
        L41:
            r8.getClass()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.workers.ConstraintTrackingWorker.m(gpm, cb, guw, yih):java.lang.Object");
    }
}
