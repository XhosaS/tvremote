package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aom {
    /* JADX WARN: Removed duplicated region for block: B:29:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0041 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0075 -> B:26:0x0077). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.io.FileOutputStream r13, defpackage.agsw r14) throws java.io.IOException {
        /*
            r12 = this;
            boolean r0 = r14 instanceof defpackage.aol
            if (r0 == 0) goto L13
            r0 = r14
            aol r0 = (defpackage.aol) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            aol r0 = new aol
            r0.<init>(r12, r14)
        L18:
            java.lang.Object r14 = r0.c
            agtg r1 = defpackage.agtg.a
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            long r4 = r0.b
            java.lang.Object r13 = r0.a
            defpackage.agpl.b(r14)
            r14 = r0
            goto L77
        L2c:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L34:
            defpackage.agpl.b(r14)
            r4 = 10
            r14 = r0
        L3a:
            r6 = 60000(0xea60, double:2.9644E-319)
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 > 0) goto L7b
            r0 = r13
            java.io.FileOutputStream r0 = (java.io.FileOutputStream) r0     // Catch: java.io.IOException -> L5c
            java.nio.channels.FileChannel r0 = r0.getChannel()     // Catch: java.io.IOException -> L5c
            java.nio.channels.FileChannel r6 = j$.nio.channels.DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(r0)     // Catch: java.io.IOException -> L5c
            r9 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r11 = 0
            r7 = 0
            java.nio.channels.FileLock r0 = r6.lock(r7, r9, r11)     // Catch: java.io.IOException -> L5c
            r0.getClass()     // Catch: java.io.IOException -> L5c
            return r0
        L5c:
            r0 = move-exception
            java.lang.String r2 = r0.getMessage()
            if (r2 == 0) goto L7a
            java.lang.String r6 = "Resource deadlock would occur"
            boolean r2 = defpackage.agyv.o(r2, r6)
            if (r2 != r3) goto L7a
            r14.a = r13
            r14.b = r4
            r14.e = r3
            java.lang.Object r0 = defpackage.ahce.b(r4, r14)
            if (r0 == r1) goto L79
        L77:
            long r4 = r4 + r4
            goto L3a
        L79:
            return r1
        L7a:
            throw r0
        L7b:
            java.io.FileOutputStream r13 = (java.io.FileOutputStream) r13
            java.nio.channels.FileChannel r13 = r13.getChannel()
            java.nio.channels.FileChannel r0 = j$.nio.channels.DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(r13)
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r5 = 0
            r1 = 0
            java.nio.channels.FileLock r13 = r0.lock(r1, r3, r5)
            r13.getClass()
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aom.a(java.io.FileOutputStream, agsw):java.lang.Object");
    }
}
