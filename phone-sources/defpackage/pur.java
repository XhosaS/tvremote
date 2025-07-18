package defpackage;

import android.content.Intent;
import com.google.common.collect.ImmutableExtensionsKt;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pur implements qeq {
    private static final tvn b = tvn.n("GnpSdk");
    public final pxf a;
    private final Set c;
    private final qbz d;
    private final nsf e;

    public pur(pxf pxfVar, nsf nsfVar, Set set, qbz qbzVar) {
        pxfVar.getClass();
        nsfVar.getClass();
        this.a = pxfVar;
        this.e = nsfVar;
        this.c = set;
        this.d = qbzVar;
    }

    @Override // defpackage.qeq
    public final int a(Intent intent) {
        String stringExtra = intent.getStringExtra("com.google.android.libraries.notifications.ACTION_ID");
        if (stringExtra != null) {
            return (yks.e(stringExtra, "com.google.android.libraries.notifications.NOTIFICATION_CLICKED") || ylh.ac(stringExtra, "com.google.android.libraries.notifications.ACTION_ID:")) ? -2 : 10;
        }
        return 10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0142, code lost:
    
        if (r14.b(r1, r3) == r4) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // defpackage.qeq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(android.content.Intent r18, defpackage.qdo r19, long r20, defpackage.yih r22) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pur.b(android.content.Intent, qdo, long, yih):java.lang.Object");
    }

    @Override // defpackage.qeq
    public final void c(Intent intent, qdo qdoVar, long j) throws Throwable {
        intent.getClass();
        qdoVar.getClass();
        vmo vmoVarD = qcb.d(intent);
        String strG = qcb.g(intent);
        String strF = qcb.f(intent);
        qrd qrdVarA = qcb.a(intent);
        vks vksVarC = qcb.c(intent);
        vht vhtVarB = qcb.b(intent);
        if ((strG == null || strF != null) && (strG != null || strF == null)) {
            throw new IllegalArgumentException("One of Thread ID or Group ID should be null");
        }
        int iQ = qcb.q(intent);
        ylf ylfVar = new ylf();
        ylfVar.a = qcb.e(intent);
        Object obj = ylfVar.a;
        if (obj != null && ylh.ac((String) obj, "com.google.android.libraries.notifications.ACTION_ID:")) {
            ylfVar.a = new ynj("com.google.android.libraries.notifications.ACTION_ID:").e((CharSequence) ylfVar.a);
        }
        qen qenVar = (qen) ykr.n(yim.a, new pfo(this, intent, ylfVar, (yih) null, 11));
        if (qenVar == null) {
            return;
        }
        ImmutableList immutableListM = strG != null ? this.e.m(qenVar, strG) : this.e.l(qenVar, strF);
        int iB = vmb.b(vmoVarD.c);
        if (iB == 0) {
            iB = vmb.a;
        }
        if (iB == vmb.c) {
            for (qqx qqxVar : this.c) {
                immutableListM.getClass();
                ImmutableExtensionsKt.toImmutableList((Collection) immutableListM);
                qqxVar.f();
            }
        }
        ykr.n(yim.a, new pup(this, iQ, ylfVar, qenVar, immutableListM, vmoVarD, intent, qrdVarA, vksVarC, vhtVarB, null));
    }

    @Override // defpackage.qeq
    public final boolean d(Intent intent) {
        return yks.e("com.google.android.libraries.notifications.SYSTEM_TRAY_EVENT", intent.getAction());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(android.content.Intent r5, java.lang.String r6, defpackage.yih r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.puo
            if (r0 == 0) goto L13
            r0 = r7
            puo r0 = (defpackage.puo) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            puo r0 = new puo
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.String r6 = r0.d
            defpackage.ybn.f(r7)
            goto L40
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.ybn.f(r7)
            qbz r7 = r4.d
            r0.d = r6
            r0.c = r3
            java.lang.Object r7 = r7.a(r5, r0)
            if (r7 == r1) goto L70
        L40:
            qdl r7 = (defpackage.qdl) r7
            boolean r5 = r7 instanceof defpackage.qdn
            if (r5 == 0) goto L4b
            qdn r7 = (defpackage.qdn) r7
            java.lang.Object r5 = r7.a
            return r5
        L4b:
            boolean r5 = r7 instanceof defpackage.qdi
            if (r5 == 0) goto L6a
            qdi r7 = (defpackage.qdi) r7
            tvn r5 = defpackage.pur.b
            tuv r5 = r5.g()
            tvk r5 = (defpackage.tvk) r5
            java.lang.Throwable r7 = r7.a()
            tuv r5 = r5.i(r7)
            tvk r5 = (defpackage.tvk) r5
            java.lang.String r7 = "Error handling system tray action [%s]"
            r5.v(r7, r6)
            r5 = 0
            return r5
        L6a:
            yfu r5 = new yfu
            r5.<init>()
            throw r5
        L70:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pur.e(android.content.Intent, java.lang.String, yih):java.lang.Object");
    }
}
