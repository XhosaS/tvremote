package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mhm implements kab {
    private final mgy a;
    private final mhd b;

    protected mhm(Context context, mhd mhdVar) {
        context.getClass();
        Context applicationContext = context.getApplicationContext();
        mhn mhnVar = new mhn();
        ypv ypvVar = ypv.a;
        if (applicationContext == null) {
            throw new NullPointerException("Null context");
        }
        this.a = new mgw(applicationContext, ypvVar, yqt.i(mhnVar), ypvVar);
        this.b = mhdVar;
    }

    public static kab b(Context context, mgx mgxVar) {
        return new mhm(context, new mhd(mgxVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0062 A[Catch: all -> 0x0064, DONT_GENERATE, TryCatch #0 {, blocks: (B:8:0x0023, B:10:0x0027, B:12:0x0036, B:14:0x0042, B:16:0x0056, B:17:0x005d, B:19:0x005f, B:20:0x0062), top: B:44:0x0023 }] */
    @Override // defpackage.kab
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(defpackage.abvo r6) {
        /*
            r5 = this;
            r6.B()
            mhl r6 = defpackage.mhb.a
            android.os.Looper r6 = android.os.Looper.getMainLooper()
            android.os.Looper r0 = android.os.Looper.myLooper()
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto La2
            mgy r6 = r5.a
            mhl r0 = defpackage.mhb.a
            r1 = r6
            mgw r1 = (defpackage.mgw) r1
            android.content.Context r1 = r1.a
            boolean r2 = defpackage.mhk.a
            if (r2 != 0) goto L67
            java.lang.Object r2 = defpackage.mhk.b
            monitor-enter(r2)
            boolean r3 = defpackage.mhk.a     // Catch: java.lang.Throwable -> L64
            if (r3 != 0) goto L62
            r3 = 1
            defpackage.mhk.a = r3     // Catch: java.lang.Throwable -> L64
            defpackage.rfr.f(r1)     // Catch: java.lang.Throwable -> L64
            defpackage.rgi.e(r1)     // Catch: java.lang.Throwable -> L64
            boolean r3 = defpackage.mha.a(r1)     // Catch: java.lang.Throwable -> L64
            if (r3 != 0) goto L62
            aesm r3 = defpackage.aesm.a     // Catch: java.lang.Throwable -> L64
            aesn r3 = r3.eV()     // Catch: java.lang.Throwable -> L64
            boolean r3 = r3.b()     // Catch: java.lang.Throwable -> L64
            if (r3 == 0) goto L5f
            kdv r3 = defpackage.kdv.a(r1)     // Catch: java.lang.Throwable -> L64
            java.lang.String r1 = r1.getPackageName()     // Catch: java.lang.Throwable -> L64
            r4 = 0
            kdp r1 = r3.c(r1, r4)     // Catch: java.lang.Throwable -> L64
            r1.b()     // Catch: java.lang.Throwable -> L64
            boolean r1 = r1.b     // Catch: java.lang.Throwable -> L64
            if (r1 != 0) goto L5f
            java.lang.String r6 = "CBVerifier"
            java.lang.String r0 = "Phenotype flags were not sycned because package was not Google Signed."
            android.util.Log.w(r6, r0)     // Catch: java.lang.Throwable -> L64
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L64
            goto L67
        L5f:
            defpackage.mhk.a(r6, r0)     // Catch: java.lang.Throwable -> L64
        L62:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L64
            goto L67
        L64:
            r6 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L64
            throw r6
        L67:
            aesm r6 = defpackage.aesm.a
            aesn r6 = r6.eV()
            boolean r6 = r6.a()
            if (r6 == 0) goto L93
            mhc r6 = defpackage.mhc.a
            if (r6 != 0) goto L8a
            java.lang.Class<mhc> r6 = defpackage.mhc.class
            monitor-enter(r6)
            mhc r0 = defpackage.mhc.a     // Catch: java.lang.Throwable -> L87
            if (r0 != 0) goto L85
            mhc r0 = new mhc     // Catch: java.lang.Throwable -> L87
            r0.<init>()     // Catch: java.lang.Throwable -> L87
            defpackage.mhc.a = r0     // Catch: java.lang.Throwable -> L87
        L85:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L87
            goto L8a
        L87:
            r0 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L87
            throw r0
        L8a:
            mhd r6 = r5.b
            mhc r0 = defpackage.mhc.a
            mgx r6 = r6.a
            r6.a()
        L93:
            aesp r6 = defpackage.aesp.a
            r6.eV()
            aesm r6 = defpackage.aesm.a
            aesn r6 = r6.eV()
            r6.c()
            return
        La2:
            android.os.NetworkOnMainThreadException r6 = new android.os.NetworkOnMainThreadException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mhm.a(abvo):void");
    }

    public final String toString() {
        return "CollectionBasisLogVerifier{collectionBasisContext=" + this.a + ", basis=" + this.b + "}";
    }
}
