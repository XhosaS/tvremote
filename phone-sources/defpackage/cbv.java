package defpackage;

import android.view.View;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cbv implements yow {
    public final View a;
    public final ckk b;
    public final yow c;
    public final AtomicReference d = new AtomicReference(null);

    public cbv(View view, ckk ckkVar, yow yowVar) {
        this.a = view;
        this.b = ckkVar;
        this.c = yowVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.aij r7, defpackage.yih r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.cbu
            if (r0 == 0) goto L13
            r0 = r8
            cbu r0 = (defpackage.cbu) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cbu r0 = new cbu
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2b:
            defpackage.ybn.f(r8)
            goto L4b
        L2f:
            defpackage.ybn.f(r8)
            java.util.concurrent.atomic.AtomicReference r8 = r6.d
            lz r2 = new lz
            r4 = 10
            r2.<init>(r7, r6, r4)
            aki r7 = new aki
            r4 = 0
            r5 = 3
            r7.<init>(r6, r4, r5)
            r0.c = r3
            java.lang.Object r7 = defpackage.bks.b(r8, r2, r7, r0)
            if (r7 != r1) goto L4b
            return r1
        L4b:
            yfs r7 = new yfs
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbv.a(aij, yih):java.lang.Object");
    }

    @Override // defpackage.yow
    public final yil c() {
        return this.c.c();
    }
}
