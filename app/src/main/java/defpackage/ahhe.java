package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahhe implements ahgr {
    final /* synthetic */ ahgr a;
    final /* synthetic */ agvc b;

    public ahhe(ahgr ahgrVar, agvc agvcVar) {
        this.a = ahgrVar;
        this.b = agvcVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.ahgr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object fD(defpackage.ahgs r7, defpackage.agsw r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.ahhd
            if (r0 == 0) goto L13
            r0 = r8
            ahhd r0 = (defpackage.ahhd) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            ahhd r0 = new ahhd
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            agtg r1 = defpackage.agtg.a
            int r2 = r0.b
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L4b
            if (r2 == r5) goto L43
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r7 = r0.d
            ahke r7 = (defpackage.ahke) r7
            defpackage.agpl.b(r8)     // Catch: java.lang.Throwable -> L31
            goto L73
        L31:
            r8 = move-exception
            goto L7c
        L33:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3b:
            java.lang.Object r7 = r0.d
            java.lang.Throwable r7 = (java.lang.Throwable) r7
            defpackage.agpl.b(r8)
            goto L93
        L43:
            java.lang.Object r7 = r0.d
            ahgs r7 = (defpackage.ahgs) r7
            defpackage.agpl.b(r8)     // Catch: java.lang.Throwable -> L80
            goto L5b
        L4b:
            defpackage.agpl.b(r8)
            ahgr r8 = r6.a     // Catch: java.lang.Throwable -> L80
            r0.d = r7     // Catch: java.lang.Throwable -> L80
            r0.b = r5     // Catch: java.lang.Throwable -> L80
            java.lang.Object r8 = r8.fD(r7, r0)     // Catch: java.lang.Throwable -> L80
            if (r8 != r1) goto L5b
            goto L92
        L5b:
            agte r8 = r0.E
            ahke r2 = new ahke
            r8.getClass()
            r2.<init>(r7, r8)
            agvc r7 = r6.b     // Catch: java.lang.Throwable -> L79
            r0.d = r2     // Catch: java.lang.Throwable -> L79
            r0.b = r3     // Catch: java.lang.Throwable -> L79
            r8 = 0
            java.lang.Object r7 = r7.a(r2, r8, r0)     // Catch: java.lang.Throwable -> L79
            if (r7 == r1) goto L92
            r7 = r2
        L73:
            r7.g()
            agpu r7 = defpackage.agpu.a
            return r7
        L79:
            r7 = move-exception
            r8 = r7
            r7 = r2
        L7c:
            r7.g()
            throw r8
        L80:
            r7 = move-exception
            ahjc r8 = new ahjc
            r8.<init>(r7)
            agvc r2 = r6.b
            r0.d = r7
            r0.b = r4
            java.lang.Object r8 = defpackage.ahhh.a(r8, r2, r7, r0)
            if (r8 != r1) goto L93
        L92:
            return r1
        L93:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahhe.fD(ahgs, agsw):java.lang.Object");
    }
}
