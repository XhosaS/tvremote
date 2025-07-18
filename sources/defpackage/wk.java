package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class wk extends vr {
    protected final mc j = new mc(64);
    protected int k = -1;
    protected Object l;
    protected int m;

    private final int x(boolean z) {
        boolean z2 = false;
        if (z) {
            for (int i = this.f; i >= this.e; i--) {
                int i2 = f(i).a;
                if (i2 == 0) {
                    z2 = true;
                } else if (z2 && i2 == this.d - 1) {
                    return i;
                }
            }
        } else {
            for (int i3 = this.e; i3 <= this.f; i3++) {
                int i4 = f(i3).a;
                if (i4 == this.d - 1) {
                    z2 = true;
                } else if (z2 && i4 == 0) {
                    return i3;
                }
            }
        }
        return -1;
    }

    @Override // defpackage.vr
    public final int b(boolean z, int i, int[] iArr) {
        int i2;
        int iM = this.i.m(i);
        wj wjVarF = f(i);
        int i3 = wjVarF.a;
        if (this.b) {
            i2 = i3;
            int i4 = i2;
            int i5 = 1;
            int i6 = iM;
            for (int i7 = i + 1; i5 < this.d && i7 <= this.f; i7++) {
                wj wjVarF2 = f(i7);
                i6 += wjVarF2.b;
                int i8 = wjVarF2.a;
                if (i8 != i4) {
                    i5++;
                    if (!z ? i6 < iM : i6 > iM) {
                        iM = i6;
                        i = i7;
                        i2 = i8;
                        i4 = i2;
                    } else {
                        i4 = i8;
                    }
                }
            }
        } else {
            int iO = this.i.o(i) + iM;
            int i9 = 1;
            int i10 = i3;
            for (int i11 = i - 1; i9 < this.d && i11 >= this.e; i11--) {
                iM -= wjVarF.b;
                wjVarF = f(i11);
                int i12 = wjVarF.a;
                if (i12 != i10) {
                    i9++;
                    int iO2 = this.i.o(i11) + iM;
                    if (!z ? iO2 >= iO : iO2 <= iO) {
                        i10 = i12;
                    } else {
                        iO = iO2;
                        i = i11;
                        i3 = i12;
                        i10 = i3;
                    }
                }
            }
            iM = iO;
            i2 = i3;
        }
        if (iArr != null) {
            iArr[0] = i2;
            iArr[1] = i;
        }
        return iM;
    }

    @Override // defpackage.vr
    public final int d(boolean z, int i, int[] iArr) {
        int iO;
        int iM = this.i.m(i);
        wj wjVarF = f(i);
        int i2 = wjVarF.a;
        if (this.b) {
            int i3 = 1;
            iO = iM - this.i.o(i);
            int i4 = i2;
            for (int i5 = i - 1; i3 < this.d && i5 >= this.e; i5--) {
                iM -= wjVarF.b;
                wjVarF = f(i5);
                int i6 = wjVarF.a;
                if (i6 != i4) {
                    i3++;
                    int iO2 = iM - this.i.o(i5);
                    if (!z ? iO2 >= iO : iO2 <= iO) {
                        i4 = i6;
                    } else {
                        iO = iO2;
                        i = i5;
                        i2 = i6;
                        i4 = i2;
                    }
                }
            }
        } else {
            int i7 = i2;
            int i8 = i7;
            int i9 = 1;
            int i10 = iM;
            for (int i11 = i + 1; i9 < this.d && i11 <= this.f; i11++) {
                wj wjVarF2 = f(i11);
                iM += wjVarF2.b;
                int i12 = wjVarF2.a;
                if (i12 != i7) {
                    i9++;
                    if (!z ? iM < i10 : iM > i10) {
                        i10 = iM;
                        i = i11;
                        i7 = i12;
                        i8 = i7;
                    } else {
                        i7 = i12;
                    }
                }
            }
            i2 = i8;
            iO = i10;
        }
        if (iArr != null) {
            iArr[0] = i2;
            iArr[1] = i;
        }
        return iO;
    }

    @Override // defpackage.vr
    public final void g(int i) {
        super.g(i);
        int iS = s() - i;
        mc mcVar = this.j;
        mcVar.d(iS + 1);
        if (mcVar.a() == 0) {
            this.k = -1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:140:0x01a8 A[Catch: all -> 0x0208, LOOP:3: B:140:0x01a8->B:156:0x01cc, LOOP_START, PHI: r0 r13 r14
  0x01a8: PHI (r0v21 int) = (r0v15 int), (r0v25 int) binds: [B:139:0x01a6, B:156:0x01cc] A[DONT_GENERATE, DONT_INLINE]
  0x01a8: PHI (r13v16 int) = (r13v15 int), (r13v17 int) binds: [B:139:0x01a6, B:156:0x01cc] A[DONT_GENERATE, DONT_INLINE]
  0x01a8: PHI (r14v6 int) = (r14v4 int), (r14v7 int) binds: [B:139:0x01a6, B:156:0x01cc] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0208, blocks: (B:11:0x0017, B:13:0x0024, B:15:0x002e, B:28:0x0051, B:31:0x0059, B:33:0x005f, B:34:0x0062, B:36:0x0070, B:37:0x0077, B:39:0x007d, B:40:0x007f, B:42:0x0088, B:48:0x0095, B:49:0x009b, B:53:0x00a4, B:16:0x0037, B:20:0x003e, B:22:0x0045, B:25:0x004a, B:54:0x00a7, B:55:0x00aa, B:57:0x00b6, B:60:0x00bf, B:63:0x00cf, B:65:0x00d3, B:67:0x00d7, B:71:0x00e3, B:68:0x00dc, B:76:0x00f3, B:78:0x00f7, B:84:0x0105, B:86:0x010b, B:88:0x010f, B:89:0x0114, B:101:0x013d, B:105:0x0145, B:110:0x0150, B:112:0x0154, B:117:0x0162, B:119:0x0166, B:122:0x016c, B:138:0x01a0, B:140:0x01a8, B:142:0x01ac, B:149:0x01b9, B:152:0x01c0, B:154:0x01c4, B:156:0x01cc, B:155:0x01c9, B:145:0x01b1, B:158:0x01d8, B:160:0x01dc, B:161:0x01e1, B:121:0x016a, B:124:0x0170, B:126:0x0174, B:130:0x0187, B:132:0x018b, B:133:0x018e, B:127:0x017c, B:134:0x0191, B:136:0x0197, B:137:0x019c, B:113:0x0159, B:168:0x01f7, B:170:0x01fb, B:171:0x0200, B:81:0x00fe, B:72:0x00e6, B:74:0x00ea, B:75:0x00ef, B:92:0x011c, B:95:0x0121, B:97:0x0127, B:99:0x0134), top: B:176:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01c4 A[Catch: all -> 0x0208, TryCatch #0 {all -> 0x0208, blocks: (B:11:0x0017, B:13:0x0024, B:15:0x002e, B:28:0x0051, B:31:0x0059, B:33:0x005f, B:34:0x0062, B:36:0x0070, B:37:0x0077, B:39:0x007d, B:40:0x007f, B:42:0x0088, B:48:0x0095, B:49:0x009b, B:53:0x00a4, B:16:0x0037, B:20:0x003e, B:22:0x0045, B:25:0x004a, B:54:0x00a7, B:55:0x00aa, B:57:0x00b6, B:60:0x00bf, B:63:0x00cf, B:65:0x00d3, B:67:0x00d7, B:71:0x00e3, B:68:0x00dc, B:76:0x00f3, B:78:0x00f7, B:84:0x0105, B:86:0x010b, B:88:0x010f, B:89:0x0114, B:101:0x013d, B:105:0x0145, B:110:0x0150, B:112:0x0154, B:117:0x0162, B:119:0x0166, B:122:0x016c, B:138:0x01a0, B:140:0x01a8, B:142:0x01ac, B:149:0x01b9, B:152:0x01c0, B:154:0x01c4, B:156:0x01cc, B:155:0x01c9, B:145:0x01b1, B:158:0x01d8, B:160:0x01dc, B:161:0x01e1, B:121:0x016a, B:124:0x0170, B:126:0x0174, B:130:0x0187, B:132:0x018b, B:133:0x018e, B:127:0x017c, B:134:0x0191, B:136:0x0197, B:137:0x019c, B:113:0x0159, B:168:0x01f7, B:170:0x01fb, B:171:0x0200, B:81:0x00fe, B:72:0x00e6, B:74:0x00ea, B:75:0x00ef, B:92:0x011c, B:95:0x0121, B:97:0x0127, B:99:0x0134), top: B:176:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01c9 A[Catch: all -> 0x0208, TryCatch #0 {all -> 0x0208, blocks: (B:11:0x0017, B:13:0x0024, B:15:0x002e, B:28:0x0051, B:31:0x0059, B:33:0x005f, B:34:0x0062, B:36:0x0070, B:37:0x0077, B:39:0x007d, B:40:0x007f, B:42:0x0088, B:48:0x0095, B:49:0x009b, B:53:0x00a4, B:16:0x0037, B:20:0x003e, B:22:0x0045, B:25:0x004a, B:54:0x00a7, B:55:0x00aa, B:57:0x00b6, B:60:0x00bf, B:63:0x00cf, B:65:0x00d3, B:67:0x00d7, B:71:0x00e3, B:68:0x00dc, B:76:0x00f3, B:78:0x00f7, B:84:0x0105, B:86:0x010b, B:88:0x010f, B:89:0x0114, B:101:0x013d, B:105:0x0145, B:110:0x0150, B:112:0x0154, B:117:0x0162, B:119:0x0166, B:122:0x016c, B:138:0x01a0, B:140:0x01a8, B:142:0x01ac, B:149:0x01b9, B:152:0x01c0, B:154:0x01c4, B:156:0x01cc, B:155:0x01c9, B:145:0x01b1, B:158:0x01d8, B:160:0x01dc, B:161:0x01e1, B:121:0x016a, B:124:0x0170, B:126:0x0174, B:130:0x0187, B:132:0x018b, B:133:0x018e, B:127:0x017c, B:134:0x0191, B:136:0x0197, B:137:0x019c, B:113:0x0159, B:168:0x01f7, B:170:0x01fb, B:171:0x0200, B:81:0x00fe, B:72:0x00e6, B:74:0x00ea, B:75:0x00ef, B:92:0x011c, B:95:0x0121, B:97:0x0127, B:99:0x0134), top: B:176:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01d8 A[Catch: all -> 0x0208, TryCatch #0 {all -> 0x0208, blocks: (B:11:0x0017, B:13:0x0024, B:15:0x002e, B:28:0x0051, B:31:0x0059, B:33:0x005f, B:34:0x0062, B:36:0x0070, B:37:0x0077, B:39:0x007d, B:40:0x007f, B:42:0x0088, B:48:0x0095, B:49:0x009b, B:53:0x00a4, B:16:0x0037, B:20:0x003e, B:22:0x0045, B:25:0x004a, B:54:0x00a7, B:55:0x00aa, B:57:0x00b6, B:60:0x00bf, B:63:0x00cf, B:65:0x00d3, B:67:0x00d7, B:71:0x00e3, B:68:0x00dc, B:76:0x00f3, B:78:0x00f7, B:84:0x0105, B:86:0x010b, B:88:0x010f, B:89:0x0114, B:101:0x013d, B:105:0x0145, B:110:0x0150, B:112:0x0154, B:117:0x0162, B:119:0x0166, B:122:0x016c, B:138:0x01a0, B:140:0x01a8, B:142:0x01ac, B:149:0x01b9, B:152:0x01c0, B:154:0x01c4, B:156:0x01cc, B:155:0x01c9, B:145:0x01b1, B:158:0x01d8, B:160:0x01dc, B:161:0x01e1, B:121:0x016a, B:124:0x0170, B:126:0x0174, B:130:0x0187, B:132:0x018b, B:133:0x018e, B:127:0x017c, B:134:0x0191, B:136:0x0197, B:137:0x019c, B:113:0x0159, B:168:0x01f7, B:170:0x01fb, B:171:0x0200, B:81:0x00fe, B:72:0x00e6, B:74:0x00ea, B:75:0x00ef, B:92:0x011c, B:95:0x0121, B:97:0x0127, B:99:0x0134), top: B:176:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x01ed A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0141 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b6 A[Catch: all -> 0x0208, TryCatch #0 {all -> 0x0208, blocks: (B:11:0x0017, B:13:0x0024, B:15:0x002e, B:28:0x0051, B:31:0x0059, B:33:0x005f, B:34:0x0062, B:36:0x0070, B:37:0x0077, B:39:0x007d, B:40:0x007f, B:42:0x0088, B:48:0x0095, B:49:0x009b, B:53:0x00a4, B:16:0x0037, B:20:0x003e, B:22:0x0045, B:25:0x004a, B:54:0x00a7, B:55:0x00aa, B:57:0x00b6, B:60:0x00bf, B:63:0x00cf, B:65:0x00d3, B:67:0x00d7, B:71:0x00e3, B:68:0x00dc, B:76:0x00f3, B:78:0x00f7, B:84:0x0105, B:86:0x010b, B:88:0x010f, B:89:0x0114, B:101:0x013d, B:105:0x0145, B:110:0x0150, B:112:0x0154, B:117:0x0162, B:119:0x0166, B:122:0x016c, B:138:0x01a0, B:140:0x01a8, B:142:0x01ac, B:149:0x01b9, B:152:0x01c0, B:154:0x01c4, B:156:0x01cc, B:155:0x01c9, B:145:0x01b1, B:158:0x01d8, B:160:0x01dc, B:161:0x01e1, B:121:0x016a, B:124:0x0170, B:126:0x0174, B:130:0x0187, B:132:0x018b, B:133:0x018e, B:127:0x017c, B:134:0x0191, B:136:0x0197, B:137:0x019c, B:113:0x0159, B:168:0x01f7, B:170:0x01fb, B:171:0x0200, B:81:0x00fe, B:72:0x00e6, B:74:0x00ea, B:75:0x00ef, B:92:0x011c, B:95:0x0121, B:97:0x0127, B:99:0x0134), top: B:176:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x010b A[Catch: all -> 0x0208, TryCatch #0 {all -> 0x0208, blocks: (B:11:0x0017, B:13:0x0024, B:15:0x002e, B:28:0x0051, B:31:0x0059, B:33:0x005f, B:34:0x0062, B:36:0x0070, B:37:0x0077, B:39:0x007d, B:40:0x007f, B:42:0x0088, B:48:0x0095, B:49:0x009b, B:53:0x00a4, B:16:0x0037, B:20:0x003e, B:22:0x0045, B:25:0x004a, B:54:0x00a7, B:55:0x00aa, B:57:0x00b6, B:60:0x00bf, B:63:0x00cf, B:65:0x00d3, B:67:0x00d7, B:71:0x00e3, B:68:0x00dc, B:76:0x00f3, B:78:0x00f7, B:84:0x0105, B:86:0x010b, B:88:0x010f, B:89:0x0114, B:101:0x013d, B:105:0x0145, B:110:0x0150, B:112:0x0154, B:117:0x0162, B:119:0x0166, B:122:0x016c, B:138:0x01a0, B:140:0x01a8, B:142:0x01ac, B:149:0x01b9, B:152:0x01c0, B:154:0x01c4, B:156:0x01cc, B:155:0x01c9, B:145:0x01b1, B:158:0x01d8, B:160:0x01dc, B:161:0x01e1, B:121:0x016a, B:124:0x0170, B:126:0x0174, B:130:0x0187, B:132:0x018b, B:133:0x018e, B:127:0x017c, B:134:0x0191, B:136:0x0197, B:137:0x019c, B:113:0x0159, B:168:0x01f7, B:170:0x01fb, B:171:0x0200, B:81:0x00fe, B:72:0x00e6, B:74:0x00ea, B:75:0x00ef, B:92:0x011c, B:95:0x0121, B:97:0x0127, B:99:0x0134), top: B:176:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x011c A[Catch: all -> 0x0208, TryCatch #0 {all -> 0x0208, blocks: (B:11:0x0017, B:13:0x0024, B:15:0x002e, B:28:0x0051, B:31:0x0059, B:33:0x005f, B:34:0x0062, B:36:0x0070, B:37:0x0077, B:39:0x007d, B:40:0x007f, B:42:0x0088, B:48:0x0095, B:49:0x009b, B:53:0x00a4, B:16:0x0037, B:20:0x003e, B:22:0x0045, B:25:0x004a, B:54:0x00a7, B:55:0x00aa, B:57:0x00b6, B:60:0x00bf, B:63:0x00cf, B:65:0x00d3, B:67:0x00d7, B:71:0x00e3, B:68:0x00dc, B:76:0x00f3, B:78:0x00f7, B:84:0x0105, B:86:0x010b, B:88:0x010f, B:89:0x0114, B:101:0x013d, B:105:0x0145, B:110:0x0150, B:112:0x0154, B:117:0x0162, B:119:0x0166, B:122:0x016c, B:138:0x01a0, B:140:0x01a8, B:142:0x01ac, B:149:0x01b9, B:152:0x01c0, B:154:0x01c4, B:156:0x01cc, B:155:0x01c9, B:145:0x01b1, B:158:0x01d8, B:160:0x01dc, B:161:0x01e1, B:121:0x016a, B:124:0x0170, B:126:0x0174, B:130:0x0187, B:132:0x018b, B:133:0x018e, B:127:0x017c, B:134:0x0191, B:136:0x0197, B:137:0x019c, B:113:0x0159, B:168:0x01f7, B:170:0x01fb, B:171:0x0200, B:81:0x00fe, B:72:0x00e6, B:74:0x00ea, B:75:0x00ef, B:92:0x011c, B:95:0x0121, B:97:0x0127, B:99:0x0134), top: B:176:0x0017 }] */
    @Override // defpackage.vr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean l(int r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 528
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wk.l(int, boolean):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0048  */
    @Override // defpackage.vr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.md[] o(int r6, int r7) {
        /*
            r5 = this;
            r0 = 0
        L1:
            int r1 = r5.d
            if (r0 >= r1) goto Lf
            md[] r1 = r5.g
            r1 = r1[r0]
            r1.d()
            int r0 = r0 + 1
            goto L1
        Lf:
            if (r6 < 0) goto L51
        L11:
            if (r6 > r7) goto L51
            md[] r0 = r5.g
            wj r1 = r5.f(r6)
            int r1 = r1.a
            r0 = r0[r1]
            int r1 = r0.b()
            if (r1 <= 0) goto L48
            int r1 = r0.b
            if (r1 == 0) goto L42
            int r2 = r1 + (-1)
            int[] r3 = r0.a
            int r4 = r0.c
            r2 = r2 & r4
            r3 = r3[r2]
            int r4 = r6 + (-1)
            if (r3 != r4) goto L48
            if (r1 == 0) goto L3c
            r0.b = r2
            r0.c(r6)
            goto L4e
        L3c:
            java.lang.ArrayIndexOutOfBoundsException r6 = new java.lang.ArrayIndexOutOfBoundsException
            r6.<init>()
            throw r6
        L42:
            java.lang.ArrayIndexOutOfBoundsException r6 = new java.lang.ArrayIndexOutOfBoundsException
            r6.<init>()
            throw r6
        L48:
            r0.c(r6)
            r0.c(r6)
        L4e:
            int r6 = r6 + 1
            goto L11
        L51:
            md[] r6 = r5.g
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wk.o(int, int):md[]");
    }

    /* JADX WARN: Path cross not found for [B:58:0x00e9, B:61:0x00f0], limit reached: 164 */
    /* JADX WARN: Path cross not found for [B:97:0x0158, B:91:0x014c], limit reached: 164 */
    /* JADX WARN: Removed duplicated region for block: B:115:0x018f A[Catch: all -> 0x01e9, LOOP:3: B:115:0x018f->B:129:0x01b0, LOOP_START, PHI: r0 r10 r11
  0x018f: PHI (r0v22 int) = (r0v16 int), (r0v27 int) binds: [B:114:0x018d, B:129:0x01b0] A[DONT_GENERATE, DONT_INLINE]
  0x018f: PHI (r10v15 int) = (r10v14 int), (r10v16 int) binds: [B:114:0x018d, B:129:0x01b0] A[DONT_GENERATE, DONT_INLINE]
  0x018f: PHI (r11v9 int) = (r11v7 int), (r11v10 int) binds: [B:114:0x018d, B:129:0x01b0] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x01e9, blocks: (B:8:0x0014, B:10:0x0021, B:12:0x0025, B:24:0x004f, B:26:0x005d, B:28:0x006f, B:29:0x0081, B:31:0x0087, B:32:0x0089, B:34:0x0097, B:13:0x0037, B:17:0x003e, B:19:0x0044, B:35:0x00a2, B:36:0x00a5, B:38:0x00a9, B:41:0x00af, B:43:0x00bd, B:45:0x00c5, B:47:0x00c9, B:51:0x00d5, B:48:0x00ce, B:56:0x00e5, B:58:0x00e9, B:63:0x00f6, B:65:0x00fa, B:67:0x0101, B:68:0x0106, B:81:0x0132, B:83:0x0138, B:85:0x013c, B:91:0x014c, B:93:0x0150, B:96:0x0156, B:113:0x0187, B:115:0x018f, B:117:0x0193, B:123:0x019e, B:125:0x01a4, B:127:0x01a8, B:129:0x01b0, B:128:0x01ac, B:120:0x0198, B:131:0x01bc, B:133:0x01c0, B:134:0x01c5, B:94:0x0153, B:97:0x0158, B:99:0x015d, B:101:0x0161, B:105:0x016e, B:107:0x0172, B:108:0x0175, B:102:0x0166, B:109:0x0178, B:111:0x017e, B:112:0x0183, B:86:0x0141, B:139:0x01d6, B:141:0x01da, B:143:0x01e3, B:142:0x01df, B:61:0x00f0, B:52:0x00d8, B:54:0x00dc, B:55:0x00e1, B:71:0x010d, B:74:0x0112, B:76:0x0118, B:78:0x0126), top: B:149:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01bc A[Catch: all -> 0x01e9, TryCatch #0 {all -> 0x01e9, blocks: (B:8:0x0014, B:10:0x0021, B:12:0x0025, B:24:0x004f, B:26:0x005d, B:28:0x006f, B:29:0x0081, B:31:0x0087, B:32:0x0089, B:34:0x0097, B:13:0x0037, B:17:0x003e, B:19:0x0044, B:35:0x00a2, B:36:0x00a5, B:38:0x00a9, B:41:0x00af, B:43:0x00bd, B:45:0x00c5, B:47:0x00c9, B:51:0x00d5, B:48:0x00ce, B:56:0x00e5, B:58:0x00e9, B:63:0x00f6, B:65:0x00fa, B:67:0x0101, B:68:0x0106, B:81:0x0132, B:83:0x0138, B:85:0x013c, B:91:0x014c, B:93:0x0150, B:96:0x0156, B:113:0x0187, B:115:0x018f, B:117:0x0193, B:123:0x019e, B:125:0x01a4, B:127:0x01a8, B:129:0x01b0, B:128:0x01ac, B:120:0x0198, B:131:0x01bc, B:133:0x01c0, B:134:0x01c5, B:94:0x0153, B:97:0x0158, B:99:0x015d, B:101:0x0161, B:105:0x016e, B:107:0x0172, B:108:0x0175, B:102:0x0166, B:109:0x0178, B:111:0x017e, B:112:0x0183, B:86:0x0141, B:139:0x01d6, B:141:0x01da, B:143:0x01e3, B:142:0x01df, B:61:0x00f0, B:52:0x00d8, B:54:0x00dc, B:55:0x00e1, B:71:0x010d, B:74:0x0112, B:76:0x0118, B:78:0x0126), top: B:149:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01d6 A[Catch: all -> 0x01e9, TRY_ENTER, TryCatch #0 {all -> 0x01e9, blocks: (B:8:0x0014, B:10:0x0021, B:12:0x0025, B:24:0x004f, B:26:0x005d, B:28:0x006f, B:29:0x0081, B:31:0x0087, B:32:0x0089, B:34:0x0097, B:13:0x0037, B:17:0x003e, B:19:0x0044, B:35:0x00a2, B:36:0x00a5, B:38:0x00a9, B:41:0x00af, B:43:0x00bd, B:45:0x00c5, B:47:0x00c9, B:51:0x00d5, B:48:0x00ce, B:56:0x00e5, B:58:0x00e9, B:63:0x00f6, B:65:0x00fa, B:67:0x0101, B:68:0x0106, B:81:0x0132, B:83:0x0138, B:85:0x013c, B:91:0x014c, B:93:0x0150, B:96:0x0156, B:113:0x0187, B:115:0x018f, B:117:0x0193, B:123:0x019e, B:125:0x01a4, B:127:0x01a8, B:129:0x01b0, B:128:0x01ac, B:120:0x0198, B:131:0x01bc, B:133:0x01c0, B:134:0x01c5, B:94:0x0153, B:97:0x0158, B:99:0x015d, B:101:0x0161, B:105:0x016e, B:107:0x0172, B:108:0x0175, B:102:0x0166, B:109:0x0178, B:111:0x017e, B:112:0x0183, B:86:0x0141, B:139:0x01d6, B:141:0x01da, B:143:0x01e3, B:142:0x01df, B:61:0x00f0, B:52:0x00d8, B:54:0x00dc, B:55:0x00e1, B:71:0x010d, B:74:0x0112, B:76:0x0118, B:78:0x0126), top: B:149:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a9 A[Catch: all -> 0x01e9, TryCatch #0 {all -> 0x01e9, blocks: (B:8:0x0014, B:10:0x0021, B:12:0x0025, B:24:0x004f, B:26:0x005d, B:28:0x006f, B:29:0x0081, B:31:0x0087, B:32:0x0089, B:34:0x0097, B:13:0x0037, B:17:0x003e, B:19:0x0044, B:35:0x00a2, B:36:0x00a5, B:38:0x00a9, B:41:0x00af, B:43:0x00bd, B:45:0x00c5, B:47:0x00c9, B:51:0x00d5, B:48:0x00ce, B:56:0x00e5, B:58:0x00e9, B:63:0x00f6, B:65:0x00fa, B:67:0x0101, B:68:0x0106, B:81:0x0132, B:83:0x0138, B:85:0x013c, B:91:0x014c, B:93:0x0150, B:96:0x0156, B:113:0x0187, B:115:0x018f, B:117:0x0193, B:123:0x019e, B:125:0x01a4, B:127:0x01a8, B:129:0x01b0, B:128:0x01ac, B:120:0x0198, B:131:0x01bc, B:133:0x01c0, B:134:0x01c5, B:94:0x0153, B:97:0x0158, B:99:0x015d, B:101:0x0161, B:105:0x016e, B:107:0x0172, B:108:0x0175, B:102:0x0166, B:109:0x0178, B:111:0x017e, B:112:0x0183, B:86:0x0141, B:139:0x01d6, B:141:0x01da, B:143:0x01e3, B:142:0x01df, B:61:0x00f0, B:52:0x00d8, B:54:0x00dc, B:55:0x00e1, B:71:0x010d, B:74:0x0112, B:76:0x0118, B:78:0x0126), top: B:149:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00fa A[Catch: all -> 0x01e9, TryCatch #0 {all -> 0x01e9, blocks: (B:8:0x0014, B:10:0x0021, B:12:0x0025, B:24:0x004f, B:26:0x005d, B:28:0x006f, B:29:0x0081, B:31:0x0087, B:32:0x0089, B:34:0x0097, B:13:0x0037, B:17:0x003e, B:19:0x0044, B:35:0x00a2, B:36:0x00a5, B:38:0x00a9, B:41:0x00af, B:43:0x00bd, B:45:0x00c5, B:47:0x00c9, B:51:0x00d5, B:48:0x00ce, B:56:0x00e5, B:58:0x00e9, B:63:0x00f6, B:65:0x00fa, B:67:0x0101, B:68:0x0106, B:81:0x0132, B:83:0x0138, B:85:0x013c, B:91:0x014c, B:93:0x0150, B:96:0x0156, B:113:0x0187, B:115:0x018f, B:117:0x0193, B:123:0x019e, B:125:0x01a4, B:127:0x01a8, B:129:0x01b0, B:128:0x01ac, B:120:0x0198, B:131:0x01bc, B:133:0x01c0, B:134:0x01c5, B:94:0x0153, B:97:0x0158, B:99:0x015d, B:101:0x0161, B:105:0x016e, B:107:0x0172, B:108:0x0175, B:102:0x0166, B:109:0x0178, B:111:0x017e, B:112:0x0183, B:86:0x0141, B:139:0x01d6, B:141:0x01da, B:143:0x01e3, B:142:0x01df, B:61:0x00f0, B:52:0x00d8, B:54:0x00dc, B:55:0x00e1, B:71:0x010d, B:74:0x0112, B:76:0x0118, B:78:0x0126), top: B:149:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x010d A[Catch: all -> 0x01e9, TryCatch #0 {all -> 0x01e9, blocks: (B:8:0x0014, B:10:0x0021, B:12:0x0025, B:24:0x004f, B:26:0x005d, B:28:0x006f, B:29:0x0081, B:31:0x0087, B:32:0x0089, B:34:0x0097, B:13:0x0037, B:17:0x003e, B:19:0x0044, B:35:0x00a2, B:36:0x00a5, B:38:0x00a9, B:41:0x00af, B:43:0x00bd, B:45:0x00c5, B:47:0x00c9, B:51:0x00d5, B:48:0x00ce, B:56:0x00e5, B:58:0x00e9, B:63:0x00f6, B:65:0x00fa, B:67:0x0101, B:68:0x0106, B:81:0x0132, B:83:0x0138, B:85:0x013c, B:91:0x014c, B:93:0x0150, B:96:0x0156, B:113:0x0187, B:115:0x018f, B:117:0x0193, B:123:0x019e, B:125:0x01a4, B:127:0x01a8, B:129:0x01b0, B:128:0x01ac, B:120:0x0198, B:131:0x01bc, B:133:0x01c0, B:134:0x01c5, B:94:0x0153, B:97:0x0158, B:99:0x015d, B:101:0x0161, B:105:0x016e, B:107:0x0172, B:108:0x0175, B:102:0x0166, B:109:0x0178, B:111:0x017e, B:112:0x0183, B:86:0x0141, B:139:0x01d6, B:141:0x01da, B:143:0x01e3, B:142:0x01df, B:61:0x00f0, B:52:0x00d8, B:54:0x00dc, B:55:0x00e1, B:71:0x010d, B:74:0x0112, B:76:0x0118, B:78:0x0126), top: B:149:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0132 A[Catch: all -> 0x01e9, TryCatch #0 {all -> 0x01e9, blocks: (B:8:0x0014, B:10:0x0021, B:12:0x0025, B:24:0x004f, B:26:0x005d, B:28:0x006f, B:29:0x0081, B:31:0x0087, B:32:0x0089, B:34:0x0097, B:13:0x0037, B:17:0x003e, B:19:0x0044, B:35:0x00a2, B:36:0x00a5, B:38:0x00a9, B:41:0x00af, B:43:0x00bd, B:45:0x00c5, B:47:0x00c9, B:51:0x00d5, B:48:0x00ce, B:56:0x00e5, B:58:0x00e9, B:63:0x00f6, B:65:0x00fa, B:67:0x0101, B:68:0x0106, B:81:0x0132, B:83:0x0138, B:85:0x013c, B:91:0x014c, B:93:0x0150, B:96:0x0156, B:113:0x0187, B:115:0x018f, B:117:0x0193, B:123:0x019e, B:125:0x01a4, B:127:0x01a8, B:129:0x01b0, B:128:0x01ac, B:120:0x0198, B:131:0x01bc, B:133:0x01c0, B:134:0x01c5, B:94:0x0153, B:97:0x0158, B:99:0x015d, B:101:0x0161, B:105:0x016e, B:107:0x0172, B:108:0x0175, B:102:0x0166, B:109:0x0178, B:111:0x017e, B:112:0x0183, B:86:0x0141, B:139:0x01d6, B:141:0x01da, B:143:0x01e3, B:142:0x01df, B:61:0x00f0, B:52:0x00d8, B:54:0x00dc, B:55:0x00e1, B:71:0x010d, B:74:0x0112, B:76:0x0118, B:78:0x0126), top: B:149:0x0014 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:136:0x01cb -> B:70:0x010b). Please report as a decompilation issue!!! */
    @Override // defpackage.vr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void q(int r17) {
        /*
            Method dump skipped, instructions count: 498
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wk.q(int):void");
    }

    protected final int r(int i, int i2, int i3) {
        int iM;
        int i4;
        int i5 = this.f;
        if (i5 >= 0 && (i5 != s() || i5 != i - 1)) {
            throw new IllegalStateException();
        }
        if (i5 >= 0) {
            iM = i3 - this.i.m(i5);
        } else if (this.j.a() <= 0 || i != s() + 1) {
            iM = 0;
        } else {
            int iS = s();
            while (true) {
                if (iS < this.k) {
                    iS = s();
                    break;
                }
                if (f(iS).a == i2) {
                    break;
                }
                iS--;
            }
            iM = this.b ? (-f(iS).c) - this.c : f(iS).c + this.c;
            for (int i6 = iS + 1; i6 <= s(); i6++) {
                iM -= f(i6).b;
            }
        }
        wj wjVar = new wj(i2, iM);
        mc mcVar = this.j;
        Object[] objArr = mcVar.a;
        int i7 = mcVar.c;
        objArr[i7] = wjVar;
        int i8 = mcVar.d & (i7 + 1);
        mcVar.c = i8;
        if (i8 == mcVar.b) {
            mcVar.c();
        }
        Object obj = this.l;
        if (obj != null) {
            i4 = this.m;
            wjVar.c = i4;
            this.l = null;
        } else {
            byj byjVar = this.i;
            Object[] objArr2 = this.a;
            int iK = byjVar.k(i, true, objArr2, false);
            wjVar.c = iK;
            obj = objArr2[0];
            i4 = iK;
        }
        if (mcVar.a() == 1) {
            this.f = i;
            this.e = i;
            this.k = i;
        } else {
            int i9 = this.f;
            if (i9 < 0) {
                this.f = i;
                this.e = i;
            } else {
                this.f = i9 + 1;
            }
        }
        this.i.q(obj, i4, i2, i3);
        return wjVar.c;
    }

    public final int s() {
        return (this.k + this.j.a()) - 1;
    }

    protected final int t(int i, int i2, int i3) {
        int i4;
        int i5 = this.e;
        if (i5 >= 0 && (i5 != this.k || i5 != i + 1)) {
            throw new IllegalStateException();
        }
        int i6 = this.k;
        wj wjVarF = i6 >= 0 ? f(i6) : null;
        int iM = this.i.m(this.k);
        wj wjVar = new wj(i2, 0);
        mc mcVar = this.j;
        int i7 = (mcVar.b - 1) & mcVar.d;
        mcVar.b = i7;
        mcVar.a[i7] = wjVar;
        if (i7 == mcVar.c) {
            mcVar.c();
        }
        Object obj = this.l;
        if (obj != null) {
            i4 = this.m;
            wjVar.c = i4;
            this.l = null;
        } else {
            byj byjVar = this.i;
            Object[] objArr = this.a;
            int iK = byjVar.k(i, false, objArr, false);
            wjVar.c = iK;
            obj = objArr[0];
            i4 = iK;
        }
        this.e = i;
        this.k = i;
        if (this.f < 0) {
            this.f = i;
        }
        int i8 = !this.b ? i3 - i4 : i3 + i4;
        if (wjVarF != null) {
            wjVarF.b = iM - i8;
        }
        this.i.q(obj, i4, i2, i8);
        return wjVar.c;
    }

    @Override // defpackage.vr
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public final wj f(int i) {
        int i2 = i - this.k;
        if (i2 < 0) {
            return null;
        }
        mc mcVar = this.j;
        if (i2 >= mcVar.a()) {
            return null;
        }
        if (i2 >= mcVar.a()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        Object obj = mcVar.a[mcVar.d & (mcVar.b + i2)];
        obj.getClass();
        return (wj) obj;
    }

    public final int v(int i) {
        int i2;
        wj wjVarF;
        int i3 = this.e;
        if (i3 < 0) {
            return Integer.MIN_VALUE;
        }
        if (this.b) {
            int iM = this.i.m(i3);
            if (f(this.e).a == i) {
                return iM;
            }
            int i4 = this.e;
            do {
                i4++;
                if (i4 <= s()) {
                    wjVarF = f(i4);
                    iM += wjVarF.b;
                }
            } while (wjVarF.a != i);
            return iM;
        }
        int iM2 = this.i.m(this.f);
        wj wjVarF2 = f(this.f);
        if (wjVarF2.a == i) {
            i2 = wjVarF2.c;
        } else {
            int i5 = this.f;
            do {
                i5--;
                if (i5 >= this.k) {
                    iM2 -= wjVarF2.b;
                    wjVarF2 = f(i5);
                }
            } while (wjVarF2.a != i);
            i2 = wjVarF2.c;
        }
        return iM2 + i2;
        return Integer.MIN_VALUE;
    }

    public final int w(int i) {
        wj wjVarF;
        int i2;
        int i3 = this.e;
        if (i3 < 0) {
            return Integer.MAX_VALUE;
        }
        if (!this.b) {
            int iM = this.i.m(i3);
            if (f(this.e).a == i) {
                return iM;
            }
            int i4 = this.e;
            do {
                i4++;
                if (i4 <= s()) {
                    wjVarF = f(i4);
                    iM += wjVarF.b;
                }
            } while (wjVarF.a != i);
            return iM;
        }
        int iM2 = this.i.m(this.f);
        wj wjVarF2 = f(this.f);
        if (wjVarF2.a == i) {
            i2 = wjVarF2.c;
        } else {
            int i5 = this.f;
            do {
                i5--;
                if (i5 >= this.k) {
                    iM2 -= wjVarF2.b;
                    wjVarF2 = f(i5);
                }
            } while (wjVarF2.a != i);
            i2 = wjVarF2.c;
        }
        return iM2 - i2;
        return Integer.MAX_VALUE;
    }
}
