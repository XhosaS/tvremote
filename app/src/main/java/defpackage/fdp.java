package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fdp implements gyi {
    private final agow a;
    private final agow b;
    private final hag c;
    private final agow d;
    private final gyx e;
    private final Set f;
    private final Set g;

    public fdp(agow agowVar, agow agowVar2, hag hagVar, agow agowVar3) {
        agowVar.getClass();
        agowVar2.getClass();
        hagVar.getClass();
        agowVar3.getClass();
        this.a = agowVar;
        this.b = agowVar2;
        this.c = hagVar;
        this.d = agowVar3;
        this.e = gyx.g;
        this.f = agqj.p(new hag[]{hag.d, hag.g});
        this.g = agrf.a;
    }

    @Override // defpackage.gzc
    public final int a() {
        return 1073741823;
    }

    @Override // defpackage.gzc
    public final gyx b() {
        return this.e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
    
        if (r7 != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x009a, code lost:
    
        if (r7.f(r0) == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00af, code lost:
    
        if (defpackage.ahkr.b(r7, r0) == r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.gyi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(defpackage.agsw r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.fdo
            if (r0 == 0) goto L13
            r0 = r7
            fdo r0 = (defpackage.fdo) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            fdo r0 = new fdo
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.a
            agtg r1 = defpackage.agtg.a
            int r2 = r0.c
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3b
            if (r2 == r5) goto L37
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            goto L32
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L32:
            defpackage.agpl.b(r7)
            goto Lb2
        L37:
            defpackage.agpl.b(r7)
            goto L58
        L3b:
            defpackage.agpl.b(r7)
            hag r7 = r6.c
            hag r2 = defpackage.hag.d
            if (r7 != r2) goto L7e
            agow r7 = r6.b
            java.lang.Object r7 = r7.a()
            fda r7 = (defpackage.fda) r7
            zyd r7 = r7.a()
            r0.c = r5
            java.lang.Object r7 = defpackage.ahkr.b(r7, r0)
            if (r7 == r1) goto Lb1
        L58:
            agow r0 = r6.a
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r1 = r0.a()
            jmu r1 = (defpackage.jmu) r1
            java.lang.String r1 = r1.c()
            if (r1 == 0) goto L6e
            int r1 = r1.length()
            if (r1 != 0) goto Lb2
        L6e:
            int r1 = r7.length()
            if (r1 <= 0) goto Lb2
            java.lang.Object r0 = r0.a()
            jmu r0 = (defpackage.jmu) r0
            r0.e(r7)
            goto Lb2
        L7e:
            agow r7 = r6.d
            java.lang.Object r7 = r7.a()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L9d
            agow r7 = r6.b
            java.lang.Object r7 = r7.a()
            fda r7 = (defpackage.fda) r7
            r0.c = r4
            java.lang.Object r7 = r7.f(r0)
            if (r7 != r1) goto Lb2
            goto Lb1
        L9d:
            agow r7 = r6.b
            java.lang.Object r7 = r7.a()
            fda r7 = (defpackage.fda) r7
            zyd r7 = r7.b()
            r0.c = r3
            java.lang.Object r7 = defpackage.ahkr.b(r7, r0)
            if (r7 != r1) goto Lb2
        Lb1:
            return r1
        Lb2:
            agpu r7 = defpackage.agpu.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fdp.c(agsw):java.lang.Object");
    }

    @Override // defpackage.gyi
    public final Set d() {
        return this.g;
    }

    @Override // defpackage.gyi
    public final Set e() {
        return this.f;
    }

    @Override // defpackage.gyi
    public final int f() {
        return 1;
    }
}
