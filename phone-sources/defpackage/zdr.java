package defpackage;

import android.support.v7.widget.ActivityChooserView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zdr implements zcf {
    private static final int b(zcl zclVar, int i) {
        String strA = zcl.a(zclVar, "Retry-After");
        return strA == null ? i : new ynj("\\d+").c(strA) ? Integer.valueOf(strA).intValue() : ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final boolean c(java.io.IOException r5, defpackage.zdc r6, boolean r7) {
        /*
            r0 = 0
            if (r7 == 0) goto L9
            boolean r1 = r5 instanceof java.io.FileNotFoundException
            if (r1 != 0) goto L8
            goto L9
        L8:
            return r0
        L9:
            boolean r1 = r5 instanceof java.net.ProtocolException
            if (r1 == 0) goto Le
            goto L29
        Le:
            boolean r1 = r5 instanceof java.io.InterruptedIOException
            if (r1 == 0) goto L19
            boolean r5 = r5 instanceof java.net.SocketTimeoutException
            if (r5 == 0) goto L29
            if (r7 != 0) goto L29
            goto L2a
        L19:
            boolean r7 = r5 instanceof javax.net.ssl.SSLHandshakeException
            if (r7 == 0) goto L25
            java.lang.Throwable r7 = r5.getCause()
            boolean r7 = r7 instanceof java.security.cert.CertificateException
            if (r7 != 0) goto L29
        L25:
            boolean r5 = r5 instanceof javax.net.ssl.SSLPeerUnverifiedException
            if (r5 == 0) goto L2a
        L29:
            return r0
        L2a:
            zcy r5 = r6.g
            r5.getClass()
            int r6 = r5.e
            if (r6 != 0) goto L3c
            int r6 = r5.f
            if (r6 != 0) goto L3b
            int r6 = r5.g
            if (r6 == 0) goto L8d
        L3b:
            r6 = r0
        L3c:
            zco r7 = r5.h
            r1 = 1
            if (r7 == 0) goto L42
            goto L8e
        L42:
            r7 = 0
            if (r6 > r1) goto L74
            int r6 = r5.f
            if (r6 > r1) goto L74
            int r6 = r5.g
            if (r6 <= 0) goto L4e
            goto L74
        L4e:
            zdc r6 = r5.c
            zde r6 = r6.h
            if (r6 != 0) goto L55
            goto L74
        L55:
            monitor-enter(r6)
            int r2 = r6.j     // Catch: java.lang.Throwable -> L71
            if (r2 == 0) goto L5c
            monitor-exit(r6)
            goto L74
        L5c:
            zco r2 = r6.a     // Catch: java.lang.Throwable -> L71
            zbi r3 = r2.a     // Catch: java.lang.Throwable -> L71
            zce r3 = r3.h     // Catch: java.lang.Throwable -> L71
            zbi r4 = r5.b     // Catch: java.lang.Throwable -> L71
            zce r4 = r4.h     // Catch: java.lang.Throwable -> L71
            boolean r3 = defpackage.zcr.r(r3, r4)     // Catch: java.lang.Throwable -> L71
            if (r3 != 0) goto L6e
            monitor-exit(r6)
            goto L74
        L6e:
            monitor-exit(r6)
            r7 = r2
            goto L74
        L71:
            r5 = move-exception
            monitor-exit(r6)
            throw r5
        L74:
            if (r7 == 0) goto L79
            r5.h = r7
            goto L8e
        L79:
            zlj r6 = r5.i
            if (r6 == 0) goto L83
            boolean r6 = r6.k()
            if (r6 == r1) goto L8e
        L83:
            zdi r5 = r5.d
            if (r5 == 0) goto L8e
            boolean r5 = r5.a()
            if (r5 != 0) goto L8e
        L8d:
            return r0
        L8e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zdr.c(java.io.IOException, zdc, boolean):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0189 A[Catch: all -> 0x0210, TryCatch #0 {all -> 0x0210, blocks: (B:22:0x0070, B:24:0x0074, B:26:0x007a, B:28:0x008e, B:29:0x0095, B:30:0x009c, B:31:0x009d, B:33:0x00a2, B:35:0x00ab, B:48:0x00cd, B:50:0x00d1, B:52:0x00d5, B:55:0x00da, B:107:0x01ac, B:109:0x01b0, B:113:0x01c1, B:114:0x01cc, B:58:0x00e2, B:61:0x00f0, B:62:0x00f7, B:63:0x00f8, B:65:0x00fc, B:68:0x0101, B:72:0x010e, B:74:0x012b, B:76:0x0135, B:79:0x013e, B:81:0x0146, B:85:0x014f, B:87:0x0161, B:94:0x0172, B:98:0x017e, B:101:0x0189, B:99:0x0184, B:102:0x0198, B:104:0x019e, B:105:0x01a3, B:131:0x0208, B:132:0x020f, B:118:0x01d3, B:120:0x01dd, B:122:0x01e7, B:123:0x01ea, B:125:0x01ec, B:127:0x01f5, B:129:0x0202, B:130:0x0207), top: B:145:0x0070, inners: #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0135 A[Catch: all -> 0x0210, TryCatch #0 {all -> 0x0210, blocks: (B:22:0x0070, B:24:0x0074, B:26:0x007a, B:28:0x008e, B:29:0x0095, B:30:0x009c, B:31:0x009d, B:33:0x00a2, B:35:0x00ab, B:48:0x00cd, B:50:0x00d1, B:52:0x00d5, B:55:0x00da, B:107:0x01ac, B:109:0x01b0, B:113:0x01c1, B:114:0x01cc, B:58:0x00e2, B:61:0x00f0, B:62:0x00f7, B:63:0x00f8, B:65:0x00fc, B:68:0x0101, B:72:0x010e, B:74:0x012b, B:76:0x0135, B:79:0x013e, B:81:0x0146, B:85:0x014f, B:87:0x0161, B:94:0x0172, B:98:0x017e, B:101:0x0189, B:99:0x0184, B:102:0x0198, B:104:0x019e, B:105:0x01a3, B:131:0x0208, B:132:0x020f, B:118:0x01d3, B:120:0x01dd, B:122:0x01e7, B:123:0x01ea, B:125:0x01ec, B:127:0x01f5, B:129:0x0202, B:130:0x0207), top: B:145:0x0070, inners: #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x017a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0184 A[Catch: all -> 0x0210, TryCatch #0 {all -> 0x0210, blocks: (B:22:0x0070, B:24:0x0074, B:26:0x007a, B:28:0x008e, B:29:0x0095, B:30:0x009c, B:31:0x009d, B:33:0x00a2, B:35:0x00ab, B:48:0x00cd, B:50:0x00d1, B:52:0x00d5, B:55:0x00da, B:107:0x01ac, B:109:0x01b0, B:113:0x01c1, B:114:0x01cc, B:58:0x00e2, B:61:0x00f0, B:62:0x00f7, B:63:0x00f8, B:65:0x00fc, B:68:0x0101, B:72:0x010e, B:74:0x012b, B:76:0x0135, B:79:0x013e, B:81:0x0146, B:85:0x014f, B:87:0x0161, B:94:0x0172, B:98:0x017e, B:101:0x0189, B:99:0x0184, B:102:0x0198, B:104:0x019e, B:105:0x01a3, B:131:0x0208, B:132:0x020f, B:118:0x01d3, B:120:0x01dd, B:122:0x01e7, B:123:0x01ea, B:125:0x01ec, B:127:0x01f5, B:129:0x0202, B:130:0x0207), top: B:145:0x0070, inners: #1, #3 }] */
    @Override // defpackage.zcf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.zcl a(defpackage.zdp r25) {
        /*
            Method dump skipped, instructions count: 574
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zdr.a(zdp):zcl");
    }
}
