package j$.time.format;

/* renamed from: j$.time.format.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0065h implements InterfaceC0062e {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ C0065h(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public static void a(StringBuilder sb, int i) {
        sb.append((char) ((i / 10) + 48));
        sb.append((char) ((i % 10) + 48));
    }

    public static int b(CharSequence charSequence, int i) {
        char cCharAt = charSequence.charAt(i);
        if (cCharAt < '0' || cCharAt > '9') {
            return -1;
        }
        return cCharAt - '0';
    }

    @Override // j$.time.format.InterfaceC0062e
    public final boolean i(y yVar, StringBuilder sb) {
        switch (this.a) {
            case 0:
                Long lA = yVar.a(j$.time.temporal.a.OFFSET_SECONDS);
                if (lA != null) {
                    sb.append("GMT");
                    int iZ = j$.desugar.sun.nio.fs.g.z(lA.longValue());
                    if (iZ != 0) {
                        int iAbs = Math.abs((iZ / 3600) % 100);
                        int iAbs2 = Math.abs((iZ / 60) % 60);
                        int iAbs3 = Math.abs(iZ % 60);
                        sb.append(iZ < 0 ? "-" : "+");
                        if (((G) this.b) != G.FULL) {
                            if (iAbs >= 10) {
                                sb.append((char) ((iAbs / 10) + 48));
                            }
                            sb.append((char) ((iAbs % 10) + 48));
                            if (iAbs2 != 0 || iAbs3 != 0) {
                                sb.append(':');
                                a(sb, iAbs2);
                                if (iAbs3 != 0) {
                                    sb.append(':');
                                    a(sb, iAbs3);
                                    break;
                                }
                            }
                        } else {
                            a(sb, iAbs);
                            sb.append(':');
                            a(sb, iAbs2);
                            if (iAbs3 != 0) {
                                sb.append(':');
                                a(sb, iAbs3);
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                sb.append((String) this.b);
                break;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x0124 A[PHI: r6 r14
  0x0124: PHI (r6v3 int) = (r6v2 int), (r6v4 int), (r6v4 int), (r6v4 int), (r6v4 int), (r6v4 int), (r6v4 int) binds: [B:50:0x00ce, B:55:0x00de, B:57:0x00e4, B:58:0x00e6, B:60:0x00ec, B:62:0x00f8, B:63:0x00fa] A[DONT_GENERATE, DONT_INLINE]
  0x0124: PHI (r14v5 int) = (r14v4 int), (r14v7 int), (r14v7 int), (r14v7 int), (r14v7 int), (r14v7 int), (r14v7 int) binds: [B:50:0x00ce, B:55:0x00de, B:57:0x00e4, B:58:0x00e6, B:60:0x00ec, B:62:0x00f8, B:63:0x00fa] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // j$.time.format.InterfaceC0062e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int l(j$.time.format.v r12, java.lang.CharSequence r13, int r14) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.format.C0065h.l(j$.time.format.v, java.lang.CharSequence, int):int");
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return "LocalizedOffset(" + String.valueOf((G) this.b) + ")";
            default:
                return "'" + ((String) this.b).replace("'", "''") + "'";
        }
    }
}
