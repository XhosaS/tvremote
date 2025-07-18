package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agdo {
    private static final String[] a = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
    private static final String[] b = new String[64];
    private static final String[] c = new String[256];

    static {
        for (int i = 0; i < 256; i++) {
            c[i] = String.format("%8s", Integer.toBinaryString(i)).replace(' ', '0');
        }
        String[] strArr = b;
        strArr[0] = "";
        strArr[1] = "END_STREAM";
        int[] iArr = {1};
        strArr[8] = "PADDED";
        for (int i2 = 0; i2 <= 0; i2++) {
            int i3 = iArr[i2];
            String[] strArr2 = b;
            strArr2[i3 | 8] = String.valueOf(strArr2[i3]).concat("|PADDED");
        }
        String[] strArr3 = b;
        strArr3[4] = "END_HEADERS";
        strArr3[32] = "PRIORITY";
        strArr3[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i4 = 0; i4 < 3; i4++) {
            int i5 = iArr2[i4];
            for (int i6 = 0; i6 <= 0; i6++) {
                int i7 = iArr[i6];
                int i8 = i7 | i5;
                String[] strArr4 = b;
                strArr4[i8] = strArr4[i7] + "|" + strArr4[i5];
                strArr4[i8 | 8] = strArr4[i7] + "|" + strArr4[i5] + "|PADDED";
            }
        }
        for (int i9 = 0; i9 < 64; i9++) {
            String[] strArr5 = b;
            if (strArr5[i9] == null) {
                strArr5[i9] = c[i9];
            }
        }
    }

    agdo() {
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String a(boolean r8, int r9, int r10, byte r11, byte r12) {
        /*
            r0 = 10
            r1 = 0
            r2 = 1
            if (r11 >= r0) goto Lb
            java.lang.String[] r0 = defpackage.agdo.a
            r0 = r0[r11]
            goto L19
        Lb:
            java.lang.Byte r0 = java.lang.Byte.valueOf(r11)
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r3[r1] = r0
            java.lang.String r0 = "0x%02x"
            java.lang.String r0 = java.lang.String.format(r0, r3)
        L19:
            r3 = 5
            r4 = 3
            r5 = 2
            r6 = 4
            if (r12 != 0) goto L22
            java.lang.String r11 = ""
            goto L6d
        L22:
            if (r11 == r5) goto L69
            if (r11 == r4) goto L69
            if (r11 == r6) goto L5f
            r7 = 6
            if (r11 == r7) goto L5f
            r7 = 7
            if (r11 == r7) goto L69
            r7 = 8
            if (r11 == r7) goto L69
            r7 = 64
            if (r12 >= r7) goto L3b
            java.lang.String[] r7 = defpackage.agdo.b
            r7 = r7[r12]
            goto L3f
        L3b:
            java.lang.String[] r7 = defpackage.agdo.c
            r7 = r7[r12]
        L3f:
            if (r11 != r3) goto L4e
            r11 = r12 & 4
            if (r11 == 0) goto L5d
            java.lang.String r11 = "HEADERS"
            java.lang.String r12 = "PUSH_PROMISE"
            java.lang.String r11 = r7.replace(r11, r12)
            goto L6d
        L4e:
            if (r11 != 0) goto L5d
            r11 = r12 & 32
            if (r11 == 0) goto L5d
            java.lang.String r11 = "PRIORITY"
            java.lang.String r12 = "COMPRESSED"
            java.lang.String r11 = r7.replace(r11, r12)
            goto L6d
        L5d:
            r11 = r7
            goto L6d
        L5f:
            if (r12 != r2) goto L64
            java.lang.String r11 = "ACK"
            goto L6d
        L64:
            java.lang.String[] r11 = defpackage.agdo.c
            r11 = r11[r12]
            goto L6d
        L69:
            java.lang.String[] r11 = defpackage.agdo.c
            r11 = r11[r12]
        L6d:
            java.util.Locale r12 = java.util.Locale.US
            if (r2 == r8) goto L74
            java.lang.String r8 = ">>"
            goto L76
        L74:
            java.lang.String r8 = "<<"
        L76:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r1] = r8
            r3[r2] = r9
            r3[r5] = r10
            r3[r4] = r0
            r3[r6] = r11
            java.lang.String r8 = "%s 0x%08x %5d %-13s %s"
            java.lang.String r8 = java.lang.String.format(r12, r8, r3)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agdo.a(boolean, int, int, byte, byte):java.lang.String");
    }
}
