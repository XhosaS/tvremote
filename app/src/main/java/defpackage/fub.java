package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fub {
    public final fxu a;
    public Map b;
    private final ftu c;

    public fub(fxu fxuVar, ftu ftuVar) {
        fxuVar.getClass();
        this.a = fxuVar;
        this.c = ftuVar;
        this.b = agre.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(defpackage.ahni r6, defpackage.fub r7, defpackage.agsw r8) {
        /*
            boolean r0 = r8 instanceof defpackage.fua
            if (r0 == 0) goto L13
            r0 = r8
            fua r0 = (defpackage.fua) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            fua r0 = new fua
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.c
            agtg r1 = defpackage.agtg.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L48
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r6 = r0.b
            fub r6 = (defpackage.fub) r6
            java.lang.Object r7 = r0.a
            ahni r7 = (defpackage.ahni) r7
            defpackage.agpl.b(r8)     // Catch: java.lang.Throwable -> L32
            goto L68
        L32:
            r6 = move-exception
            goto L76
        L34:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3c:
            java.lang.Object r6 = r0.b
            ahni r6 = (defpackage.ahni) r6
            java.lang.Object r7 = r0.a
            fub r7 = (defpackage.fub) r7
            defpackage.agpl.b(r8)
            goto L57
        L48:
            defpackage.agpl.b(r8)
            r0.a = r7
            r0.b = r6
            r0.d = r4
            java.lang.Object r8 = r6.b(r0)
            if (r8 == r1) goto L7a
        L57:
            ftu r8 = r7.c     // Catch: java.lang.Throwable -> L72
            r0.a = r6     // Catch: java.lang.Throwable -> L72
            r0.b = r7     // Catch: java.lang.Throwable -> L72
            r0.d = r3     // Catch: java.lang.Throwable -> L72
            java.lang.Object r8 = r8.a(r0)     // Catch: java.lang.Throwable -> L72
            if (r8 == r1) goto L7a
            r5 = r7
            r7 = r6
            r6 = r5
        L68:
            java.util.Map r8 = (java.util.Map) r8     // Catch: java.lang.Throwable -> L32
            r6.b = r8     // Catch: java.lang.Throwable -> L32
            r7.d()
            agpu r6 = defpackage.agpu.a
            return r6
        L72:
            r7 = move-exception
            r5 = r7
            r7 = r6
            r6 = r5
        L76:
            r7.d()
            throw r6
        L7a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fub.a(ahni, fub, agsw):java.lang.Object");
    }
}
