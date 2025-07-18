package defpackage;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fmq implements fdp {
    public final int a;
    public final List b;
    public final SparseArray c;
    public final SparseBooleanArray d;
    public final SparseBooleanArray e;
    public fdr f;
    public int g;
    public boolean h;
    public fms i;
    public int j;
    public final zuw k;
    private final int l;
    private final edi m;
    private final SparseIntArray n;
    private final fjg o;
    private final fmn p;
    private boolean q;
    private boolean r;
    private int s;
    private fdf t;

    @Deprecated
    public fmq() {
        this(1, 1, fjg.a, new edo(0L), new zuw((byte[]) null, (byte[]) null));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003a  */
    @Override // defpackage.fdp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(long r10, long r12) {
        /*
            r9 = this;
            int r10 = r9.a
            r11 = 2
            r0 = 0
            if (r10 == r11) goto L8
            r10 = 1
            goto L9
        L8:
            r10 = r0
        L9:
            defpackage.a.ab(r10)
            java.util.List r10 = r9.b
            int r11 = r10.size()
            r1 = r0
        L13:
            r2 = 0
            if (r1 >= r11) goto L40
            java.lang.Object r4 = r10.get(r1)
            edo r4 = (defpackage.edo) r4
            long r5 = r4.f()
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 == 0) goto L3a
            long r5 = r4.d()
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r7 == 0) goto L3d
            int r2 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r2 == 0) goto L3d
            int r2 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r2 == 0) goto L3d
        L3a:
            r4.i(r12)
        L3d:
            int r1 = r1 + 1
            goto L13
        L40:
            int r10 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r10 == 0) goto L4b
            fdf r10 = r9.t
            if (r10 == 0) goto L4b
            r10.a(r12)
        L4b:
            edi r10 = r9.m
            r10.G(r0)
            android.util.SparseIntArray r10 = r9.n
            r10.clear()
            r10 = r0
        L56:
            android.util.SparseArray r11 = r9.c
            int r12 = r11.size()
            if (r10 >= r12) goto L6a
            java.lang.Object r11 = r11.valueAt(r10)
            fms r11 = (defpackage.fms) r11
            r11.c()
            int r10 = r10 + 1
            goto L56
        L6a:
            r9.s = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fmq.d(long, long):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        r1 = r1 + 1;
     */
    @Override // defpackage.fdp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean e(defpackage.fdq r7) {
        /*
            r6 = this;
            edi r0 = r6.m
            byte[] r0 = r0.a
            r1 = 940(0x3ac, float:1.317E-42)
            r2 = 0
            r7.i(r0, r2, r1)
            r1 = r2
        Lb:
            r3 = 188(0xbc, float:2.63E-43)
            if (r1 >= r3) goto L27
            r3 = r2
        L10:
            r4 = 5
            if (r3 >= r4) goto L22
            int r4 = r3 * 188
            int r4 = r4 + r1
            r4 = r0[r4]
            r5 = 71
            if (r4 == r5) goto L1f
            int r1 = r1 + 1
            goto Lb
        L1f:
            int r3 = r3 + 1
            goto L10
        L22:
            r7.l(r1)
            r7 = 1
            return r7
        L27:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fmq.e(fdq):boolean");
    }

    @Override // defpackage.fdp
    public final int g(fdq fdqVar, rsj rsjVar) throws eaf {
        long j;
        int i;
        long j2;
        long j3;
        long j4;
        int i2 = this.a;
        boolean z = this.h;
        boolean z2 = i2 == 2;
        fdi fdiVar = (fdi) fdqVar;
        long j5 = fdiVar.a;
        if (z) {
            if (j5 != -1 && !z2) {
                fmn fmnVar = this.p;
                if (!fmnVar.c) {
                    int i3 = this.j;
                    if (i3 <= 0) {
                        fmnVar.a(fdqVar);
                        return 0;
                    }
                    if (fmnVar.e) {
                        if (fmnVar.g == -9223372036854775807L) {
                            fmnVar.a(fdqVar);
                            return 0;
                        }
                        if (fmnVar.d) {
                            long j6 = fmnVar.f;
                            if (j6 == -9223372036854775807L) {
                                fmnVar.a(fdqVar);
                                return 0;
                            }
                            edo edoVar = fmnVar.a;
                            fmnVar.h = edoVar.c(fmnVar.g) - edoVar.b(j6);
                            fmnVar.a(fdqVar);
                            return 0;
                        }
                        int iMin = (int) Math.min(112800L, j5);
                        if (fdiVar.b != 0) {
                            rsjVar.a = 0L;
                            return 1;
                        }
                        edi ediVar = fmnVar.b;
                        ediVar.G(iMin);
                        fdqVar.k();
                        fdqVar.i(ediVar.a, 0, iMin);
                        int i4 = ediVar.b;
                        int i5 = ediVar.c;
                        while (true) {
                            if (i4 >= i5) {
                                j3 = -9223372036854775807L;
                                break;
                            }
                            if (ediVar.a[i4] == 71) {
                                long jB = fki.B(ediVar, i4, i3);
                                if (jB != -9223372036854775807L) {
                                    j3 = jB;
                                    break;
                                }
                            }
                            i4++;
                        }
                        fmnVar.f = j3;
                        fmnVar.d = true;
                        return 0;
                    }
                    int iMin2 = (int) Math.min(112800L, j5);
                    long j7 = j5 - iMin2;
                    if (fdiVar.b != j7) {
                        rsjVar.a = j7;
                        return 1;
                    }
                    edi ediVar2 = fmnVar.b;
                    ediVar2.G(iMin2);
                    fdqVar.k();
                    fdqVar.i(ediVar2.a, 0, iMin2);
                    int i6 = ediVar2.b;
                    int i7 = ediVar2.c;
                    int i8 = i7 - 188;
                    while (true) {
                        if (i8 < i6) {
                            j4 = -9223372036854775807L;
                            break;
                        }
                        byte[] bArr = ediVar2.a;
                        int i9 = -4;
                        int i10 = 0;
                        while (true) {
                            if (i9 > 4) {
                                break;
                            }
                            int i11 = (i9 * 188) + i8;
                            if (i11 < i6 || i11 >= i7 || bArr[i11] != 71) {
                                i10 = 0;
                            } else {
                                i10++;
                                if (i10 == 5) {
                                    long jB2 = fki.B(ediVar2, i8, i3);
                                    if (jB2 != -9223372036854775807L) {
                                        j4 = jB2;
                                        break;
                                    }
                                }
                            }
                            i9++;
                        }
                        i8--;
                    }
                    fmnVar.g = j4;
                    fmnVar.e = true;
                    return 0;
                }
            }
            if (this.q) {
                j = j5;
                j2 = 0;
            } else {
                this.q = true;
                fmn fmnVar2 = this.p;
                j2 = 0;
                long j8 = fmnVar2.h;
                if (j8 != -9223372036854775807L) {
                    j = j5;
                    fdf fdfVar = new fdf(new fda(), new fmm(this.j, fmnVar2.a), j8, j8 + 1, 0L, j, 188L, 940);
                    this.t = fdfVar;
                    this.f.r(fdfVar.a);
                } else {
                    j = j5;
                    this.f.r(new fee(-9223372036854775807L));
                }
            }
            if (this.r) {
                this.r = false;
                d(j2, j2);
                if (fdiVar.b != j2) {
                    rsjVar.a = j2;
                    return 1;
                }
            }
            fdf fdfVar2 = this.t;
            if (fdfVar2 != null && fdfVar2.b()) {
                return fdfVar2.f(fdqVar, rsjVar);
            }
        } else {
            j = j5;
        }
        edi ediVar3 = this.m;
        byte[] bArr2 = ediVar3.a;
        if (9400 - ediVar3.b < 188) {
            int iA = ediVar3.a();
            if (iA > 0) {
                System.arraycopy(bArr2, ediVar3.b, bArr2, 0, iA);
            }
            ediVar3.I(bArr2, iA);
        }
        while (ediVar3.a() < 188) {
            int i12 = ediVar3.c;
            int iA2 = fdqVar.a(bArr2, i12, 9400 - i12);
            if (iA2 == -1) {
                int i13 = 0;
                while (true) {
                    SparseArray sparseArray = this.c;
                    if (i13 >= sparseArray.size()) {
                        return -1;
                    }
                    fms fmsVar = (fms) sparseArray.valueAt(i13);
                    if (fmsVar instanceof fmf) {
                        fmf fmfVar = (fmf) fmsVar;
                        boolean z3 = !z2 || fmfVar.d();
                        if (fmfVar.b == 3 && fmfVar.c == -1 && ((!z2 || !(fmfVar.a instanceof flp)) && z3)) {
                            fmfVar.a(new edi(), 1);
                        }
                    }
                    i13++;
                }
            } else {
                ediVar3.J(i12 + iA2);
            }
        }
        int i14 = ediVar3.b;
        int i15 = ediVar3.c;
        int iA3 = fki.A(ediVar3.a, i14, i15);
        ediVar3.K(iA3);
        int i16 = iA3 + 188;
        if (i16 > i15) {
            int i17 = this.s + (iA3 - i14);
            this.s = i17;
            if (i2 != 2) {
                i2 = 1;
            } else {
                if (i17 > 376) {
                    throw new eaf("Cannot find sync byte. Most likely not a Transport Stream.", null, true, 1);
                }
                i2 = 2;
            }
            i = 0;
        } else {
            i = 0;
            this.s = 0;
        }
        int i18 = ediVar3.c;
        if (i16 > i18) {
            return i;
        }
        int iE = ediVar3.e();
        if ((8388608 & iE) != 0) {
            ediVar3.K(i16);
            return i;
        }
        int i19 = (4194304 & iE) != 0 ? 1 : 0;
        int i20 = iE & 32;
        int i21 = (iE >> 8) & 8191;
        fms fmsVar2 = (iE & 16) != 0 ? (fms) this.c.get(i21) : null;
        if (fmsVar2 == null) {
            ediVar3.K(i16);
            return 0;
        }
        if (i2 != 2) {
            int i22 = iE & 15;
            SparseIntArray sparseIntArray = this.n;
            int i23 = sparseIntArray.get(i21, i22 - 1);
            sparseIntArray.put(i21, i22);
            if (i23 == i22) {
                ediVar3.K(i16);
                return 0;
            }
            if (i22 != ((i23 + 1) & 15)) {
                fmsVar2.c();
            }
        }
        if (i20 != 0) {
            int iJ = ediVar3.j();
            i19 |= (ediVar3.j() & 64) != 0 ? 2 : 0;
            ediVar3.L(iJ - 1);
        }
        boolean z4 = this.h;
        if (i2 == 2 || z4 || !this.e.get(i21, false)) {
            ediVar3.J(i16);
            fmsVar2.a(ediVar3, i19);
            ediVar3.J(i18);
        }
        if (i2 != 2 && !z4 && this.h && j != -1) {
            this.r = true;
        }
        ediVar3.K(i16);
        return 0;
    }

    @Override // defpackage.fdp
    public final /* synthetic */ List x() {
        return ImmutableList.of();
    }

    @Override // defpackage.fdp
    public final void y(fdr fdrVar) {
        if (this.l == 0) {
            fdrVar = new fjj(fdrVar, this.o);
        }
        this.f = fdrVar;
    }

    public fmq(int i, int i2, fjg fjgVar, edo edoVar, zuw zuwVar) {
        this.k = zuwVar;
        this.a = i;
        this.l = i2;
        this.o = fjgVar;
        this.b = Collections.singletonList(edoVar);
        this.m = new edi(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.d = sparseBooleanArray;
        this.e = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.c = sparseArray;
        this.n = new SparseIntArray();
        this.p = new fmn();
        this.f = fdr.F;
        this.j = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i3 = 0; i3 < size; i3++) {
            this.c.put(sparseArray2.keyAt(i3), (fms) sparseArray2.valueAt(i3));
        }
        this.c.put(0, new fmk(new fmo(this)));
        this.i = null;
    }

    @Override // defpackage.fdp
    public final void c() {
    }

    @Override // defpackage.fdp
    public final /* synthetic */ void f() {
    }
}
