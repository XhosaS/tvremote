package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class leb implements Runnable {
    final /* synthetic */ krc a;
    final /* synthetic */ leo b;

    public leb(leo leoVar, krc krcVar) {
        this.a = krcVar;
        this.b = leoVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r9 = this;
            leo r0 = r9.b
            lbk r1 = r0.y
            lhg r2 = r1.h
            r1.n(r2)
            lbk r1 = r2.y
            lao r2 = r1.e
            r1.m(r2)
            lct r3 = r2.f()
            lcs r4 = defpackage.lcs.ANALYTICS_STORAGE
            boolean r3 = r3.n(r4)
            r4 = 0
            if (r3 != 0) goto L2b
            lab r2 = r1.f
            r1.o(r2)
            kzz r1 = r2.h
            java.lang.String r2 = "Analytics storage consent denied; will not get session id"
            r1.a(r2)
        L29:
            r1 = r4
            goto L57
        L2b:
            r1.m(r2)
            klk r3 = r1.B
            long r5 = java.lang.System.currentTimeMillis()
            boolean r3 = r2.l(r5)
            if (r3 != 0) goto L29
            r1.m(r2)
            lal r3 = r2.p
            r3.a()
            long r5 = r3.a
            r7 = 0
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 != 0) goto L4b
            goto L29
        L4b:
            r1.m(r2)
            r3.a()
            long r1 = r3.a
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
        L57:
            if (r1 == 0) goto L6a
            lbk r0 = r0.y
            lio r2 = r0.i
            r0.m(r2)
            krc r0 = r9.a
            long r3 = r1.longValue()
            r2.T(r0, r3)
            return
        L6a:
            krc r0 = r9.a     // Catch: android.os.RemoteException -> L70
            r0.f(r4)     // Catch: android.os.RemoteException -> L70
            return
        L70:
            r0 = move-exception
            leo r1 = r9.b
            lbk r1 = r1.y
            lab r2 = r1.f
            r1.o(r2)
            kzz r1 = r2.c
            java.lang.String r2 = "getSessionId failed with exception"
            r1.b(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.leb.run():void");
    }
}
