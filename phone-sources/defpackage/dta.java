package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dta extends yiz implements yjz {
    Object a;
    int b;
    final /* synthetic */ bav c;
    final /* synthetic */ dsn d;
    final /* synthetic */ Context e;
    final /* synthetic */ bcy f;
    final /* synthetic */ dti g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dta(bav bavVar, dsn dsnVar, Context context, bcy bcyVar, dti dtiVar, yih yihVar) {
        super(2, yihVar);
        this.c = bavVar;
        this.d = dsnVar;
        this.e = context;
        this.f = bcyVar;
        this.g = dtiVar;
    }

    @Override // defpackage.yjz
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dta) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final yih<ygi> create(Object obj, yih<?> yihVar) {
        return new dta(this.c, this.d, this.e, this.f, this.g, yihVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002f, code lost:
    
        if (r5.e(r4) == r0) goto L16;
     */
    @Override // defpackage.yit
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            yio r0 = defpackage.yio.a
            int r1 = r4.b
            r2 = 1
            if (r1 == 0) goto L15
            if (r1 == r2) goto Lf
            java.lang.Object r0 = r4.a
            defpackage.ybn.f(r5)
            goto L43
        Lf:
            defpackage.ybn.f(r5)     // Catch: java.lang.Throwable -> L13 java.util.concurrent.CancellationException -> L4c
            goto L4c
        L13:
            r5 = move-exception
            goto L32
        L15:
            defpackage.ybn.f(r5)
            bav r5 = r4.c     // Catch: java.lang.Throwable -> L13 java.util.concurrent.CancellationException -> L4c
            dsn r1 = r4.d     // Catch: java.lang.Throwable -> L13 java.util.concurrent.CancellationException -> L4c
            android.content.Context r3 = r4.e     // Catch: java.lang.Throwable -> L13 java.util.concurrent.CancellationException -> L4c
            yjz r1 = r1.i(r3)     // Catch: java.lang.Throwable -> L13 java.util.concurrent.CancellationException -> L4c
            baz r5 = (defpackage.baz) r5     // Catch: java.lang.Throwable -> L13 java.util.concurrent.CancellationException -> L4c
            r5.j(r1)     // Catch: java.lang.Throwable -> L13 java.util.concurrent.CancellationException -> L4c
            bcy r5 = r4.f     // Catch: java.lang.Throwable -> L13 java.util.concurrent.CancellationException -> L4c
            r4.b = r2     // Catch: java.lang.Throwable -> L13 java.util.concurrent.CancellationException -> L4c
            java.lang.Object r5 = r5.e(r4)     // Catch: java.lang.Throwable -> L13 java.util.concurrent.CancellationException -> L4c
            if (r5 != r0) goto L4c
            goto L41
        L32:
            dsn r1 = r4.d
            android.content.Context r2 = r4.e
            r4.a = r5
            r3 = 2
            r4.b = r3
            java.lang.Object r1 = r1.m(r2, r5)
            if (r1 != r0) goto L42
        L41:
            return r0
        L42:
            r0 = r5
        L43:
            dti r5 = r4.g
            java.lang.String r1 = "Error in recomposition coroutine"
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            defpackage.yoz.o(r5, r1, r0)
        L4c:
            ygi r5 = defpackage.ygi.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dta.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
