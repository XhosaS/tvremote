package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahhg implements ahgr {
    final /* synthetic */ agvb a;
    final /* synthetic */ ahgr b;

    public ahhg(agvb agvbVar, ahgr ahgrVar) {
        this.a = agvbVar;
        this.b = ahgrVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x006a, code lost:
    
        if (r7.fD(r2, r0) != r1) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.ahgr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object fD(defpackage.ahgs r7, defpackage.agsw r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.ahhf
            if (r0 == 0) goto L13
            r0 = r8
            ahhf r0 = (defpackage.ahhf) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            ahhf r0 = new ahhf
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            agtg r1 = defpackage.agtg.a
            int r2 = r0.b
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.agpl.b(r8)
            goto L6d
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            ahke r7 = r0.e
            java.lang.Object r2 = r0.d
            defpackage.agpl.b(r8)     // Catch: java.lang.Throwable -> L3a
            goto L5a
        L3a:
            r8 = move-exception
            goto L74
        L3c:
            defpackage.agpl.b(r8)
            agte r8 = r0.E
            ahke r2 = new ahke
            r8.getClass()
            r2.<init>(r7, r8)
            agvb r8 = r6.a     // Catch: java.lang.Throwable -> L71
            r0.d = r7     // Catch: java.lang.Throwable -> L71
            r0.e = r2     // Catch: java.lang.Throwable -> L71
            r0.b = r4     // Catch: java.lang.Throwable -> L71
            java.lang.Object r8 = r8.a(r2, r0)     // Catch: java.lang.Throwable -> L71
            if (r8 == r1) goto L70
            r5 = r2
            r2 = r7
            r7 = r5
        L5a:
            r7.g()
            ahgr r7 = r6.b
            r8 = 0
            r0.d = r8
            r0.e = r8
            r0.b = r3
            java.lang.Object r7 = r7.fD(r2, r0)
            if (r7 != r1) goto L6d
            goto L70
        L6d:
            agpu r7 = defpackage.agpu.a
            return r7
        L70:
            return r1
        L71:
            r7 = move-exception
            r8 = r7
            r7 = r2
        L74:
            r7.g()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahhg.fD(ahgs, agsw):java.lang.Object");
    }
}
