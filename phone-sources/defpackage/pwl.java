package defpackage;

import android.os.Bundle;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pwl implements qsx {
    private static final tvn a = tvn.n("GnpSdk");
    private static final long b = TimeUnit.HOURS.toMillis(24);
    private final qnr c;
    private final pvg d;
    private final Set e;
    private final String f;
    private final rbi g;
    private final rbi h;
    private final ntp i;

    public pwl(qnr qnrVar, ntp ntpVar, rbi rbiVar, rbi rbiVar2, pvg pvgVar, Set set) {
        ntpVar.getClass();
        rbiVar.getClass();
        rbiVar2.getClass();
        pvgVar.getClass();
        this.c = qnrVar;
        this.i = ntpVar;
        this.g = rbiVar;
        this.h = rbiVar2;
        this.d = pvgVar;
        this.e = set;
        this.f = "PERIODIC_TASK";
    }

    private final void g(qen qenVar) {
        pvh pvhVarB = this.d.b(vie.PERIODIC_LOG);
        if (qenVar != null) {
            pvhVarB.e(qenVar);
        }
        pvhVarB.a();
    }

    @Override // defpackage.qsx
    public final long a() {
        return b;
    }

    @Override // defpackage.qsx
    public final /* synthetic */ psy b(Bundle bundle) {
        return qtl.d(this, bundle);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0057, code lost:
    
        if (r8 != r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ac, code lost:
    
        if (f(null, r7) == r0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b8, code lost:
    
        return r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.qsx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(android.os.Bundle r7, defpackage.yih r8) {
        /*
            r6 = this;
            boolean r7 = r8 instanceof defpackage.pwk
            if (r7 == 0) goto L13
            r7 = r8
            pwk r7 = (defpackage.pwk) r7
            int r0 = r7.d
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r7.d = r0
            goto L18
        L13:
            pwk r7 = new pwk
            r7.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r7.b
            yio r0 = defpackage.yio.a
            int r1 = r7.d
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L41
            if (r1 == r4) goto L3d
            if (r1 == r3) goto L37
            if (r1 != r2) goto L2f
            defpackage.ybn.f(r8)
            goto Laf
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            java.lang.Object r1 = r7.a
            defpackage.ybn.f(r8)
            goto L87
        L3d:
            defpackage.ybn.f(r8)
            goto L59
        L41:
            defpackage.ybn.f(r8)
            tvn r8 = defpackage.pwl.a
            tuv r8 = r8.l()
            java.lang.String r1 = "Executing ChimePeriodicTask"
            r8.s(r1)
            qnr r8 = r6.c
            r7.d = r4
            java.lang.Object r8 = r8.c(r7)
            if (r8 == r0) goto Lb8
        L59:
            qdl r8 = (defpackage.qdl) r8
            boolean r1 = r8 instanceof defpackage.qdn
            if (r1 == 0) goto L64
            qdn r8 = (defpackage.qdn) r8
            java.lang.Object r8 = r8.a
            goto L7b
        L64:
            boolean r1 = r8 instanceof defpackage.qdi
            if (r1 == 0) goto Lb2
            qdi r8 = (defpackage.qdi) r8
            tvn r1 = defpackage.pwl.a
            tuv r1 = r1.g()
            java.lang.Throwable r8 = r8.a()
            java.lang.String r4 = "Failed fetching accounts from storage"
            defpackage.a.co(r1, r4, r8)
            yhb r8 = defpackage.yhb.a
        L7b:
            java.util.List r8 = (java.util.List) r8
            boolean r1 = r8.isEmpty()
            if (r1 != 0) goto La1
            java.util.Iterator r1 = r8.iterator()
        L87:
            boolean r8 = r1.hasNext()
            if (r8 == 0) goto La4
            java.lang.Object r8 = r1.next()
            qen r8 = (defpackage.qen) r8
            r6.g(r8)
            r7.a = r1
            r7.d = r3
            java.lang.Object r8 = r6.f(r8, r7)
            if (r8 != r0) goto L87
            goto Lb8
        La1:
            r6.g(r5)
        La4:
            r7.a = r5
            r7.d = r2
            java.lang.Object r7 = r6.f(r5, r7)
            if (r7 != r0) goto Laf
            goto Lb8
        Laf:
            psy r7 = defpackage.psy.a
            return r7
        Lb2:
            yfu r7 = new yfu
            r7.<init>()
            throw r7
        Lb8:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pwl.c(android.os.Bundle, yih):java.lang.Object");
    }

    @Override // defpackage.qsx
    public final String d() {
        return this.f;
    }

    @Override // defpackage.qsx
    public final boolean e() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0142, code lost:
    
        if (r1.a(r4, r2) != r3) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(defpackage.qen r17, defpackage.yih r18) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pwl.f(qen, yih):java.lang.Object");
    }
}
