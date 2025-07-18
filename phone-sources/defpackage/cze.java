package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class cze implements czh {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public cze(ajf ajfVar, int i) {
        this.b = i;
        this.a = ajfVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009a A[PHI: r9
  0x009a: PHI (r9v1 android.os.Bundle) = (r9v12 android.os.Bundle), (r9v13 android.os.Bundle), (r9v14 android.os.Bundle) binds: [B:23:0x0071, B:25:0x0074, B:31:0x008b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d6 A[RETURN] */
    /* JADX WARN: Type inference failed for: r8v13, types: [android.os.Parcelable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v5, types: [android.os.Parcelable, java.lang.Object] */
    @Override // defpackage.czh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(defpackage.cvw r7, int r8, android.os.Bundle r9) {
        /*
            r6 = this;
            int r0 = r6.b
            r1 = 0
            r2 = 25
            r3 = 1
            if (r0 == 0) goto L6f
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r2) goto L32
            r8 = r8 & r3
            if (r8 == 0) goto L32
            r7.j()     // Catch: java.lang.Exception -> L2d
            java.lang.Object r8 = r7.i()
            r8.getClass()
            if (r9 != 0) goto L21
            android.os.Bundle r9 = new android.os.Bundle
            r9.<init>()
            goto L27
        L21:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>(r9)
            r9 = r0
        L27:
            java.lang.String r0 = "EXTRA_INPUT_CONTENT_INFO"
            r9.putParcelable(r0, r8)
            goto L32
        L2d:
            r7 = move-exception
            r7.toString()
            goto L6e
        L32:
            java.lang.Object r8 = r6.a
            android.content.ClipData r9 = new android.content.ClipData
            android.content.ClipDescription r0 = r7.f()
            android.content.ClipData$Item r2 = new android.content.ClipData$Item
            android.net.Uri r4 = r7.g()
            r2.<init>(r4)
            r9.<init>(r0, r2)
            cvw r0 = new cvw
            r2 = 0
            r0.<init>(r9, r2)
            r7.f()
            r7.h()
            cb r7 = new cb
            r7.<init>(r0)
            ajf r8 = (defpackage.ajf) r8
            aik r8 = r8.a
            sp r8 = r8.d
            if (r8 == 0) goto L6e
            so r8 = r8.a()
            cb r8 = r8.c()
            boolean r7 = defpackage.yks.e(r8, r7)
            if (r7 != 0) goto L6e
            return r3
        L6e:
            return r1
        L6f:
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r2) goto L9a
            r8 = r8 & r3
            if (r8 == 0) goto L9a
            r7.j()     // Catch: java.lang.Exception -> L91
            java.lang.Object r8 = r7.i()
            if (r9 != 0) goto L85
            android.os.Bundle r9 = new android.os.Bundle
            r9.<init>()
            goto L8b
        L85:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>(r9)
            r9 = r0
        L8b:
            java.lang.String r0 = "androidx.core.view.extra.INPUT_CONTENT_INFO"
            r9.putParcelable(r0, r8)
            goto L9a
        L91:
            r7 = move-exception
            java.lang.String r8 = "InputConnectionCompat"
            java.lang.String r9 = "Can't insert content from IME; requestPermission() failed"
            android.util.Log.w(r8, r9, r7)
            goto Ld7
        L9a:
            java.lang.Object r8 = r6.a
            android.content.ClipData r0 = new android.content.ClipData
            android.content.ClipDescription r2 = r7.f()
            android.content.ClipData$Item r4 = new android.content.ClipData$Item
            android.net.Uri r5 = r7.g()
            r4.<init>(r5)
            r0.<init>(r2, r4)
            int r2 = android.os.Build.VERSION.SDK_INT
            r4 = 31
            r5 = 2
            if (r2 < r4) goto Lbb
            cus r2 = new cus
            r2.<init>(r0, r5)
            goto Lc0
        Lbb:
            cuu r2 = new cuu
            r2.<init>(r0, r5)
        Lc0:
            android.net.Uri r7 = r7.h()
            r2.d(r7)
            r2.b(r9)
            cuy r7 = defpackage.crl.h(r2)
            android.view.View r8 = (android.view.View) r8
            cuy r7 = defpackage.cww.c(r8, r7)
            if (r7 != 0) goto Ld7
            return r3
        Ld7:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cze.a(cvw, int, android.os.Bundle):boolean");
    }

    public /* synthetic */ cze(View view, int i) {
        this.b = i;
        this.a = view;
    }
}
