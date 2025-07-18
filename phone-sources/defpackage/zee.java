package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zee {
    public static final zgn a;
    private static final String[] b;
    private static final String[] c;
    private static final String[] d;

    static {
        zgn zgnVar = zgn.a;
        a = wcq.aD("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
        b = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        c = new String[64];
        String[] strArr = new String[256];
        for (int i = 0; i < 256; i++) {
            strArr[i] = ylh.X(zcr.j("%8s", Integer.toBinaryString(i)), ' ', '0');
        }
        d = strArr;
        String[] strArr2 = c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        for (int i2 = 0; i2 <= 0; i2++) {
            int i3 = iArr[i2];
            String[] strArr3 = c;
            strArr3[i3 | 8] = String.valueOf(strArr3[i3]).concat("|PADDED");
        }
        String[] strArr4 = c;
        strArr4[4] = "END_HEADERS";
        strArr4[32] = "PRIORITY";
        strArr4[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i4 = 0; i4 < 3; i4++) {
            int i5 = iArr2[i4];
            for (int i6 = 0; i6 <= 0; i6++) {
                int i7 = iArr[i6];
                int i8 = i7 | i5;
                String[] strArr5 = c;
                strArr5[i8] = strArr5[i7] + "|" + strArr5[i5];
                strArr5[i8 | 8] = strArr5[i7] + "|" + strArr5[i5] + "|PADDED";
            }
        }
        int length = c.length;
        for (int i9 = 0; i9 < 64; i9++) {
            String[] strArr6 = c;
            if (strArr6[i9] == null) {
                strArr6[i9] = d[i9];
            }
        }
    }

    private zee() {
    }

    public static final String a(int i) {
        String[] strArr = b;
        int length = strArr.length;
        return i < 10 ? strArr[i] : zcr.j("0x%02x", Integer.valueOf(i));
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String b(boolean r8, int r9, int r10, int r11, int r12) {
        /*
            java.lang.String r0 = a(r11)
            r1 = 5
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 4
            if (r12 != 0) goto Le
            java.lang.String r11 = ""
            goto L5d
        Le:
            if (r11 == r3) goto L59
            if (r11 == r2) goto L59
            if (r11 == r5) goto L4f
            r6 = 6
            if (r11 == r6) goto L4f
            r6 = 7
            if (r11 == r6) goto L59
            r6 = 8
            if (r11 == r6) goto L59
            java.lang.String[] r6 = defpackage.zee.c
            int r7 = r6.length
            r7 = 64
            if (r12 >= r7) goto L2b
            r6 = r6[r12]
            r6.getClass()
            goto L2f
        L2b:
            java.lang.String[] r6 = defpackage.zee.d
            r6 = r6[r12]
        L2f:
            if (r11 != r1) goto L3e
            r11 = r12 & 4
            if (r11 == 0) goto L4d
            java.lang.String r11 = "HEADERS"
            java.lang.String r12 = "PUSH_PROMISE"
            java.lang.String r11 = defpackage.ylh.Y(r6, r11, r12)
            goto L5d
        L3e:
            if (r11 != 0) goto L4d
            r11 = r12 & 32
            if (r11 == 0) goto L4d
            java.lang.String r11 = "PRIORITY"
            java.lang.String r12 = "COMPRESSED"
            java.lang.String r11 = defpackage.ylh.Y(r6, r11, r12)
            goto L5d
        L4d:
            r11 = r6
            goto L5d
        L4f:
            if (r12 != r4) goto L54
            java.lang.String r11 = "ACK"
            goto L5d
        L54:
            java.lang.String[] r11 = defpackage.zee.d
            r11 = r11[r12]
            goto L5d
        L59:
            java.lang.String[] r11 = defpackage.zee.d
            r11 = r11[r12]
        L5d:
            if (r4 == r8) goto L62
            java.lang.String r8 = ">>"
            goto L64
        L62:
            java.lang.String r8 = "<<"
        L64:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            java.lang.Object[] r12 = new java.lang.Object[r1]
            r1 = 0
            r12[r1] = r8
            r12[r4] = r9
            r12[r3] = r10
            r12[r2] = r0
            r12[r5] = r11
            java.lang.String r8 = "%s 0x%08x %5d %-13s %s"
            java.lang.String r8 = defpackage.zcr.j(r8, r12)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zee.b(boolean, int, int, int, int):java.lang.String");
    }
}
