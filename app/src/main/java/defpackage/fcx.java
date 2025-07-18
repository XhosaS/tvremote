package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fcx {
    public static final fcx a = new fcx();
    public static final zdy b = zdy.h("com/google/android/apps/tvsearch/cast/info/CastContentProviderAdapter");
    private static final Uri c = Uri.parse("content://com.google.android.tvsetup.app.machine.services.castsetup.castsetupinfo.CastInfoProvider/cast_infos");

    private fcx() {
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.vrs r12, defpackage.agsw r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof defpackage.fcv
            if (r0 == 0) goto L13
            r0 = r13
            fcv r0 = (defpackage.fcv) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            fcv r0 = new fcv
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.a
            agtg r1 = defpackage.agtg.a
            int r2 = r0.c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L28
            defpackage.agpl.b(r13)     // Catch: defpackage.vsq -> L93
            goto L62
        L28:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L30:
            defpackage.agpl.b(r13)
            android.net.Uri r7 = defpackage.fcx.c     // Catch: defpackage.vsq -> L93
            r7.getClass()     // Catch: defpackage.vsq -> L93
            java.lang.String r13 = "cloud_device_id"
            java.lang.String r2 = "cast_creds"
            java.lang.String[] r8 = new java.lang.String[]{r13, r2}     // Catch: defpackage.vsq -> L93
            android.os.Bundle r9 = new android.os.Bundle     // Catch: defpackage.vsq -> L93
            r9.<init>()     // Catch: defpackage.vsq -> L93
            java.lang.String r13 = "android:query-arg-limit"
            r9.putInt(r13, r4)     // Catch: defpackage.vsq -> L93
            fcw r10 = defpackage.fcw.a     // Catch: defpackage.vsq -> L93
            r0.c = r4     // Catch: defpackage.vsq -> L93
            r13 = r12
            vrz r13 = (defpackage.vrz) r13     // Catch: defpackage.vsq -> L93
            agte r13 = r13.a     // Catch: defpackage.vsq -> L93
            vru r5 = new vru     // Catch: defpackage.vsq -> L93
            r6 = r12
            vrz r6 = (defpackage.vrz) r6     // Catch: defpackage.vsq -> L93
            r5.<init>()     // Catch: defpackage.vsq -> L93
            java.lang.Object r13 = defpackage.vsd.b(r13, r5, r0)     // Catch: defpackage.vsq -> L93
            if (r13 != r1) goto L62
            return r1
        L62:
            java.lang.Iterable r13 = (java.lang.Iterable) r13     // Catch: defpackage.vsq -> L93
            java.util.Iterator r12 = r13.iterator()     // Catch: defpackage.vsq -> L93
            r13 = 0
            r0 = r3
        L6a:
            boolean r1 = r12.hasNext()     // Catch: defpackage.vsq -> L93
            if (r1 == 0) goto L8d
            java.lang.Object r1 = r12.next()     // Catch: defpackage.vsq -> L93
            r2 = r1
            fcy r2 = (defpackage.fcy) r2     // Catch: defpackage.vsq -> L93
            java.lang.String r5 = r2.a     // Catch: defpackage.vsq -> L93
            int r5 = r5.length()     // Catch: defpackage.vsq -> L93
            if (r5 <= 0) goto L6a
            java.lang.String r2 = r2.b     // Catch: defpackage.vsq -> L93
            int r2 = r2.length()     // Catch: defpackage.vsq -> L93
            if (r2 <= 0) goto L6a
            if (r13 == 0) goto L8a
            goto L8f
        L8a:
            r0 = r1
            r13 = r4
            goto L6a
        L8d:
            if (r13 != 0) goto L90
        L8f:
            r0 = r3
        L90:
            fcy r0 = (defpackage.fcy) r0     // Catch: defpackage.vsq -> L93
            return r0
        L93:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fcx.a(vrs, agsw):java.lang.Object");
    }
}
