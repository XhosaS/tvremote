package defpackage;

import android.content.ContentResolver;
import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gmq implements rdn {
    public static final zdy a = zdy.h("com/google/android/apps/tvsearch/logging/primes/transmitter/KatnissMetricTransmitter");
    public final Context b;
    public final ContentResolver c;
    public final ztw d;
    public reo e;
    private final agte f;
    private final ahbt g;
    private final hag h;
    private final fmg i;
    private final ahni j;

    public gmq(Context context, ContentResolver contentResolver, agte agteVar, ahbt ahbtVar, hag hagVar, fmg fmgVar, ztw ztwVar) {
        context.getClass();
        agteVar.getClass();
        ahbtVar.getClass();
        hagVar.getClass();
        ztwVar.getClass();
        this.b = context;
        this.c = contentResolver;
        this.f = agteVar;
        this.g = ahbtVar;
        this.h = hagVar;
        this.i = fmgVar;
        this.d = ztwVar;
        this.j = new ahnm(false);
    }

    @Override // defpackage.rdn
    public final /* synthetic */ rdm a() {
        return rdm.a;
    }

    @Override // defpackage.rdn
    public final zyd b(ahvw ahvwVar) {
        ahvwVar.getClass();
        return ahkr.c(this.g, 0, new gmo(this, ahvwVar, null), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0060, code lost:
    
        if (defpackage.ahal.a(r2, r4, r0) == r1) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v7, types: [ahni] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(defpackage.agsw r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.gmm
            if (r0 == 0) goto L13
            r0 = r8
            gmm r0 = (defpackage.gmm) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            gmm r0 = new gmm
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.b
            agtg r1 = defpackage.agtg.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r0 = r0.a
            defpackage.agpl.b(r8)     // Catch: java.lang.Throwable -> L2c
            goto L64
        L2c:
            r8 = move-exception
            goto L6e
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L36:
            java.lang.Object r2 = r0.a
            defpackage.agpl.b(r8)
            r8 = r2
            goto L4c
        L3d:
            defpackage.agpl.b(r8)
            ahni r8 = r7.j
            r0.a = r8
            r0.d = r4
            java.lang.Object r2 = r8.b(r0)
            if (r2 == r1) goto L72
        L4c:
            reo r2 = r7.e     // Catch: java.lang.Throwable -> L6a
            if (r2 != 0) goto L63
            agte r2 = r7.f     // Catch: java.lang.Throwable -> L6a
            gmn r4 = new gmn     // Catch: java.lang.Throwable -> L6a
            r5 = 0
            r4.<init>(r7, r5)     // Catch: java.lang.Throwable -> L6a
            r0.a = r8     // Catch: java.lang.Throwable -> L6a
            r0.d = r3     // Catch: java.lang.Throwable -> L6a
            java.lang.Object r0 = defpackage.ahal.a(r2, r4, r0)     // Catch: java.lang.Throwable -> L6a
            if (r0 != r1) goto L63
            goto L72
        L63:
            r0 = r8
        L64:
            r0.d()
            agpu r8 = defpackage.agpu.a
            return r8
        L6a:
            r0 = move-exception
            r6 = r0
            r0 = r8
            r8 = r6
        L6e:
            r0.d()
            throw r8
        L72:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gmq.c(agsw):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(defpackage.ahvw r8, defpackage.agsw r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.gmp
            if (r0 == 0) goto L13
            r0 = r9
            gmp r0 = (defpackage.gmp) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            gmp r0 = new gmp
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.a
            agtg r1 = defpackage.agtg.a
            int r2 = r0.c
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L42
            if (r2 == r6) goto L3c
            if (r2 == r5) goto L36
            if (r2 != r4) goto L2e
            defpackage.agpl.b(r9)
            return r9
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            ahvw r8 = r0.d
            defpackage.agpl.b(r9)
            goto L6f
        L3c:
            ahvw r8 = r0.d
            defpackage.agpl.b(r9)
            goto L57
        L42:
            defpackage.agpl.b(r9)
            hag r9 = r7.h
            hag r2 = defpackage.hag.d
            if (r9 != r2) goto L84
            fmg r9 = r7.i
            r0.d = r8
            r0.c = r6
            java.lang.Object r9 = r9.c(r0)
            if (r9 == r1) goto L83
        L57:
            ztw r2 = r7.d
            j$.time.Instant r9 = (j$.time.Instant) r9
            j$.time.Instant r2 = r2.a()
            int r9 = r9.compareTo(r2)
            if (r9 < 0) goto L84
            r0.d = r8
            r0.c = r5
            java.lang.Object r9 = r7.c(r0)
            if (r9 == r1) goto L83
        L6f:
            reo r9 = r7.e
            if (r9 == 0) goto L84
            zyd r8 = r9.b(r8)
            r0.d = r3
            r0.c = r4
            java.lang.Object r8 = defpackage.ahkr.b(r8, r0)
            if (r8 != r1) goto L82
            goto L83
        L82:
            return r8
        L83:
            return r1
        L84:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gmq.d(ahvw, agsw):java.lang.Object");
    }
}
