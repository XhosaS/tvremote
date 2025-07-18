package defpackage;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eps implements epu {
    public final Map a;
    private final eer b;
    private final String c;
    private final boolean d;

    public eps(String str, boolean z, eer eerVar) {
        boolean z2 = true;
        if (z && TextUtils.isEmpty(str)) {
            z2 = false;
        }
        a.H(z2);
        this.b = eerVar;
        this.c = str;
        this.d = z;
        this.a = new HashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000c  */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.CharSequence, java.lang.Object] */
    @Override // defpackage.epu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final byte[] a(java.util.UUID r6, defpackage.eph r7) throws defpackage.epv {
        /*
            r5 = this;
            boolean r0 = r5.d
            if (r0 != 0) goto Lc
            java.lang.Object r0 = r7.c
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto Le
        Lc:
            java.lang.String r0 = r5.c
        Le:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L5e
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.util.UUID r2 = defpackage.dys.e
            boolean r3 = r2.equals(r6)
            if (r3 == 0) goto L24
            java.lang.String r3 = "text/xml"
            goto L31
        L24:
            java.util.UUID r3 = defpackage.dys.c
            boolean r3 = r3.equals(r6)
            if (r3 == 0) goto L2f
            java.lang.String r3 = "application/json"
            goto L31
        L2f:
            java.lang.String r3 = "application/octet-stream"
        L31:
            java.lang.String r4 = "Content-Type"
            r1.put(r4, r3)
            boolean r6 = r2.equals(r6)
            if (r6 == 0) goto L43
            java.lang.String r6 = "SOAPAction"
            java.lang.String r2 = "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense"
            r1.put(r6, r2)
        L43:
            java.util.Map r6 = r5.a
            monitor-enter(r6)
            r1.putAll(r6)     // Catch: java.lang.Throwable -> L5b
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L5b
            eer r6 = r5.b
            java.lang.Object r7 = r7.b
            ees r6 = r6.a()
            byte[] r7 = (byte[]) r7
            java.lang.String r0 = (java.lang.String) r0
            byte[] r6 = defpackage.cme.B(r6, r0, r7, r1)
            return r6
        L5b:
            r7 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L5b
            throw r7
        L5e:
            epv r6 = new epv
            eex r7 = new eex
            r7.<init>()
            android.net.Uri r0 = android.net.Uri.EMPTY
            r7.a = r0
            r7.a()
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "No license URL"
            r7.<init>(r0)
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eps.a(java.util.UUID, eph):byte[]");
    }

    @Override // defpackage.epu
    public final byte[] b(UUID uuid, epm epmVar) {
        return cme.B(this.b.a(), ((String) epmVar.b) + "&signedRequest=" + edt.S((byte[]) epmVar.a), null, Collections.EMPTY_MAP);
    }
}
