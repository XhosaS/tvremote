package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class djd implements daq {
    public static final dam a = new dam("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality", 90, dam.a);
    public static final dam b = new dam("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat", null, dam.a);
    private final ddx c;

    @Deprecated
    public djd() {
        this.c = null;
    }

    @Override // defpackage.daq
    public final int b() {
        return 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0075  */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v9 */
    @Override // defpackage.czt
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(defpackage.ddp r9, java.io.File r10, defpackage.dan r11) throws java.lang.Throwable {
        /*
            r8 = this;
            java.lang.String r0 = "BitmapEncoder"
            java.lang.String r1 = "Compressed with type: "
            java.lang.Object r9 = r9.c()
            android.graphics.Bitmap r9 = (android.graphics.Bitmap) r9
            dam r2 = defpackage.djd.b
            java.lang.Object r2 = r11.b(r2)
            android.graphics.Bitmap$CompressFormat r2 = (android.graphics.Bitmap.CompressFormat) r2
            if (r2 != 0) goto L1f
            boolean r2 = r9.hasAlpha()
            if (r2 == 0) goto L1d
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.PNG
            goto L1f
        L1d:
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.JPEG
        L1f:
            r9.getWidth()
            r9.getHeight()
            int r3 = defpackage.dqf.a
            long r3 = android.os.SystemClock.elapsedRealtimeNanos()
            dam r5 = defpackage.djd.a
            java.lang.Object r5 = r11.b(r5)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r6 = 0
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L53 java.io.IOException -> L55
            r7.<init>(r10)     // Catch: java.lang.Throwable -> L53 java.io.IOException -> L55
            ddx r10 = r8.c     // Catch: java.lang.Throwable -> L57 java.io.IOException -> L5a
            if (r10 == 0) goto L47
            dau r6 = new dau     // Catch: java.lang.Throwable -> L57 java.io.IOException -> L5a
            r6.<init>(r7, r10)     // Catch: java.lang.Throwable -> L57 java.io.IOException -> L5a
            goto L48
        L47:
            r6 = r7
        L48:
            r9.compress(r2, r5, r6)     // Catch: java.lang.Throwable -> L53 java.io.IOException -> L55
            r6.close()     // Catch: java.lang.Throwable -> L53 java.io.IOException -> L55
            r10 = 1
            r6.close()     // Catch: java.io.IOException -> L6e java.lang.Throwable -> Lc5
            goto L6e
        L53:
            r9 = move-exception
            goto Lbf
        L55:
            r10 = move-exception
            goto L5c
        L57:
            r9 = move-exception
            r6 = r7
            goto Lbf
        L5a:
            r10 = move-exception
            r6 = r7
        L5c:
            r5 = 3
            boolean r5 = android.util.Log.isLoggable(r0, r5)     // Catch: java.lang.Throwable -> L53
            if (r5 == 0) goto L68
            java.lang.String r5 = "Failed to encode Bitmap"
            android.util.Log.d(r0, r5, r10)     // Catch: java.lang.Throwable -> L53
        L68:
            r10 = 0
            if (r6 == 0) goto L6e
            r6.close()     // Catch: java.io.IOException -> L6e java.lang.Throwable -> Lc5
        L6e:
            r5 = 2
            boolean r5 = android.util.Log.isLoggable(r0, r5)
            if (r5 == 0) goto Lbe
            java.lang.String r2 = java.lang.String.valueOf(r2)
            int r5 = defpackage.dqm.a(r9)
            double r3 = defpackage.dqf.a(r3)
            dam r6 = defpackage.djd.b
            java.lang.Object r11 = r11.b(r6)
            java.lang.String r11 = java.lang.String.valueOf(r11)
            boolean r9 = r9.hasAlpha()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r1)
            r6.append(r2)
            java.lang.String r1 = " of size "
            r6.append(r1)
            r6.append(r5)
            java.lang.String r1 = " in "
            r6.append(r1)
            r6.append(r3)
            java.lang.String r1 = ", options format: "
            r6.append(r1)
            r6.append(r11)
            java.lang.String r11 = ", hasAlpha: "
            r6.append(r11)
            r6.append(r9)
            java.lang.String r9 = r6.toString()
            android.util.Log.v(r0, r9)
        Lbe:
            return r10
        Lbf:
            if (r6 == 0) goto Lc7
            r6.close()     // Catch: java.lang.Throwable -> Lc5 java.io.IOException -> Lc7
            goto Lc7
        Lc5:
            r9 = move-exception
            throw r9
        Lc7:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.djd.a(ddp, java.io.File, dan):boolean");
    }

    public djd(ddx ddxVar) {
        this.c = ddxVar;
    }
}
