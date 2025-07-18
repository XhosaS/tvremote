package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class bau extends awv {
    protected final wi j = new wi(64);
    protected int k = -1;
    protected Object l;
    protected int m;

    @Override // defpackage.awv
    public final void g(int i) {
        super.g(i);
        int iS = s() - i;
        wi wiVar = this.j;
        wiVar.c(iS + 1);
        if (wiVar.a() == 0) {
            this.k = -1;
        }
    }

    @Override // defpackage.awv
    public final boolean l(int i, boolean z) {
        boolean zV;
        int i2;
        int iC;
        int i3;
        if (this.b.b() == 0 || (!z && m(i))) {
            return false;
        }
        try {
            wi wiVar = this.j;
            if (wiVar.a() != 0) {
                int iB = this.b.b();
                int i4 = this.g;
                zV = true;
                if (i4 >= 0) {
                    i2 = i4 + 1;
                    iC = this.b.c(i4);
                } else {
                    int i5 = this.i;
                    i2 = i5 == -1 ? 0 : i5;
                    if (i2 > s() + 1 || i2 < this.k) {
                        wiVar.d(wiVar.a());
                    } else if (i2 <= s()) {
                        iC = Integer.MAX_VALUE;
                    }
                }
                int iS = s();
                int i6 = i2;
                while (i6 < iB && i6 <= iS) {
                    bat batVarF = f(i6);
                    if (iC != Integer.MAX_VALUE) {
                        iC += batVarF.b;
                    }
                    int i7 = iC;
                    int i8 = batVarF.a;
                    awu awuVar = this.b;
                    Object[] objArr = this.a;
                    int iA = awuVar.a(i6, true, objArr, false);
                    if (iA != batVarF.c) {
                        batVarF.c = iA;
                        wiVar.c(iS - i6);
                        i3 = i6;
                    } else {
                        i3 = iS;
                    }
                    this.g = i6;
                    if (this.f < 0) {
                        this.f = i6;
                    }
                    this.b.e(objArr[0], i6, iA, i8, i7);
                    if (!z && m(i)) {
                        break;
                    }
                    iC = i7 == Integer.MAX_VALUE ? this.b.c(i6) : i7;
                    if (i8 == this.e - 1 && z) {
                        break;
                    }
                    i6++;
                    iS = i3;
                }
            }
            zV = v(i, z);
            return zV;
        } finally {
            this.a[0] = null;
            this.l = null;
        }
    }

    @Override // defpackage.awv
    public final boolean o(int i, boolean z) {
        int i2;
        int iC;
        int i3;
        boolean zW;
        if (this.b.b() == 0 || (!z && n(i))) {
            return false;
        }
        try {
            wi wiVar = this.j;
            if (wiVar.a() != 0) {
                int i4 = this.f;
                if (i4 < 0) {
                    int i5 = this.i;
                    i2 = i5 == -1 ? 0 : i5;
                    if (i2 <= s()) {
                        int i6 = this.k;
                        if (i2 < i6 - 1) {
                            wiVar.d(wiVar.a());
                        } else if (i2 >= i6) {
                            iC = Integer.MAX_VALUE;
                            i3 = 0;
                        }
                    } else {
                        wiVar.d(wiVar.a());
                    }
                    return zW;
                }
                iC = this.b.c(i4);
                i3 = f(this.f).b;
                i2 = this.f - 1;
                int iMax = Math.max(((awx) this.b).a.h, this.k);
                int i7 = i2;
                while (true) {
                    if (i7 < iMax) {
                        break;
                    }
                    bat batVarF = f(i7);
                    int i8 = batVarF.a;
                    awu awuVar = this.b;
                    Object[] objArr = this.a;
                    int iA = awuVar.a(i7, false, objArr, false);
                    zW = true;
                    if (iA == batVarF.c) {
                        this.f = i7;
                        if (this.g < 0) {
                            this.g = i7;
                        }
                        this.b.e(objArr[0], i7, iA, i8, iC - i3);
                        if (!z && n(i)) {
                            break;
                        }
                        iC = this.b.c(i7);
                        i3 = batVarF.b;
                        if (i8 == 0 && z) {
                            break;
                        }
                        i7--;
                    } else {
                        wiVar.d((i7 + 1) - this.k);
                        this.k = this.f;
                        this.l = objArr[0];
                        this.m = iA;
                        break;
                    }
                }
            }
            zW = w(i, z);
            return zW;
        } finally {
            this.a[0] = null;
            this.l = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0046  */
    @Override // defpackage.awv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.wj[] p(int r6, int r7) {
        /*
            r5 = this;
            r0 = 0
            r1 = r0
        L2:
            int r2 = r5.e
            if (r1 >= r2) goto Lf
            wj[] r2 = r5.h
            r2 = r2[r1]
            r2.b = r0
            int r1 = r1 + 1
            goto L2
        Lf:
            if (r6 < 0) goto L4f
        L11:
            if (r6 > r7) goto L4f
            wj[] r0 = r5.h
            bat r1 = r5.f(r6)
            int r1 = r1.a
            r0 = r0[r1]
            int r1 = r0.b
            int r2 = r0.c
            r3 = r1 & r2
            if (r3 <= 0) goto L46
            if (r1 == 0) goto L40
            int r3 = r1 + (-1)
            int[] r4 = r0.a
            r2 = r2 & r3
            r3 = r4[r2]
            int r4 = r6 + (-1)
            if (r3 != r4) goto L46
            if (r1 == 0) goto L3a
            r0.b = r2
            r0.b(r6)
            goto L4c
        L3a:
            java.lang.ArrayIndexOutOfBoundsException r6 = new java.lang.ArrayIndexOutOfBoundsException
            r6.<init>()
            throw r6
        L40:
            java.lang.ArrayIndexOutOfBoundsException r6 = new java.lang.ArrayIndexOutOfBoundsException
            r6.<init>()
            throw r6
        L46:
            r0.b(r6)
            r0.b(r6)
        L4c:
            int r6 = r6 + 1
            goto L11
        L4f:
            wj[] r6 = r5.h
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bau.p(int, int):wj[]");
    }

    protected final int r(int i, int i2, int i3) {
        int iC;
        Object obj;
        int i4;
        int i5 = this.g;
        if (i5 >= 0 && (i5 != s() || i5 != i - 1)) {
            throw new IllegalStateException();
        }
        if (i5 >= 0) {
            iC = i3 - this.b.c(i5);
        } else if (this.j.a() <= 0 || i != s() + 1) {
            iC = 0;
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
            iC = this.c ? (-f(iS).c) - this.d : f(iS).c + this.d;
            for (int i6 = iS + 1; i6 <= s(); i6++) {
                iC -= f(i6).b;
            }
        }
        bat batVar = new bat(i2, iC);
        wi wiVar = this.j;
        Object[] objArr = wiVar.a;
        int i7 = wiVar.c;
        objArr[i7] = batVar;
        int i8 = wiVar.d & (i7 + 1);
        wiVar.c = i8;
        if (i8 == wiVar.b) {
            wiVar.b();
        }
        Object obj2 = this.l;
        if (obj2 != null) {
            int i9 = this.m;
            batVar.c = i9;
            this.l = null;
            i4 = i9;
            obj = obj2;
        } else {
            awu awuVar = this.b;
            Object[] objArr2 = this.a;
            int iA = awuVar.a(i, true, objArr2, false);
            batVar.c = iA;
            obj = objArr2[0];
            i4 = iA;
        }
        if (wiVar.a() == 1) {
            this.g = i;
            this.f = i;
            this.k = i;
        } else {
            int i10 = this.g;
            if (i10 < 0) {
                this.g = i;
                this.f = i;
            } else {
                this.g = i10 + 1;
            }
        }
        this.b.e(obj, i, i4, i2, i3);
        return batVar.c;
    }

    public final int s() {
        return (this.k + this.j.a()) - 1;
    }

    protected final int t(int i, int i2, int i3) {
        int i4;
        int i5 = this.f;
        if (i5 >= 0 && (i5 != this.k || i5 != i + 1)) {
            throw new IllegalStateException();
        }
        int i6 = this.k;
        bat batVarF = i6 >= 0 ? f(i6) : null;
        int iC = this.b.c(this.k);
        bat batVar = new bat(i2, 0);
        wi wiVar = this.j;
        int i7 = (wiVar.b - 1) & wiVar.d;
        wiVar.b = i7;
        wiVar.a[i7] = batVar;
        if (i7 == wiVar.c) {
            wiVar.b();
        }
        Object obj = this.l;
        if (obj != null) {
            int i8 = this.m;
            batVar.c = i8;
            this.l = null;
            i4 = i8;
        } else {
            awu awuVar = this.b;
            Object[] objArr = this.a;
            int iA = awuVar.a(i, false, objArr, false);
            batVar.c = iA;
            obj = objArr[0];
            i4 = iA;
        }
        Object obj2 = obj;
        this.f = i;
        this.k = i;
        if (this.g < 0) {
            this.g = i;
        }
        int i9 = !this.c ? i3 - i4 : i3 + i4;
        if (batVarF != null) {
            batVarF.b = iC - i9;
        }
        this.b.e(obj2, i, i4, i2, i9);
        return batVar.c;
    }

    @Override // defpackage.awv
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public final bat f(int i) {
        int i2 = i - this.k;
        if (i2 < 0) {
            return null;
        }
        wi wiVar = this.j;
        if (i2 >= wiVar.a()) {
            return null;
        }
        if (i2 >= wiVar.a()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        Object obj = wiVar.a[wiVar.d & (wiVar.b + i2)];
        obj.getClass();
        return (bat) obj;
    }

    protected abstract boolean v(int i, boolean z);

    protected abstract boolean w(int i, boolean z);
}
