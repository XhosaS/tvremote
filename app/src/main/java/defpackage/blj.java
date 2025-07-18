package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class blj implements ahgs {
    final /* synthetic */ ahgs a;
    final /* synthetic */ String[] b;

    public blj(ahgs ahgsVar, String[] strArr) {
        this.a = ahgsVar;
        this.b = strArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.ahgs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.Object r10, defpackage.agsw r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof defpackage.bli
            if (r0 == 0) goto L13
            r0 = r11
            bli r0 = (defpackage.bli) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            bli r0 = new bli
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.a
            agtg r1 = defpackage.agtg.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.agpl.b(r11)
            goto L7b
        L27:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L2f:
            defpackage.agpl.b(r11)
            ahgs r11 = r9.a
            java.util.Set r10 = (java.util.Set) r10
            agsl r2 = new agsl
            r2.<init>()
            java.lang.String[] r4 = r9.b
            r5 = 0
        L3e:
            int r6 = r4.length
            if (r5 >= r6) goto L60
            r6 = r4[r5]
            java.util.Iterator r7 = r10.iterator()
        L47:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L5d
            java.lang.Object r8 = r7.next()
            java.lang.String r8 = (java.lang.String) r8
            boolean r8 = defpackage.agyv.f(r6, r8)
            if (r8 == 0) goto L47
            r2.add(r6)
            goto L47
        L5d:
            int r5 = r5 + 1
            goto L3e
        L60:
            java.util.Set r10 = defpackage.agrp.a(r2)
            r2 = r10
            agsl r2 = (defpackage.agsl) r2
            agsf r2 = r2.b
            boolean r2 = r2.isEmpty()
            if (r3 != r2) goto L70
            r10 = 0
        L70:
            if (r10 == 0) goto L7b
            r0.b = r3
            java.lang.Object r10 = r11.a(r10, r0)
            if (r10 != r1) goto L7b
            return r1
        L7b:
            agpu r10 = defpackage.agpu.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.blj.a(java.lang.Object, agsw):java.lang.Object");
    }
}
