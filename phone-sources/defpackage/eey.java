package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eey {
    public final Uri a;
    public final long b;
    public final int c;
    public final byte[] d;
    public final Map e;
    public final long f;
    public final long g;
    public final String h;
    public final int i;

    static {
        dzz.b("media3.datasource");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public eey(android.net.Uri r6, long r7, int r9, byte[] r10, java.util.Map r11, long r12, long r14, java.lang.String r16, int r17) {
        /*
            r5 = this;
            r5.<init>()
            long r0 = r7 + r12
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 0
            r4 = 1
            if (r0 < 0) goto Lf
            r0 = r4
            goto L10
        Lf:
            r0 = r1
        L10:
            defpackage.a.H(r0)
            int r0 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r0 < 0) goto L19
            r0 = r4
            goto L1a
        L19:
            r0 = r1
        L1a:
            defpackage.a.H(r0)
            int r0 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r0 > 0) goto L2a
            r2 = -1
            int r0 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r0 != 0) goto L28
            goto L2b
        L28:
            r2 = r14
            goto L2c
        L2a:
            r2 = r14
        L2b:
            r1 = r4
        L2c:
            defpackage.a.H(r1)
            defpackage.a.aq(r6)
            r5.a = r6
            r5.b = r7
            r5.c = r9
            r6 = 0
            if (r10 == 0) goto L3e
            int r7 = r10.length
            if (r7 != 0) goto L3f
        L3e:
            r10 = r6
        L3f:
            r5.d = r10
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>(r11)
            java.util.Map r6 = j$.util.DesugarCollections.unmodifiableMap(r6)
            r5.e = r6
            r5.f = r12
            r5.g = r2
            r6 = r16
            r5.h = r6
            r6 = r17
            r5.i = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eey.<init>(android.net.Uri, long, int, byte[], java.util.Map, long, long, java.lang.String, int):void");
    }

    public static String e(int i) {
        if (i == 1) {
            return "GET";
        }
        if (i == 2) {
            return "POST";
        }
        throw new IllegalStateException();
    }

    public final eey a(long j) {
        long j2 = this.g;
        return b(j, j2 != -1 ? j2 - j : -1L);
    }

    public final eey b(long j, long j2) {
        long j3 = 0;
        if (j != 0) {
            j3 = j;
        } else if (this.g == j2) {
            return this;
        }
        return new eey(this.a, this.b, this.c, this.d, this.e, this.f + j3, j2, this.h, this.i);
    }

    public final eey c(Uri uri) {
        return new eey(uri, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
    }

    public final String d() {
        return e(this.c);
    }

    public final boolean f(int i) {
        return (this.i & i) == i;
    }

    public final String toString() {
        Uri uri = this.a;
        return "DataSpec[" + d() + " " + uri.toString() + ", " + this.f + ", " + this.g + ", " + this.h + ", " + this.i + "]";
    }

    @Deprecated
    public eey(Uri uri, long j, long j2, String str) {
        this(uri, 0L, 1, null, Collections.EMPTY_MAP, j, j2, str, 0);
    }
}
