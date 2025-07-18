package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bav extends bau {
    private final int z(boolean z) {
        boolean z2 = false;
        if (z) {
            for (int i = this.g; i >= this.f; i--) {
                int i2 = f(i).a;
                if (i2 == 0) {
                    z2 = true;
                } else if (z2 && i2 == this.e - 1) {
                    return i;
                }
            }
        } else {
            for (int i3 = this.f; i3 <= this.g; i3++) {
                int i4 = f(i3).a;
                if (i4 == this.e - 1) {
                    z2 = true;
                } else if (z2 && i4 == 0) {
                    return i3;
                }
            }
        }
        return -1;
    }

    @Override // defpackage.awv
    public final int b(boolean z, int i, int[] iArr) {
        int i2;
        int iC = this.b.c(i);
        bat batVarF = f(i);
        int i3 = batVarF.a;
        if (this.c) {
            i2 = i3;
            int i4 = i2;
            int i5 = 1;
            int i6 = iC;
            for (int i7 = i + 1; i5 < this.e && i7 <= this.g; i7++) {
                bat batVarF2 = f(i7);
                i6 += batVarF2.b;
                int i8 = batVarF2.a;
                if (i8 != i4) {
                    i5++;
                    if (!z ? i6 < iC : i6 > iC) {
                        iC = i6;
                        i = i7;
                        i2 = i8;
                        i4 = i2;
                    } else {
                        i4 = i8;
                    }
                }
            }
        } else {
            int iD = this.b.d(i) + iC;
            int i9 = 1;
            int i10 = i3;
            for (int i11 = i - 1; i9 < this.e && i11 >= this.f; i11--) {
                iC -= batVarF.b;
                batVarF = f(i11);
                int i12 = batVarF.a;
                if (i12 != i10) {
                    i9++;
                    int iD2 = this.b.d(i11) + iC;
                    if (!z ? iD2 >= iD : iD2 <= iD) {
                        i10 = i12;
                    } else {
                        iD = iD2;
                        i = i11;
                        i3 = i12;
                        i10 = i3;
                    }
                }
            }
            iC = iD;
            i2 = i3;
        }
        if (iArr != null) {
            iArr[0] = i2;
            iArr[1] = i;
        }
        return iC;
    }

    @Override // defpackage.awv
    public final int d(boolean z, int i, int[] iArr) {
        int iD;
        int iC = this.b.c(i);
        bat batVarF = f(i);
        int i2 = batVarF.a;
        if (this.c) {
            int i3 = 1;
            iD = iC - this.b.d(i);
            int i4 = i2;
            for (int i5 = i - 1; i3 < this.e && i5 >= this.f; i5--) {
                iC -= batVarF.b;
                batVarF = f(i5);
                int i6 = batVarF.a;
                if (i6 != i4) {
                    i3++;
                    int iD2 = iC - this.b.d(i5);
                    if (!z ? iD2 >= iD : iD2 <= iD) {
                        i4 = i6;
                    } else {
                        iD = iD2;
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
            int i10 = iC;
            for (int i11 = i + 1; i9 < this.e && i11 <= this.g; i11++) {
                bat batVarF2 = f(i11);
                iC += batVarF2.b;
                int i12 = batVarF2.a;
                if (i12 != i7) {
                    i9++;
                    if (!z ? iC < i10 : iC > i10) {
                        i10 = iC;
                        i = i11;
                        i7 = i12;
                        i8 = i7;
                    } else {
                        i7 = i12;
                    }
                }
            }
            i2 = i8;
            iD = i10;
        }
        if (iArr != null) {
            iArr[0] = i2;
            iArr[1] = i;
        }
        return iD;
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x012c, code lost:
    
        return true;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00ff A[LOOP:2: B:86:0x00ff->B:101:0x0122, LOOP_START, PHI: r7 r10 r11
  0x00ff: PHI (r7v11 int) = (r7v5 int), (r7v15 int) binds: [B:85:0x00fd, B:101:0x0122] A[DONT_GENERATE, DONT_INLINE]
  0x00ff: PHI (r10v18 int) = (r10v16 int), (r10v19 int) binds: [B:85:0x00fd, B:101:0x0122] A[DONT_GENERATE, DONT_INLINE]
  0x00ff: PHI (r11v8 int) = (r11v6 int), (r11v9 int) binds: [B:85:0x00fd, B:101:0x0122] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.bau
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final boolean v(int r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bav.v(int, boolean):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0121, code lost:
    
        return true;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f4 A[LOOP:2: B:84:0x00f4->B:99:0x0117, LOOP_START, PHI: r6 r9 r10
  0x00f4: PHI (r6v11 int) = (r6v5 int), (r6v16 int) binds: [B:83:0x00f2, B:99:0x0117] A[DONT_GENERATE, DONT_INLINE]
  0x00f4: PHI (r9v17 int) = (r9v15 int), (r9v18 int) binds: [B:83:0x00f2, B:99:0x0117] A[DONT_GENERATE, DONT_INLINE]
  0x00f4: PHI (r10v9 int) = (r10v7 int), (r10v10 int) binds: [B:83:0x00f2, B:99:0x0117] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.bau
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final boolean w(int r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 333
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bav.w(int, boolean):boolean");
    }

    final int x(int i) {
        int i2;
        bat batVarF;
        int i3 = this.f;
        if (i3 < 0) {
            return Integer.MIN_VALUE;
        }
        if (this.c) {
            int iC = this.b.c(i3);
            if (f(this.f).a == i) {
                return iC;
            }
            int i4 = this.f;
            do {
                i4++;
                if (i4 <= s()) {
                    batVarF = f(i4);
                    iC += batVarF.b;
                }
            } while (batVarF.a != i);
            return iC;
        }
        int iC2 = this.b.c(this.g);
        bat batVarF2 = f(this.g);
        if (batVarF2.a == i) {
            i2 = batVarF2.c;
        } else {
            int i5 = this.g;
            do {
                i5--;
                if (i5 >= this.k) {
                    iC2 -= batVarF2.b;
                    batVarF2 = f(i5);
                }
            } while (batVarF2.a != i);
            i2 = batVarF2.c;
        }
        return iC2 + i2;
        return Integer.MIN_VALUE;
    }

    final int y(int i) {
        bat batVarF;
        int i2;
        int i3 = this.f;
        if (i3 < 0) {
            return Integer.MAX_VALUE;
        }
        if (!this.c) {
            int iC = this.b.c(i3);
            if (f(this.f).a == i) {
                return iC;
            }
            int i4 = this.f;
            do {
                i4++;
                if (i4 <= s()) {
                    batVarF = f(i4);
                    iC += batVarF.b;
                }
            } while (batVarF.a != i);
            return iC;
        }
        int iC2 = this.b.c(this.g);
        bat batVarF2 = f(this.g);
        if (batVarF2.a == i) {
            i2 = batVarF2.c;
        } else {
            int i5 = this.g;
            do {
                i5--;
                if (i5 >= this.k) {
                    iC2 -= batVarF2.b;
                    batVarF2 = f(i5);
                }
            } while (batVarF2.a != i);
            i2 = batVarF2.c;
        }
        return iC2 - i2;
        return Integer.MAX_VALUE;
    }
}
