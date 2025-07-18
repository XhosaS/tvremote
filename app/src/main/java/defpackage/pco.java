package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pco {
    /* JADX WARN: Removed duplicated region for block: B:24:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(defpackage.pbv r5, java.util.List r6) {
        /*
        L0:
            if (r5 == 0) goto L54
            pcc r0 = r5.a()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L21
            zpk r3 = r0.d
            if (r3 != 0) goto L10
            zpk r3 = defpackage.zpk.a
        L10:
            int r3 = r3.b
            r3 = r3 & 8
            if (r3 == 0) goto L18
            r3 = r2
            goto L19
        L18:
            r3 = r1
        L19:
            java.lang.String r4 = "Instrumented view has no VE ID."
            defpackage.yqw.M(r3, r4)
            r6.add(r0)
        L21:
            pcm r3 = r5.c
            r4 = r3
            pft r4 = (defpackage.pft) r4
            pbv r4 = r4.c
            if (r4 != 0) goto L52
            boolean r6 = r3.d()
            if (r6 != 0) goto L4b
            abxc r6 = defpackage.pfn.a
            com.google.protobuf.MessageLite r3 = r6.a
            pcc r4 = defpackage.pcc.a
            if (r3 != r4) goto L43
            abwr r0 = r0.n
            abxb r6 = r6.d
            boolean r6 = r0.n(r6)
            if (r6 == 0) goto L4c
            goto L4b
        L43:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings."
            r5.<init>(r6)
            throw r5
        L4b:
            r1 = r2
        L4c:
            java.lang.String r6 = "Activity's content root (android.R.id.content) must be annotated with a VE. CVE root was: %s"
            defpackage.yqw.R(r1, r6, r5)
            return
        L52:
            r5 = r4
            goto L0
        L54:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pco.a(pbv, java.util.List):void");
    }
}
