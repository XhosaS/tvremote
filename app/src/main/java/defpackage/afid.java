package defpackage;

import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class afid {
    public static final /* synthetic */ int c = 0;
    private static final BitSet d;
    public final String a;
    public final byte[] b;
    private final String e;

    static {
        BitSet bitSet = new BitSet(127);
        bitSet.set(45);
        bitSet.set(95);
        bitSet.set(46);
        for (char c2 = '0'; c2 <= '9'; c2 = (char) (c2 + 1)) {
            bitSet.set(c2);
        }
        for (char c3 = 'a'; c3 <= 'z'; c3 = (char) (c3 + 1)) {
            bitSet.set(c3);
        }
        d = bitSet;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0059 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0057 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public afid(java.lang.String r10, boolean r11) {
        /*
            r9 = this;
            r9.<init>()
            r10.getClass()
            r9.e = r10
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r10 = r10.toLowerCase(r0)
            r10.getClass()
            boolean r0 = r10.isEmpty()
            r1 = 1
            r0 = r0 ^ r1
            java.lang.String r2 = "token must have at least 1 tchar"
            defpackage.yqw.B(r0, r2)
            java.lang.String r0 = "connection"
            boolean r0 = r10.equals(r0)
            r2 = 0
            if (r0 == 0) goto L39
            java.util.logging.Logger r3 = defpackage.afih.a
            java.util.logging.Level r4 = java.util.logging.Level.WARNING
            java.lang.RuntimeException r8 = new java.lang.RuntimeException
            java.lang.String r0 = "exception to show backtrace"
            r8.<init>(r0)
            java.lang.String r6 = "validateName"
            java.lang.String r7 = "Metadata key is 'Connection', which should not be used. That is used by HTTP/1 for connection-specific headers which are not to be forwarded. There is probably an HTTP/1 conversion bug. Simply removing the Connection header is not enough; you should remove all headers it references as well. See RFC 7230 section 6.1"
            java.lang.String r5 = "io.grpc.Metadata$Key"
            r3.logp(r4, r5, r6, r7, r8)
        L39:
            r0 = r2
        L3a:
            int r3 = r10.length()
            if (r0 >= r3) goto L70
            char r3 = r10.charAt(r0)
            if (r11 == 0) goto L4f
            r4 = 58
            if (r3 != r4) goto L4f
            if (r0 != 0) goto L4e
            r0 = r2
            goto L57
        L4e:
            r3 = r4
        L4f:
            java.util.BitSet r4 = defpackage.afid.d
            boolean r4 = r4.get(r3)
            if (r4 == 0) goto L59
        L57:
            int r0 = r0 + r1
            goto L3a
        L59:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.Character r0 = java.lang.Character.valueOf(r3)
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r2] = r0
            r3[r1] = r10
            java.lang.String r10 = "Invalid character '%s' in key name '%s'"
            java.lang.String r10 = defpackage.yro.a(r10, r3)
            r11.<init>(r10)
            throw r11
        L70:
            r9.a = r10
            java.nio.charset.Charset r11 = java.nio.charset.StandardCharsets.US_ASCII
            byte[] r10 = r10.getBytes(r11)
            r9.b = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afid.<init>(java.lang.String, boolean):void");
    }

    public abstract Object a(byte[] bArr);

    public abstract byte[] b(Object obj);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.a.equals(((afid) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Key{name='" + this.a + "'}";
    }
}
