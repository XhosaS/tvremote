package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qpn implements qpm {
    private final Context a;
    private final qpl b;

    static {
        tvn.n("GnpSdk");
    }

    public qpn(Context context, qpl qplVar) {
        this.a = context;
        this.b = qplVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004b, code lost:
    
        return defpackage.sfy.B(new java.lang.IllegalArgumentException("HTTP Scheme not supported for URL: ".concat(java.lang.String.valueOf(r8))));
     */
    @Override // defpackage.qpm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.uhp a(java.lang.String r7, java.lang.String r8, int r9, int r10) throws java.io.IOException, android.system.ErrnoException {
        /*
            r6 = this;
            android.net.Uri r0 = android.net.Uri.parse(r8)
            java.lang.String r1 = r0.getScheme()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto Le9
            java.lang.String r1 = r0.getScheme()
            int r2 = r1.hashCode()
            r3 = -368816979(0xffffffffea044cad, float:-3.9985075E25)
            java.lang.String r4 = "content"
            java.lang.String r5 = "file"
            if (r2 == r3) goto L4c
            r0 = 3143036(0x2ff57c, float:4.404332E-39)
            if (r2 == r0) goto L32
            r0 = 951530617(0x38b73479, float:8.735894E-5)
            if (r2 == r0) goto L2b
            goto Le9
        L2b:
            boolean r0 = r1.equals(r4)
            if (r0 == 0) goto Le9
            goto L38
        L32:
            boolean r0 = r1.equals(r5)
            if (r0 == 0) goto Le9
        L38:
            java.lang.String r7 = java.lang.String.valueOf(r8)
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "HTTP Scheme not supported for URL: "
            java.lang.String r7 = r9.concat(r7)
            r8.<init>(r7)
            uhp r7 = defpackage.sfy.B(r8)
            return r7
        L4c:
            java.lang.String r2 = "android.resource"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto Le9
            android.content.Context r7 = r6.a     // Catch: java.io.FileNotFoundException -> Le3
            int r8 = defpackage.sgg.a     // Catch: java.io.FileNotFoundException -> Le3
            sgf r8 = defpackage.sgf.a     // Catch: java.io.FileNotFoundException -> Le3
            android.content.ContentResolver r9 = r7.getContentResolver()     // Catch: java.io.FileNotFoundException -> Le3
            android.net.Uri r10 = defpackage.sgg.a(r0)     // Catch: java.io.FileNotFoundException -> Le3
            java.lang.String r0 = r10.getScheme()     // Catch: java.io.FileNotFoundException -> Le3
            boolean r1 = r2.equals(r0)     // Catch: java.io.FileNotFoundException -> Le3
            if (r1 == 0) goto L71
            java.io.InputStream r7 = r9.openInputStream(r10)     // Catch: java.io.FileNotFoundException -> Le3
            goto Lb2
        L71:
            boolean r1 = r4.equals(r0)     // Catch: java.io.FileNotFoundException -> Le3
            if (r1 == 0) goto L8d
            boolean r7 = defpackage.sgg.f(r7, r10, r8)     // Catch: java.io.FileNotFoundException -> Le3
            if (r7 == 0) goto L85
            java.io.InputStream r7 = r9.openInputStream(r10)     // Catch: java.io.FileNotFoundException -> Le3
            defpackage.sgg.d(r7)     // Catch: java.io.FileNotFoundException -> Le3
            goto Lb2
        L85:
            java.io.FileNotFoundException r7 = new java.io.FileNotFoundException     // Catch: java.io.FileNotFoundException -> Le3
            java.lang.String r8 = "Can't open content uri."
            r7.<init>(r8)     // Catch: java.io.FileNotFoundException -> Le3
            throw r7     // Catch: java.io.FileNotFoundException -> Le3
        L8d:
            boolean r0 = r5.equals(r0)     // Catch: java.io.FileNotFoundException -> Le3
            if (r0 == 0) goto Ldb
            java.io.File r0 = new java.io.File     // Catch: java.io.FileNotFoundException -> Le3
            java.lang.String r1 = r10.getPath()     // Catch: java.io.FileNotFoundException -> Le3
            r0.<init>(r1)     // Catch: java.io.FileNotFoundException -> Le3
            java.io.File r0 = r0.getCanonicalFile()     // Catch: java.io.IOException -> Lcf
            android.net.Uri r0 = android.net.Uri.fromFile(r0)     // Catch: java.io.FileNotFoundException -> Le3
            java.lang.String r1 = "r"
            android.os.ParcelFileDescriptor r9 = r9.openFileDescriptor(r0, r1)     // Catch: java.io.FileNotFoundException -> Le3
            defpackage.sgg.c(r7, r9, r10, r8)     // Catch: java.io.IOException -> Lbb java.io.FileNotFoundException -> Lca
            android.os.ParcelFileDescriptor$AutoCloseInputStream r7 = new android.os.ParcelFileDescriptor$AutoCloseInputStream     // Catch: java.io.IOException -> Lbb java.io.FileNotFoundException -> Lca
            r7.<init>(r9)     // Catch: java.io.IOException -> Lbb java.io.FileNotFoundException -> Lca
        Lb2:
            android.graphics.Bitmap r7 = android.graphics.BitmapFactory.decodeStream(r7)     // Catch: java.io.FileNotFoundException -> Le3
            uhp r7 = defpackage.sfy.C(r7)     // Catch: java.io.FileNotFoundException -> Le3
            return r7
        Lbb:
            r7 = move-exception
            java.io.FileNotFoundException r8 = new java.io.FileNotFoundException     // Catch: java.io.FileNotFoundException -> Le3
            java.lang.String r10 = "Validation failed."
            r8.<init>(r10)     // Catch: java.io.FileNotFoundException -> Le3
            r8.initCause(r7)     // Catch: java.io.FileNotFoundException -> Le3
            defpackage.sgg.b(r9, r8)     // Catch: java.io.FileNotFoundException -> Le3
            throw r8     // Catch: java.io.FileNotFoundException -> Le3
        Lca:
            r7 = move-exception
            defpackage.sgg.b(r9, r7)     // Catch: java.io.FileNotFoundException -> Le3
            throw r7     // Catch: java.io.FileNotFoundException -> Le3
        Lcf:
            r7 = move-exception
            java.io.FileNotFoundException r8 = new java.io.FileNotFoundException     // Catch: java.io.FileNotFoundException -> Le3
            java.lang.String r9 = "Canonicalization failed."
            r8.<init>(r9)     // Catch: java.io.FileNotFoundException -> Le3
            r8.initCause(r7)     // Catch: java.io.FileNotFoundException -> Le3
            throw r8     // Catch: java.io.FileNotFoundException -> Le3
        Ldb:
            java.io.FileNotFoundException r7 = new java.io.FileNotFoundException     // Catch: java.io.FileNotFoundException -> Le3
            java.lang.String r8 = "Unsupported scheme"
            r7.<init>(r8)     // Catch: java.io.FileNotFoundException -> Le3
            throw r7     // Catch: java.io.FileNotFoundException -> Le3
        Le3:
            r7 = move-exception
            uhp r7 = defpackage.sfy.B(r7)
            return r7
        Le9:
            qpl r0 = r6.b
            uhp r7 = r0.a(r7, r8, r9, r10)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qpn.a(java.lang.String, java.lang.String, int, int):uhp");
    }
}
